package de.hybris.trainingShirisha.core.service.impl;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import de.hybris.platform.servicelayer.interceptor.impl.InterceptorExecutionPolicy;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.session.SessionExecutionBody;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.trainingShirisha.core.dao.ManufactureDetailsDao;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import de.hybris.trainingShirisha.core.service.ManufactureDetailsService;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 *  Default implementation of the {@link ManufactureDetailsService}
 */
public class DefaultManufactureDetailsService implements ManufactureDetailsService {

    private static final Logger LOG = Logger.getLogger(DefaultManufactureDetailsService.class);

    private ManufactureDetailsDao manufactureDetailsDao;

    private ModelService modelService;

    private SessionService sessionService;


    @Override
    public ManufactureDetailsModel getManufactureDetailsForId(int id) {
       final ManufactureDetailsModel manufactureDetailsModel = manufactureDetailsDao.findManufactureDetailsById(id);
       LOG.info("in service getting the manufacture details model object from dao");
        return manufactureDetailsModel;
    }

    @Override
    public List<ManufactureDetailsModel> getManufactureDetails() {
        final List<ManufactureDetailsModel> manufactureDetailsModels = manufactureDetailsDao.getAllManufactureDetails();
        return manufactureDetailsModels;
    }

    @Override
    public ManufactureDetailsModel getManufactureDetailsForIdandName(int id, String name) {
        final ManufactureDetailsModel manufactureDetailsModel = manufactureDetailsDao.findManufactureDetailsByIdandName(id, name);
        return manufactureDetailsModel;
    }

    @Override
    public List<ManufactureDetailsModel> getManufactureDetailsWithPagination(int currentPage) {
        final List<ManufactureDetailsModel> manufactureDetailsModels = manufactureDetailsDao.getAllManufactureDetailsWithPagination(currentPage);
        return manufactureDetailsModels;
    }


    //Interceptors
    @Override
    public String saveManufactureDetailsData(ManufactureDetailsModel manufactureDetailsModel) {

        //disable prepare and validate interceptors
        final Map<String, Object> params1 = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_TYPES,
                ImmutableSet.of(InterceptorExecutionPolicy.InterceptorType.VALIDATE, InterceptorExecutionPolicy.InterceptorType.PREPARE));
        sessionService.executeInLocalViewWithParams(params1, new SessionExecutionBody()
        {
            @Override
            public void executeWithoutResult()
            {
                getModelService().save(manufactureDetailsModel);
            }
        });
        return "Manufacturer data saved successfully!!!";
    }


    @Override
    public void removeManufactureDetailsData(int id) {

        //disable remove interceptor
        final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_BEANS,
                ImmutableSet.of("auditingManufactureDetailsRemoveInterceptor"));
        sessionService.executeInLocalViewWithParams(params, new SessionExecutionBody()
        {
            @Override
            public void executeWithoutResult()
            {
                ManufactureDetailsModel manufactureDetailsModel=  manufactureDetailsDao.findManufactureDetailsById(id);
                getModelService().remove(manufactureDetailsModel);
            }
        });
    }


    @Override
    public void loadManufactureDetailsData(ManufactureDetailsModel manufactureDetailsModel) {

        getModelService().get(manufactureDetailsModel);
    }

    @Override
    public void manufactureInitDefaultsData(ManufactureDetailsModel manufactureDetailsModel) {
        getModelService().initDefaults(manufactureDetailsModel);
    }

    public ManufactureDetailsDao getManufactureDetailsDao() {
        return manufactureDetailsDao;
    }

    public void setManufactureDetailsDao(ManufactureDetailsDao manufactureDetailsDao) {
        this.manufactureDetailsDao = manufactureDetailsDao;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public SessionService getSessionService() {
        return sessionService;
    }

    public void setSessionService(SessionService sessionService) {
        this.sessionService = sessionService;
    }
}
