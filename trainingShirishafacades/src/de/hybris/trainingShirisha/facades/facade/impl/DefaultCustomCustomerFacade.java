package de.hybris.trainingShirisha.facades.facade.impl;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.core.model.user.CustomerModel;
import org.apache.log4j.Logger;

public class DefaultCustomCustomerFacade extends DefaultCustomerFacade {
    private static final Logger LOG = Logger.getLogger(DefaultCustomCustomerFacade.class);
    @Override
    protected void setCommonPropertiesForRegister(RegisterData registerData, CustomerModel customerModel) {
        LOG.info("in custom customer facade ");
        customerModel.setIsNewBusinessUser(registerData.getIsNewBusinessUser());
        LOG.info("in custom customer facade "+customerModel.getIsNewBusinessUser());
        super.setCommonPropertiesForRegister(registerData, customerModel);
    }
}
