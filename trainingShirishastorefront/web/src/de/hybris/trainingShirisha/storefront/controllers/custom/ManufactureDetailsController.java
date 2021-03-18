package de.hybris.trainingShirisha.storefront.controllers.custom;


import de.hybris.trainingShirisha.core.interceptor.ManufactureDetailsValidateInterceptor;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import de.hybris.trainingShirisha.core.service.ManufactureDetailsService;
import de.hybris.trainingShirisha.facades.facade.ManufactureDetailsFacade;
import de.hybris.trainingShirisha.facades.product.data.ManufactureDetailsData;
import de.hybris.trainingShirisha.storefront.controllers.ControllerConstants;
import de.hybris.trainingShirisha.storefront.cusom.form.ManufactureDetailsForm;
import de.hybris.trainingShirisha.storefront.util.custom.ManufactureDetailsUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class ManufactureDetailsController {

    private static final Logger LOG = Logger.getLogger(ManufactureDetailsController.class);

    @Resource(name = "manufactureDetailsFacade")
    private ManufactureDetailsFacade manufactureDetailsFacade;

    @Resource(name = "manufactureDetailsService")
    private ManufactureDetailsService manufactureDetailsService;

    @Resource(name = "manufactureDetailsUtil")
    private ManufactureDetailsUtil manufactureDetailsUtil;



    /**
     * Gets the ManufactureDetails with the specified id.
     * @param id the id of the Manufacture
     * @param model
     * @return the {@link ControllerConstants.Views.Pages.Manufacture}
     */
    @RequestMapping(value = "/manufactureData/{id}", method = RequestMethod.GET)
    public String manufactureDetails(@PathVariable(value = "id") final int id, final Model model) {
        StringUtils.isNotBlank(Integer.toString(id));
        final ManufactureDetailsData manufactureDetailsData = manufactureDetailsFacade.getManufactureDetails(id);
        model.addAttribute("manufactureData",manufactureDetailsData);
        LOG.info("In controller getting Manufacture details data from Facade::"+manufactureDetailsData);
        return ControllerConstants.Views.Pages.Manufacture.ManufactureDetails;
    }

    /**
     * Gets the all ManufactureDetails
     * @param model
     * @return
     */
    @RequestMapping(value = "/allManufactureData", method=RequestMethod.GET)
    public String allManufactureDetails(final Model model){
        final List<ManufactureDetailsData> allManufactureDetails = manufactureDetailsFacade.getAllManufacturerDetails();
        model.addAttribute("allManufactureData",allManufactureDetails);
        LOG.info("In controller:: "+allManufactureDetails.get(1));
        return ControllerConstants.Views.Pages.Manufacture.AllManufactureDetails;
    }

    /**
     * Gets the ManufactureDetails with the specified id and name.
     * @param id
     * @param name
     * @param model
     * @return
     */
    @RequestMapping(value = "/manufactureDataByIdAndName/{id}/{name}", method=RequestMethod.GET)
    public String manufactureDetailsByIdAndName(@PathVariable("id") final int id, @PathVariable("name") final String name, Model model){
        final ManufactureDetailsData detailsData = manufactureDetailsFacade.getManufactureDetailsByIdAndName(id, name);
        model.addAttribute("dataByIdAndName", detailsData);
        return ControllerConstants.Views.Pages.Manufacture.ManufactureDetailsByIdAndName;
    }


    @RequestMapping(value = "/allManufactureData/{currentPage}", method=RequestMethod.GET)
    public String allManufactureDetailsPagination(@PathVariable("currentPage") final int currentPage, final Model model){
        final List<ManufactureDetailsData> allPaginationData = manufactureDetailsFacade.getAllManufacturerDetailsWithPagination(currentPage);
        model.addAttribute("paginationData",allPaginationData);
        return ControllerConstants.Views.Pages.Manufacture.ManufacturePaginationData;
    }



    //Interceptors task
    @RequestMapping(value = "/getManufactureDetailsForm", method = RequestMethod.GET)
    public String getManufactureDetailsForm(Model model){
        ManufactureDetailsForm manufactureDetailsForm = new ManufactureDetailsForm();
        model.addAttribute("manufactureDetailsForm", manufactureDetailsForm);
        return ControllerConstants.Views.Pages.Manufacture.ManufactureDetailsForm;
    }

     @RequestMapping(value = "/manufactureDetailsSave", method = RequestMethod.POST)
    public String saveManufactureDetailsData(ManufactureDetailsForm manufactureDetailsForm, Model model){
        final ManufactureDetailsModel manufactureDetailsModel = manufactureDetailsUtil.convertFormToManufactureModel(manufactureDetailsForm);
        String message = manufactureDetailsService.saveManufactureDetailsData(manufactureDetailsModel);
        model.addAttribute("result",message);
        return ControllerConstants.Views.Pages.Manufacture.ManufactureDetailsSavedSuccess;
    }


    @RequestMapping(value = "/removeManufactureData/{id}", method = RequestMethod.GET)
    public String remManufactureDetails(@PathVariable(value = "id") final int id, final Model model) {
        manufactureDetailsService.removeManufactureDetailsData(id);
        return ControllerConstants.Views.Pages.Manufacture.RemoveManufactureDetails;
    }




    /*@RequestMapping(value = "/getManufactureDetailsForm", method = RequestMethod.GET)
    public String getManufactureDetailsForm(Model model){
        ManufactureDetailsModel manufactureDetailsModel =new ManufactureDetailsModel();
        model.addAttribute("userEnteredDetails",manufactureDetailsModel);
        return ControllerConstants.Views.Pages.Manufacture.ManufactureDetailsForm;
    }*/

   /* @RequestMapping(value = "/manufactureDetails", method = RequestMethod.POST)
    public String saveManufactureDetailsData(@ModelAttribute("userEnteredDetails") ManufactureDetailsModel manufactureDetailsModel, Model model){
        manufactureDetailsService.saveManufactureDetailsData(manufactureDetailsModel);
        model.addAttribute("result","data saved successfully!!!");
        return ControllerConstants.Views.Pages.Manufacture.ManufactureDetailsSavedSuccess;
    }*/



   /* @ModelAttribute("country")
    public List<String> countryList() {
        List<String> countries = new ArrayList<String>();
        countries.add("IN");
        countries.add("US");
        countries.add("AZ");
        countries.add("AW");
        countries.add("BB");
        countries.add("VG");
        return countries;
    }*/

}
