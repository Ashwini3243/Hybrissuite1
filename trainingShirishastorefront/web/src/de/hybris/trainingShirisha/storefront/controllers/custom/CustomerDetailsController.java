package de.hybris.trainingShirisha.storefront.controllers.custom;


import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.trainingShirisha.core.custom.jobs.CustomerIsNewOrNotJob;
import de.hybris.trainingShirisha.core.model.CustomerDetailsModel;
import de.hybris.trainingShirisha.facades.facade.CustomerDetailsFacade;
import de.hybris.trainingShirisha.facades.product.data.CustomerDetailsData;
import de.hybris.trainingShirisha.facades.product.data.ManufactureDetailsData;
import de.hybris.trainingShirisha.storefront.controllers.ControllerConstants;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/csd")
public class CustomerDetailsController {

    private static final Logger LOG = Logger.getLogger(ManufactureDetailsController.class);

    @Resource(name = "defaultCustomerDetailsFacade")
    private CustomerDetailsFacade customerDetailsFacade;

    @RequestMapping(value = "/last10DaysCustomerData", method= RequestMethod.GET)
    public String allDetails(final Model model){
        final List<CustomerDetailsData> customerDetails = customerDetailsFacade.getCustomerDetails();
        model.addAttribute("lastCustomerDetails",customerDetails);
        LOG.info("customer details In controller:: ");
        return ControllerConstants.Views.Pages.CustomerDetails.Last10DaysCustomerDetails;
    }

    @RequestMapping(value = "/customerData", method= RequestMethod.GET)
    public String last10Days(final Model model){
        final List<CustomerData> customerDetails = customerDetailsFacade.getLast10DaysCustomers();
        model.addAttribute("lastCustomerDetails",customerDetails);
        LOG.info("customer details In controller:: ");
        return ControllerConstants.Views.Pages.CustomerDetails.CustomerDetails;
    }
}
