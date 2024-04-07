package com.jorgejimenezsl.springbootrest.service;

import com.jorgejimenezsl.springbootrest.domain.Price;
import java.time.LocalDateTime;
import java.util.List;

public interface PriceService {
    List<Price> findPricesByProductIdAndBrandIdAndDate(
            Long productId,
            Long brandId,
            LocalDateTime date);

}
