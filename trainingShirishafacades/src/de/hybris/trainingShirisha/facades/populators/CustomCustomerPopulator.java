package de.hybris.trainingShirisha.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;

public class CustomCustomerPopulator extends CustomerPopulator {
    @Override
    public void populate(CustomerModel source, CustomerData target) {
        super.populate(source, target);
        source.setIsNewCustomer(target.getIsNewCustomer());

    }
}
