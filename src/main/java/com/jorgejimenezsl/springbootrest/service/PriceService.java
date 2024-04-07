package com.jorgejimenezsl.springbootrest.service;

import com.jorgejimenezsl.springbootrest.domain.Price;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Service interface for retrieving price information.
 */
public interface PriceService {

    /**
     * Retrieves a list of prices based on the provided product ID, brand ID, and
     * date.
     * 
     * @param productId The ID of the product.
     * @param brandId   The ID of the brand.
     * @param date      The date for which prices are requested.
     * @return A list of Price entities matching the criteria.
     */
    List<Price> findPricesByProductIdAndBrandIdAndDate(
            Long productId,
            Long brandId,
            LocalDateTime date);

}
