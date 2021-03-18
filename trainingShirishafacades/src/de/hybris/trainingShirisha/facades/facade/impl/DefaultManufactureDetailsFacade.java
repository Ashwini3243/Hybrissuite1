package de.hybris.trainingShirisha.facades.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import de.hybris.trainingShirisha.core.service.ManufactureDetailsService;
import de.hybris.trainingShirisha.facades.facade.ManufactureDetailsFacade;
import de.hybris.trainingShirisha.facades.product.data.ManufactureDetailsData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/**
 * Default implementation of the {@link ManufactureDetailsFacade}.
 */
public class DefaultManufactureDetailsFacade implements ManufactureDetailsFacade {

    private static final Logger LOG = Logger.getLogger(DefaultManufactureDetailsFacade.class);

    private ManufactureDetailsService manufactureDetailsService;
    private Converter<ManufactureDetailsModel, ManufactureDetailsData> manufactureDetailsConverter;

    @Override
    public ManufactureDetailsData getManufactureDetails(final int id) {

        final ManufactureDetailsModel manufactureDetailsModel = getManufactureDetailsService().getManufactureDetailsForId(id);
        LOG.info("in facade getting manufacture details model from service::"+manufactureDetailsModel);
        final ManufactureDetailsData manufactureDetailsData = getManufactureDetailsConverter().convert(manufactureDetailsModel);
        LOG.info("in facade getting manufacture details data::"+manufactureDetailsData);
        return manufactureDetailsData;
    }

    @Override
    public List<ManufactureDetailsData> getAllManufacturerDetails() {
        final List<ManufactureDetailsModel> manufactureDetailsModels = getManufactureDetailsService().getManufactureDetails();
        final List<ManufactureDetailsData> manufactureDetailsData = getManufactureDetailsConverter().convertAll(manufactureDetailsModels);
        return manufactureDetailsData;
    }

    @Override
    public ManufactureDetailsData getManufactureDetailsByIdAndName(int id, String name) {
        final ManufactureDetailsModel manufactureDetailsModel = getManufactureDetailsService().getManufactureDetailsForIdandName(id, name);
        final ManufactureDetailsData manufactureDetailsData = getManufactureDetailsConverter().convert(manufactureDetailsModel);
        return manufactureDetailsData;
    }

    @Override
    public List<ManufactureDetailsData> getAllManufacturerDetailsWithPagination(int currentPage) {
        final List<ManufactureDetailsModel> manufactureDetailsModels = getManufactureDetailsService().getManufactureDetailsWithPagination(currentPage);
        final List<ManufactureDetailsData> manufactureDetailsData = getManufactureDetailsConverter().convertAll(manufactureDetailsModels);
        return manufactureDetailsData;
    }

    public ManufactureDetailsService getManufactureDetailsService() {
        return manufactureDetailsService;
    }

    @Required
    public void setManufactureDetailsService(ManufactureDetailsService manufactureDetailsService) {
        this.manufactureDetailsService = manufactureDetailsService;
    }

    public Converter<ManufactureDetailsModel, ManufactureDetailsData> getManufactureDetailsConverter() {
        return manufactureDetailsConverter;
    }

    @Required
    public void setManufactureDetailsConverter(Converter<ManufactureDetailsModel, ManufactureDetailsData> manufactureDetailsConverter) {
        this.manufactureDetailsConverter = manufactureDetailsConverter;
    }

}
