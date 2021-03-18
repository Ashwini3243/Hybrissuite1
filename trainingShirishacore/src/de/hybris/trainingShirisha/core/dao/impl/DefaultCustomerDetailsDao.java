package de.hybris.trainingShirisha.core.dao.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.trainingShirisha.core.dao.CustomerDetailsDao;
import de.hybris.trainingShirisha.core.model.CustomerCreatedDaysModel;
import de.hybris.trainingShirisha.core.model.CustomerDetailsModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class DefaultCustomerDetailsDao implements CustomerDetailsDao {

    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CustomerDetailsModel> getLast10DaysCustomerDetails() {

        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -10);
        final Date preDate = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String oldDateFormat = dateFormat.format(preDate);

        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {"+CustomerDetailsModel.PK+"}");
        builder.append("FROM {"+CustomerDetailsModel._TYPECODE+"}");
        builder.append("WHERE {"+CustomerDetailsModel.CUSTOMERCREATEDTIME+"}");
        builder.append(">=?oldDate");

        final Map<String, Object> map = new HashMap<>();
        map.put("oldDate", oldDateFormat);

        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(builder.toString());
        searchQuery.addQueryParameters(map);
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        System.out.println("==============Size of customerDetails "+searchResult.getCount());
        return searchResult.getResult();
    }

    @Override
    public List<CustomerDetailsModel> findAllCustomers10DaysOld(Date preDate) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String oldDate = dateFormat.format(preDate);

        final StringBuilder query = new StringBuilder("SELECT {pk} FROM {CustomerDetails} WHERE {customerCreatedTime}>=?oldDate");
        final Map<String, Object> params = new HashMap<String, Object>();
        params.put("oldDate", oldDate);

        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        searchQuery.addQueryParameters(params);
        searchQuery.setResultClassList(Collections.singletonList(CustomerDetailsModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        System.out.println("==================Size of customerDetails "+searchResult.getCount());
        return searchResult.getResult();
    }

    @Override
    public List<CustomerModel> findLast10DaysCustomers(Date preDate) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String oldDate = dateFormat.format(preDate);

        final StringBuilder query = new StringBuilder();
        query.append("SELECT {" +CustomerModel.PK+"}");
        query.append("FROM {" +CustomerModel._TYPECODE+"}");
        query.append("WHERE {" +CustomerModel.CREATIONTIME+"}");
        query.append(">=?oldDate");
        final Map<String, Object> params = new HashMap<String, Object>();
        params.put("oldDate", oldDate);

        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        searchQuery.addQueryParameters(params);
        searchQuery.setResultClassList(Collections.singletonList(CustomerDetailsModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        System.out.println("======Size of customerDetails===== "+searchResult.getCount());
        return searchResult.getResult();
    }

    @Override
    public List<CustomerModel> getLast10DaysCustomers() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -10);
        final Date preDate = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String oldDateFormat = dateFormat.format(preDate);

        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {"+CustomerModel.PK+"}");
        builder.append("FROM {"+CustomerModel._TYPECODE+"}");
        builder.append("WHERE {"+CustomerModel.CREATIONTIME+"}");
        builder.append(">=?oldDate");

        final Map<String, Object> map = new HashMap<>();
        map.put("oldDate", oldDateFormat);

        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(builder.toString());
        searchQuery.addQueryParameters(map);
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        System.out.println("==============Size of customerDetails "+searchResult.getCount());
        return searchResult.getResult();
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

}
