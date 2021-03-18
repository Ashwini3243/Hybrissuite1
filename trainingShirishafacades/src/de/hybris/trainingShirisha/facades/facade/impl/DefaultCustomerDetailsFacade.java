package de.hybris.trainingShirisha.facades.facade.impl;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingShirisha.core.model.CustomerDetailsModel;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import de.hybris.trainingShirisha.core.service.CustomerDetailsService;
import de.hybris.trainingShirisha.facades.facade.CustomerDetailsFacade;
import de.hybris.trainingShirisha.facades.product.data.CustomerDetailsData;
import de.hybris.trainingShirisha.facades.product.data.ManufactureDetailsData;

import java.util.List;

public class DefaultCustomerDetailsFacade implements CustomerDetailsFacade {

    private CustomerDetailsService customerDetailsService;

    private Converter<CustomerDetailsModel, CustomerDetailsData> customerDetailsDataConverter;

    private Converter<CustomerModel, CustomerData> customerDataConverter;



    @Override
    public List<CustomerDetailsData> getCustomerDetails() {
        final List<CustomerDetailsModel> customerDetailsModels = getCustomerDetailsService().fetchCustomerDetails();
        final List<CustomerDetailsData> customerDetailsData = getCustomerDetailsDataConverter().convertAll(customerDetailsModels);
        return customerDetailsData;
    }

    @Override
    public List<CustomerData> getLast10DaysCustomers() {
        final List<CustomerModel> customerModelList = getCustomerDetailsService().getLast10DaysCustomers();
        final List<CustomerData> customerModels = getCustomerDataConverter().convertAll(customerModelList);
        return customerModels;
    }

    public CustomerDetailsService getCustomerDetailsService() {
        return customerDetailsService;
    }

    public void setCustomerDetailsService(CustomerDetailsService customerDetailsService) {
        this.customerDetailsService = customerDetailsService;

    }

    public Converter<CustomerDetailsModel, CustomerDetailsData> getCustomerDetailsDataConverter() {
        return customerDetailsDataConverter;
    }

    public void setCustomerDetailsDataConverter(Converter<CustomerDetailsModel, CustomerDetailsData> customerDetailsDataConverter) {
        this.customerDetailsDataConverter = customerDetailsDataConverter;
    }

    public Converter<CustomerModel, CustomerData> getCustomerDataConverter() {
        return customerDataConverter;
    }

    public void setCustomerDataConverter(Converter<CustomerModel, CustomerData> customerDataConverter) {
        this.customerDataConverter = customerDataConverter;
    }
}
