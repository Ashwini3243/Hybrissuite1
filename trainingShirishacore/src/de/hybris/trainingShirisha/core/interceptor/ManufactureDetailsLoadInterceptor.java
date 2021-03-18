package de.hybris.trainingShirisha.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import org.apache.log4j.Logger;

public class ManufactureDetailsLoadInterceptor implements LoadInterceptor {
    private static final org.apache.log4j.Logger LOG = Logger.getLogger(ManufactureDetailsLoadInterceptor.class);

    @Override
    public void onLoad(Object o, InterceptorContext interceptorContext) throws InterceptorException {
        if(o instanceof ManufactureDetailsModel){
            final ManufactureDetailsModel manufactureDetailsModel = (ManufactureDetailsModel) o;
            manufactureDetailsModel.setName("MDL "+manufactureDetailsModel.getName());
            LOG.info("Load interceptor called::");
        }
    }
}
