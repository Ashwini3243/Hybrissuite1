package de.hybris.trainingShirisha.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import de.hybris.trainingShirisha.facades.product.data.ManufactureDetailsData;

public class ManufactureDetailsPopulator implements Populator<ManufactureDetailsModel,ManufactureDetailsData>{
    Converter<CountryModel, CountryData> countryDataConverter;

    public Converter<CountryModel, CountryData> getCountryDataConverter() {
        return countryDataConverter;
    }

    public void setCountryDataConverter(Converter<CountryModel, CountryData> countryDataConverter) {
        this.countryDataConverter = countryDataConverter;
    }

    @Override
    public void populate(ManufactureDetailsModel source, ManufactureDetailsData target) throws ConversionException {
     target.setId(source.getId());
     target.setName(source.getName());
     target.setCountry(getCountryDataConverter().convert(source.getCountry()));
    }
}
