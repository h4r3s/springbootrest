package com.jorgejimenezsl.springbootrest.controller;

import org.springframework.web.bind.annotation.RestController;
import com.jorgejimenezsl.springbootrest.service.PriceService;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.jorgejimenezsl.springbootrest.domain.Price;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/prices")
    public List<Price> getPrices(
            @RequestParam Long productId,
            @RequestParam Long brandId,
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date) {
        return priceService.findPricesByProductIdAndBrandIdAndDate(productId, brandId, date);
    }

}
