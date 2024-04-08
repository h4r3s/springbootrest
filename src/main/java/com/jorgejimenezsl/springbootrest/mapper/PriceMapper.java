package com.jorgejimenezsl.springbootrest.mapper;

import com.jorgejimenezsl.springbootrest.domain.Price;
import com.jorgejimenezsl.springbootrest.dto.PriceDTO;
import org.springframework.stereotype.Component;

/**
 * Mapper class responsible for converting Price entities to PriceDTO objects
 * and vice versa.
 */
@Component
public class PriceMapper {

    /**
     * Converts a Price entity to a PriceDTO object.
     *
     * @param price The Price entity to convert.
     * @return The corresponding PriceDTO object.
     */
    public PriceDTO toDto(Price price) {
        return new PriceDTO(
                price.getProductId(),
                price.getBrandId(),
                price.getPriceList(),
                price.getStartDate(),
                price.getEndDate(),
                price.getPrice(),
                price.getCurrency());
    }
}
