package com.jorgejimenezsl.springbootrest.controller;

import com.jorgejimenezsl.springbootrest.dto.PriceDTO;
import com.jorgejimenezsl.springbootrest.mapper.PriceMapper;
import com.jorgejimenezsl.springbootrest.service.PriceService;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Controller class responsible for handling requests related to prices.
 */
@RestController
public class PriceController {

    private final PriceService priceService;
    private final PriceMapper priceMapper;

    /**
     * Constructor for the PriceController class.
     *
     * @param priceService The PriceService to be used in the controller.
     * @param priceMapper  The PriceMapper to be used in the controller.
     */
    public PriceController(PriceService priceService, PriceMapper priceMapper) {
        this.priceService = priceService;
        this.priceMapper = priceMapper;
    }

    /**
     * Retrieves prices based on the provided parameters.
     *
     * @param productId The ID of the product.
     * @param brandId   The ID of the brand.
     * @param date      The date for which prices are desired.
     * @return A list of PriceDTO objects corresponding to the provided parameters.
     */
    @GetMapping("/prices")
    public List<PriceDTO> getPrices(
            @RequestParam(required = true) Long productId,
            @RequestParam(required = true) Long brandId,
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @RequestParam(required = true) LocalDateTime date) {
        return priceService.findPricesByProductIdAndBrandIdAndDate(productId, brandId, date)
                .stream()
                .map(priceMapper::toDto)
                .collect(Collectors.toList());
    }
}
