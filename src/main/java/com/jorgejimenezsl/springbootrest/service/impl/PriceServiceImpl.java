package com.jorgejimenezsl.springbootrest.service.impl;

import org.springframework.stereotype.Service;
import com.jorgejimenezsl.springbootrest.repository.PriceRepository;
import com.jorgejimenezsl.springbootrest.service.PriceService;

import com.jorgejimenezsl.springbootrest.domain.Price;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Implementation of the PriceService interface.
 * This class provides methods to retrieve price information.
 */
@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    /**
     * Constructs a new PriceServiceImpl instance.
     * 
     * @param priceRepository The repository for Price entities.
     */
    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    /**
     * Retrieves a list of prices based on the provided product ID, brand ID, and
     * date.
     * 
     * @param productId The ID of the product.
     * @param brandId   The ID of the brand.
     * @param date      The date for which prices are requested.
     * @return A list of Price entities matching the criteria.
     */
    @Override
    public List<Price> findPricesByProductIdAndBrandIdAndDate(Long productId, Long brandId, LocalDateTime date) {
        return priceRepository
                .findByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(
                        productId,
                        brandId, date,
                        date);
    }
}
