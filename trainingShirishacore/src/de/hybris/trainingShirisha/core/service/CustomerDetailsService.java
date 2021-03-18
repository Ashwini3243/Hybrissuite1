package de.hybris.trainingShirisha.core.service;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.trainingShirisha.core.model.CustomerDetailsModel;

import java.util.List;

public interface CustomerDetailsService {
    List<CustomerDetailsModel> fetchCustomerDetails();
    List<CustomerModel> getLast10DaysCustomers();
}
