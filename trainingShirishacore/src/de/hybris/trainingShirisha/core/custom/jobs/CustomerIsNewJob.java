package de.hybris.trainingShirisha.core.custom.jobs;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingShirisha.core.dao.CustomerDetailsDao;
import de.hybris.trainingShirisha.core.model.CustomerCreatedCronJobModel;
import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CustomerIsNewJob extends AbstractJobPerformable<CustomerCreatedCronJobModel> {

    private final static Logger LOG = Logger.getLogger(CustomerIsNewOrNotJob.class);

    private CustomerDetailsDao customerDetailsDao;
    private ModelService modelService;

    @Override
    public PerformResult perform(CustomerCreatedCronJobModel customerCreatedCronJobModel) {
        LOG.info("CustomerIsNewOrNotJob class is called::");

        final int noOfDaysOldToConsider= customerCreatedCronJobModel.getNoOfDaysToConsider();
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -noOfDaysOldToConsider);
        final Date preDate = cal.getTime();
        final List<CustomerModel> customerModelList = customerDetailsDao.findLast10DaysCustomers(preDate);
        if(customerModelList!=null){
            System.out.println("======iterating last 10 days customerDetails=====");
            for (CustomerModel customerModel:customerModelList)
            {
                customerModel.setIsNewCustomer(Boolean.TRUE);
                modelService.save(customerModel);

            }

        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

    }

    public CustomerDetailsDao getCustomerDetailsDao() {
        return customerDetailsDao;
    }

    public void setCustomerDetailsDao(CustomerDetailsDao customerDetailsDao) {
        this.customerDetailsDao = customerDetailsDao;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

}
