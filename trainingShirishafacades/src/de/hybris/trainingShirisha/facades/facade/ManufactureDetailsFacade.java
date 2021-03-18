package de.hybris.trainingShirisha.facades.facade;

import de.hybris.trainingShirisha.core.model.ManufactureDetailsModel;
import de.hybris.trainingShirisha.facades.product.data.ManufactureDetailsData;

import java.util.List;

public interface ManufactureDetailsFacade {
    /**
     * Gets the Manufacture Details by Id
     * @param id
     * @return the {@link ManufactureDetailsData}
     */
    ManufactureDetailsData getManufactureDetails(final int id);

    /**
     * Gets the all Manufacture Details
     * @return the {@link List<ManufactureDetailsData>}
     */
    List<ManufactureDetailsData> getAllManufacturerDetails();

    /**
     * Gets the Manufacture Details by Id and name
     * @param id
     * @param name
     * @return  the {@link ManufactureDetailsData}
     */
    ManufactureDetailsData getManufactureDetailsByIdAndName(final int id, final String name);

    /**
     * Gets the all Manufacture Details
     * @return the {@link List<ManufactureDetailsData>}
     */
    List<ManufactureDetailsData> getAllManufacturerDetailsWithPagination(final int currentPage);

}
