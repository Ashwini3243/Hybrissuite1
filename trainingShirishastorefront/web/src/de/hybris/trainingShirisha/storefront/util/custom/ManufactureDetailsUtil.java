package de.hybris.trainingShirisha.storefront.util.custom;

import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import de.hybris.trainingShirisha.storefront.cusom.form.ManufactureDetailsForm;
import org.springframework.stereotype.Component;

@Component("manufactureDetailsUtil")
public class ManufactureDetailsUtil {
    public ManufactureDetailsModel convertFormToManufactureModel(ManufactureDetailsForm manufactureDetailsForm){
        ManufactureDetailsModel manufactureDetailsModel = new ManufactureDetailsModel();
        manufactureDetailsModel.setId(manufactureDetailsForm.getId());
        manufactureDetailsModel.setName(manufactureDetailsForm.getName());
        manufactureDetailsModel.setCountry(manufactureDetailsForm.getCountry());
        return manufactureDetailsModel;

    }
}
