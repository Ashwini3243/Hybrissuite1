package de.hybris.trainingShirisha.storefront.cusom.form;

import de.hybris.platform.core.model.c2l.CountryModel;

public class ManufactureDetailsForm {
    private int id;
    private String name;
    private CountryModel country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryModel getCountry() {
        return country;
    }

    public void setCountry(CountryModel country) {
        this.country = country;
    }
}
