package de.hybris.trainingShirisha.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsAuditModel;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;

import java.util.Date;

public class AuditingManufactureDetailsRemoveInterceptor implements RemoveInterceptor {

    @Override
    public void onRemove(Object o, InterceptorContext interceptorContext) throws InterceptorException {

        if(o instanceof ManufactureDetailsModel){

            final ManufactureDetailsModel manufactureDetailsModel = (ManufactureDetailsModel) o;
            final ManufactureDetailsAuditModel manufactureDetailsAuditModel = interceptorContext.getModelService().create(ManufactureDetailsAuditModel.class);
            manufactureDetailsAuditModel.setName(manufactureDetailsModel.getName());
            manufactureDetailsAuditModel.setCurrentTime(new Date());
            interceptorContext.registerElementFor(manufactureDetailsAuditModel, PersistenceOperation.DELETE);
        }
    }
}
