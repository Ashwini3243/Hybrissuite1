package de.hybris.trainingShirisha.core.custom;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class TestDynamicAttribute extends AbstractDynamicAttributeHandler<Boolean, ProductModel> {
    @Override
    public Boolean get(ProductModel model) {

        /*int days=0;
        final Date productEntryDate = model.getCreationtime();

        final Calendar cal = Calendar.getInstance();
        cal.setTime(productEntryDate);

        final int productEntryTime = cal.get(Calendar.DATE);
        final int currentTime = Calendar.getInstance().get(Calendar.DATE);

        days = currentTime - productEntryTime;

        if(days>=1&&days<=10){
            return true;
        }else{
            return false;
        }*/

        final Date productCreationDate = model.getCreationtime();
        final Calendar calendar = Calendar.getInstance();
        Date todayDate = calendar.getTime();
        long difference = todayDate.getTime()-productCreationDate.getTime();

        long difference_In_Days = (difference/(1000*60*60*24))%365;

        if(difference_In_Days<10){
            return true;
        }else{
            return false;
        }
    }
}
