package com.jorgejimenezsl.springbootrest.repository;

import com.jorgejimenezsl.springbootrest.domain.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Repository interface for managing Price entities.
 */
@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    /**
     * Retrieves a list of prices based on the provided product ID, brand ID, and
     * start date.
     * 
     * @param productId The ID of the product.
     * @param brandId   The ID of the brand.
     * @param startDate The start date for the price.
     * @return A list of Price entities matching the criteria.
     */
    List<Price> findPricesByProductIdAndBrandIdAndStartDate(
            Long productId,
            Long brandId,
            LocalDateTime startDate);
}
