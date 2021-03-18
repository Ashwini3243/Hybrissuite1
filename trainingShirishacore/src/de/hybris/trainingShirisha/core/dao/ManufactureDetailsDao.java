package de.hybris.trainingShirisha.core.dao;
import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import de.hybris.trainingShirisha.facades.product.data.ManufactureDetailsData;

import java.util.List;

public interface ManufactureDetailsDao {

    /**
     * Returns for the given ManufactureDetails <id>id</id> the {@link ManufactureDetailsModel} collection.
     *
     * @param id the ManufactureDetails <id>id</id>
     * @return a {@link ManufactureDetailsModel}
     */
    ManufactureDetailsModel findManufactureDetailsById(final int id);

    /**
     * Returns the all ManufactureDetails
     * @return a {@link List<ManufactureDetailsModel>}
     */
    List<ManufactureDetailsModel> getAllManufactureDetails();

    /**
     * Returns for the given ManufactureDetails by id and name
     * @param id
     * @param name
     * @return a {@link ManufactureDetailsModel}
     */
    ManufactureDetailsModel findManufactureDetailsByIdandName(final int id,final String name);

    /**
     * Returns the all ManufactureDetails
     * @return a {@link List<ManufactureDetailsModel>}
     */
    List<ManufactureDetailsModel> getAllManufactureDetailsWithPagination(final int currentPage);


}
