package de.hybris.trainingShirisha.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import de.hybris.trainingShirisha.facades.product.data.ManufactureDetailsData;

public class CustomProductManufactureDetailsPopulator implements Populator<ProductModel, ProductData> {

    Converter<ManufactureDetailsModel, ManufactureDetailsData> manufactureDetailsDataConverter;
    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {
       target.setManufactureDetails(getManufactureDetailsDataConverter().convertAll(source.getManufactureDetails()));
    }

    public Converter<ManufactureDetailsModel, ManufactureDetailsData> getManufactureDetailsDataConverter() {
        return manufactureDetailsDataConverter;
    }

    public void setManufactureDetailsDataConverter(Converter<ManufactureDetailsModel, ManufactureDetailsData> manufactureDetailsDataConverter) {
        this.manufactureDetailsDataConverter = manufactureDetailsDataConverter;
    }
}
