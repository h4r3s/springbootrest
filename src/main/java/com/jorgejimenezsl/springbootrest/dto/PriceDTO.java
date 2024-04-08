package com.jorgejimenezsl.springbootrest.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Data Transfer Object (DTO) representing price-related information.
 * This DTO is used to transfer price data between different layers of the
 * application.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceDTO {

    private Long productId;
    private Long brandId;
    private Integer priceList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal price;
    private String currency;

}
