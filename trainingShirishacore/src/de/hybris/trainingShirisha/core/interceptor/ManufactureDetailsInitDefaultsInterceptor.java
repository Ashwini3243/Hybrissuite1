package de.hybris.trainingShirisha.core.interceptor;

import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;

public class ManufactureDetailsInitDefaultsInterceptor implements InitDefaultsInterceptor {

    @Override
    public void onInitDefaults(Object o, InterceptorContext interceptorContext) throws InterceptorException {

        if(o instanceof ManufactureDetailsModel){

            final ManufactureDetailsModel detailsModel = (ManufactureDetailsModel) o;
            detailsModel.setId(1111);
            detailsModel.setName("ram");
        }
    }
}
