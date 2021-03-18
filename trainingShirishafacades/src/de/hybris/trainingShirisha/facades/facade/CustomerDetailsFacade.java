package de.hybris.trainingShirisha.facades.facade;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.trainingShirisha.core.model.CustomerDetailsModel;
import de.hybris.trainingShirisha.facades.product.data.CustomerDetailsData;

import java.util.List;

public interface CustomerDetailsFacade {
    List<CustomerDetailsData> getCustomerDetails();
    List<CustomerData> getLast10DaysCustomers();
}
