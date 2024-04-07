package com.jorgejimenezsl.springbootrest.service.impl;

import org.springframework.stereotype.Service;
import com.jorgejimenezsl.springbootrest.repository.PriceRepository;
import com.jorgejimenezsl.springbootrest.service.PriceService;

import com.jorgejimenezsl.springbootrest.domain.Price;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public List<Price> findPricesByProductIdAndBrandIdAndDate(
            Long productId,
            Long brandId,
            LocalDateTime date) {
        return priceRepository.findPricesByProductIdAndBrandIdAndStartDate(productId, brandId, date);
    }
}
