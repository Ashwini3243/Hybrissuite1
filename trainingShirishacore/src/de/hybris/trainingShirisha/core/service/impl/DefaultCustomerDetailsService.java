package de.hybris.trainingShirisha.core.service.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.trainingShirisha.core.dao.CustomerDetailsDao;
import de.hybris.trainingShirisha.core.model.CustomerDetailsModel;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import de.hybris.trainingShirisha.core.service.CustomerDetailsService;

import java.util.List;

public class DefaultCustomerDetailsService implements CustomerDetailsService {

    private CustomerDetailsDao customerDetailsDao;

    @Override
    public List<CustomerDetailsModel> fetchCustomerDetails() {
        final List<CustomerDetailsModel> customerDetailsModels = getCustomerDetailsDao().getLast10DaysCustomerDetails();
        return customerDetailsModels;
    }

    @Override
    public List<CustomerModel> getLast10DaysCustomers() {
        final List<CustomerModel> customerModelList = getCustomerDetailsDao().getLast10DaysCustomers();
        return customerModelList;
    }

    public CustomerDetailsDao getCustomerDetailsDao() {
        return customerDetailsDao;
    }

    public void setCustomerDetailsDao(CustomerDetailsDao customerDetailsDao) {
        this.customerDetailsDao = customerDetailsDao;
    }
}
