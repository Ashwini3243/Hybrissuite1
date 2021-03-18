package de.hybris.trainingShirisha.core.dao.impl;

import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.servicelayer.data.SearchPageData;
import de.hybris.platform.core.servicelayer.data.SortData;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchParameter;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchService;
import de.hybris.platform.servicelayer.search.paginated.constants.SearchConstants;
import de.hybris.platform.servicelayer.search.paginated.util.PaginatedSearchUtils;
import de.hybris.trainingShirisha.core.dao.ManufactureDetailsDao;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
import java.util.*;

/**
 *  Default implementation of the {@link ManufactureDetailsDao}
 */
public class DefaultManufactureDetailsDao implements ManufactureDetailsDao {

    private FlexibleSearchService flexibleSearchService;

    @Resource
    private PaginatedFlexibleSearchService paginatedFlexibleSearchService;

    @Override
    public ManufactureDetailsModel findManufactureDetailsById(final int id) {

       /* final String query = "SELECT {"+ManufactureDetailsModel.PK+"}"+
                "FROM {"+ManufactureDetailsModel._TYPECODE+"}"+
                "WHERE {"+ManufactureDetailsModel.ID+"}=?id";*/

        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {"+ManufactureDetailsModel.PK+"}");
        builder.append("FROM {"+ManufactureDetailsModel._TYPECODE+"}");
        builder.append("WHERE {"+ManufactureDetailsModel.ID+"}=?id");

        final FlexibleSearchQuery fQuery =new FlexibleSearchQuery(builder.toString());
        /*final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);*/
        StringUtils.isNotBlank(Integer.toString(id));
        fQuery.addQueryParameter(ManufactureDetailsModel.ID, id);
        final SearchResult<ManufactureDetailsModel> result = getFlexibleSearchService().search(fQuery);

        final int resultCount = result.getTotalCount();
        if (resultCount == 0)
        {
            throw new UnknownIdentifierException("Manufacture Details with id '" + id + "' not found!");
        }
        else if (resultCount > 1)
        {
            throw new AmbiguousIdentifierException("Manufacture details with id'" + id + "' is not unique, " + resultCount + " details found!");
        }
        return  result.getResult().get(0);
    }

    @Override
    public List<ManufactureDetailsModel> getAllManufactureDetails() {

        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {"+ManufactureDetailsModel.PK+"}");
        builder.append("FROM {"+ManufactureDetailsModel._TYPECODE+"}");

        FlexibleSearchQuery query = new FlexibleSearchQuery(builder.toString());
        final SearchResult<ManufactureDetailsModel> result = getFlexibleSearchService().search(query);

        return result.getResult();
    }

    @Override
    public ManufactureDetailsModel findManufactureDetailsByIdandName(int id, String name) {

        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {"+ManufactureDetailsModel.PK+"}");
        builder.append("FROM {"+ManufactureDetailsModel._TYPECODE+"}");
        builder.append("WHERE {"+ManufactureDetailsModel.ID+"}");
        builder.append("=?"+ManufactureDetailsModel.ID);
        builder.append(" AND {"+ManufactureDetailsModel.NAME+"}");
        builder.append("=?"+ManufactureDetailsModel.NAME);

        String manufactureId = Integer.toString(id);

        final Map<String, String> params = new HashMap<>();
        params.put("id", manufactureId);
        params.put("name", name);

        FlexibleSearchQuery query = new FlexibleSearchQuery(builder.toString(), params);
        final SearchResult<ManufactureDetailsModel> result = getFlexibleSearchService().search(query);
        return result.getResult().get(0);
    }

   /* @Override
    public List<ManufactureDetailsModel> getAllManufactureDetailsWithPagination(int currentPage) {
        final int range = 10;
        int start=currentPage*range;
        int total;

        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {"+ManufactureDetailsModel.PK+"}");
        builder.append("FROM {"+ManufactureDetailsModel._TYPECODE+"}");
        builder.append("ORDER BY {"+ManufactureDetailsModel.ID+"}");

        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(builder.toString());
        fQuery.setNeedTotal(true);
        fQuery.setCount(range);
        do{
            fQuery.setStart(start);
            final SearchResult<ManufactureDetailsModel> result = getFlexibleSearchService().search(fQuery);
            total = result.getTotalCount();
            start+=range;
            return result.getResult();
        }while(start<total);
    }*/

    public List<ManufactureDetailsModel> getAllManufactureDetailsWithPagination(int currentPage) {
        final int pageSize = 10;
        final boolean needsTotal = true;

        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {" + ManufactureDetailsModel.PK + "}");
        builder.append("FROM {" + ManufactureDetailsModel._TYPECODE + "}");
        builder.append("ORDER BY {"+ManufactureDetailsModel.ID+"}");

        PaginatedFlexibleSearchParameter parameter = new PaginatedFlexibleSearchParameter();
        FlexibleSearchQuery query = new FlexibleSearchQuery(builder.toString());
        final SearchPageData searchPageData = PaginatedSearchUtils.createSearchPageDataWithPagination(
                pageSize,
                currentPage,
                needsTotal);
        parameter.setFlexibleSearchQuery(query);
        parameter.setSearchPageData(searchPageData);
       /* parameter.setSortCodeToQueryAlias(sortMap);*/
        SearchPageData<ManufactureDetailsModel> result = getPaginatedFlexibleSearchService().search(parameter);
        return result.getResults();
    }


    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    @Required
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public PaginatedFlexibleSearchService getPaginatedFlexibleSearchService() {
        return paginatedFlexibleSearchService;
    }

    @Required
    public void setPaginatedFlexibleSearchService(PaginatedFlexibleSearchService paginatedFlexibleSearchService) {
        this.paginatedFlexibleSearchService = paginatedFlexibleSearchService;
    }

}
