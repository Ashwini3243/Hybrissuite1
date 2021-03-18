package de.hybris.trainingShirisha.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.util.regex.Pattern;

public class ManufactureDetailsValidateInterceptor implements ValidateInterceptor {

    private static final Logger LOG = Logger.getLogger(ManufactureDetailsValidateInterceptor.class);

    @Override
    public void onValidate(Object o, InterceptorContext interceptorContext) throws InterceptorException {

        if(o instanceof ManufactureDetailsModel){
            final ManufactureDetailsModel manufactureDetails = (ManufactureDetailsModel) o;
            if(!StringUtils.isAlphanumeric(manufactureDetails.getName())){
                LOG.info("Give proper name::");
                throw new InterceptorException("Manufacture details name cannot have alphanumeric");
            }

        }
    }
}
