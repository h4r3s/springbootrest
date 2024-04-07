package com.jorgejimenezsl.springbootrest.controller;

import org.springframework.web.bind.annotation.RestController;
import com.jorgejimenezsl.springbootrest.service.PriceService;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.jorgejimenezsl.springbootrest.domain.Price;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Controller to handle requests related to prices.
 */
@RestController
public class PriceController {

    private final PriceService priceService;

    /**
     * Constructor for the price controller.
     * 
     * @param priceService The price service to be used in the controller.
     */
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    /**
     * Method to retrieve prices based on the provided parameters.
     * 
     * @param productId The ID of the product.
     * @param brandId   The ID of the brand.
     * @param date      The date for which prices are desired.
     * @return A list of prices corresponding to the provided parameters.
     */
    @GetMapping("/prices")
    public List<Price> getPrices(
            @RequestParam Long productId,
            @RequestParam Long brandId,
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date) {
        return priceService.findPricesByProductIdAndBrandIdAndDate(productId, brandId, date);
    }

}
