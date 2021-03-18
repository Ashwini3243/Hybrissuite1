package de.hybris.trainingShirisha.core.dao;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.trainingShirisha.core.model.CustomerDetailsModel;

import java.util.Date;
import java.util.List;

public interface CustomerDetailsDao {
    List<CustomerDetailsModel> getLast10DaysCustomerDetails();
    List<CustomerDetailsModel> findAllCustomers10DaysOld(final Date oldDate);
    List<CustomerModel> findLast10DaysCustomers(final Date preDate);
    List<CustomerModel> getLast10DaysCustomers();
}
