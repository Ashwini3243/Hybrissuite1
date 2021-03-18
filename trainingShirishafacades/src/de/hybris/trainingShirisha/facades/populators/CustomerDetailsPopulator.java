package de.hybris.trainingShirisha.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.trainingShirisha.core.model.CustomerDetailsModel;
import de.hybris.trainingShirisha.facades.product.data.CustomerDetailsData;

public class CustomerDetailsPopulator implements Populator<CustomerDetailsModel, CustomerDetailsData> {
    @Override
    public void populate(CustomerDetailsModel source, CustomerDetailsData target) throws ConversionException {
        target.setId(source.getId());
        target.setName(source.getName());
        target.setPhoneNumber(source.getPhoneNumber());
        target.setCustomerCreatedTime(source.getCustomerCreatedTime());
        target.setIsNewCustomer(source.getIsNewCustomer());
    }
}
