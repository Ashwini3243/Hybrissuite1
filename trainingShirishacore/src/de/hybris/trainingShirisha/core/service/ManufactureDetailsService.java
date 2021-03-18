package de.hybris.trainingShirisha.core.service;

import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;

import java.util.List;


public interface ManufactureDetailsService {
    /**
     * Returns the ManufactureDetails with the specified id.
     * @param id the id of the Manufacture
     * @return the @{@link ManufactureDetailsModel}
     */
    ManufactureDetailsModel getManufactureDetailsForId(final int id);

    /**
     * Returns the all ManufactureDetails
     * @return the @{@link List<ManufactureDetailsModel>}
     */
    List<ManufactureDetailsModel> getManufactureDetails();

    /**
     * Returns the ManufactureDetails with the specified id and name.
     * @param id
     * @param name
     * @return the @{@link ManufactureDetailsModel}
     */
    ManufactureDetailsModel getManufactureDetailsForIdandName(final int id, final String name);

    /**
     * Returns the all ManufactureDetails
     * @return the @{@link List<ManufactureDetailsModel>}
     */
    List<ManufactureDetailsModel> getManufactureDetailsWithPagination(final int currentPage);


    /**
     * save the manufacture details into database
     * @param manufactureDetailsModel
     * @return
     */
    public String saveManufactureDetailsData(ManufactureDetailsModel manufactureDetailsModel);


    /**
     * remove manufacture details from database(from backoffice,,if u will delete means, it's automatically call this method)
     * @param id
     * @return
     */
    public void removeManufactureDetailsData(int id);


    /**
     * to retrive manufacture details data from database
     * @param manufactureDetailsModel
     */
    public void loadManufactureDetailsData(ManufactureDetailsModel manufactureDetailsModel);


    /**
     * to add additional default values
     * @param manufactureDetailsModel
     */
    public void manufactureInitDefaultsData(ManufactureDetailsModel manufactureDetailsModel);
}
