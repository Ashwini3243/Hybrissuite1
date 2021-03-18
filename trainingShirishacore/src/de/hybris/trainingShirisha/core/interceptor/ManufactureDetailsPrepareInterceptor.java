package de.hybris.trainingShirisha.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import org.apache.log4j.Logger;

public class ManufactureDetailsPrepareInterceptor implements PrepareInterceptor {

    private static final Logger LOG = Logger.getLogger(ManufactureDetailsPrepareInterceptor.class);

    @Override
    public void onPrepare(Object o, InterceptorContext interceptorContext) throws InterceptorException {

        LOG.info("Prepare interceptor invoked::");
        if(o instanceof ManufactureDetailsModel){
            final ManufactureDetailsModel manufactureDetailsModel = (ManufactureDetailsModel) o;
            String name= manufactureDetailsModel.getName();
            String modifiedName = "Manu"+name;
            manufactureDetailsModel.setName(modifiedName);
        }
    }
}
