package de.hybris.trainingShirisha.core.custom.jobs;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingShirisha.core.dao.CustomerDetailsDao;
import de.hybris.trainingShirisha.core.model.CustomerCreatedDaysModel;
import org.apache.log4j.Logger;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CustomerIsNewOrNotJob extends AbstractJobPerformable<CustomerCreatedDaysModel> {
    private final static Logger log = Logger.getLogger(CustomerIsNewOrNotJob.class);
    private CustomerDetailsDao customerDetailsDao;
    private ModelService modelService;
    @Override
    public PerformResult perform(CustomerCreatedDaysModel isNewCustomerCronJobModel) {
    final int noOfDaysOld = isNewCustomerCronJobModel.getNoOfDaysToConsider();
        final Calendar cal = Calendar.getInstance();
        log.info(Calendar.DAY_OF_MONTH);
        log.info(Calendar.DATE);
        log.info(noOfDaysOld);
        cal.add(Calendar.DAY_OF_MONTH, -noOfDaysOld);
        final Date oldDate1 = cal.getTime();
        if (isNewCustomerCronJobModel.getCronJobHistoryEntries() == null) {
            final List<CustomerModel> isNewCustomerList = getCustomerDetailsDao().findLast10DaysCustomers(oldDate1);
            log.debug("customers older than specified days size:" + isNewCustomerList.size());
            if (isNewCustomerList.size() != 0) {
                for (CustomerModel i : isNewCustomerList) {
                    log.info("in loop before" + i.getIsNewCustomer());
                    i.setIsNewCustomer(true);
                    modelService.save(i);
                    log.info("in loop after" + i.getIsNewCustomer());
                }
            }
        } else {
            Date lastTriggerCronJobDate = isNewCustomerCronJobModel.getCronJobHistoryEntries().get(0).getEndTime();
            log.info("last date" + lastTriggerCronJobDate);
            final List<CustomerModel> isNewCustomerList = getCustomerDetailsDao().findLast10DaysCustomers(lastTriggerCronJobDate);
            log.debug("customers older than specified days size:" + isNewCustomerList.size());
            if (isNewCustomerList.size() != 0) {
                for (CustomerModel i : isNewCustomerList) {
                    log.info("in loop before" + i.getIsNewCustomer());
                    i.setIsNewCustomer(true);
                    modelService.save(i);
                    log.info("in loop after" + i.getIsNewCustomer());
                }
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
