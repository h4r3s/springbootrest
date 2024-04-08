/**
 * Integration tests for the PriceController class.
 * These tests validate the behavior of the PriceController REST endpoints.
 */
package com.jorgejimenezsl.springbootrest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Integration tests for the PriceController class.
 * These tests validate the behavior of the PriceController REST endpoints.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    // Define a logger
    private static final Logger logger = LoggerFactory.getLogger(PriceControllerIntegrationTest.class);

    /**
     * Test case to validate the behavior of the '/prices' endpoint
     * when querying prices at 10:00 AM on day 14.
     * Expects an empty array in the response body.
     */
    @Test
    public void testGetPricesAt10AMOnDay14() throws Exception {
        LocalDateTime dateTime = LocalDateTime.of(2020, 6, 14, 10, 0);
        mockMvc.perform(get("/prices")
                .param("productId", "35455")
                .param("brandId", "1")
                .param("date", dateTime.toString()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(0));

    }

    /**
     * Test case to validate the behavior of the '/prices' endpoint
     * when querying prices at 4:00 PM on day 14.
     * Expects an empty array in the response body.
     */
    @Test
    public void testGetPricesAt4PMOnDay14() throws Exception {
        LocalDateTime dateTime = LocalDateTime.of(2020, 6, 14, 16, 0);
        mockMvc.perform(get("/prices")
                .param("productId", "35455")
                .param("brandId", "1")
                .param("date", dateTime.toString()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(0));
    }

    /**
     * Test case to validate the behavior of the '/prices' endpoint
     * when querying prices at 9:00 PM on day 14.
     * Expects an empty array in the response body.
     */
    @Test
    public void testGetPricesAt9PMOnDay14() throws Exception {
        LocalDateTime dateTime = LocalDateTime.of(2020, 6, 14, 21, 0);
        mockMvc.perform(get("/prices")
                .param("productId", "35455")
                .param("brandId", "1")
                .param("date", dateTime.toString()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(0));
    }

    /**
     * Test case to validate the behavior of the '/prices' endpoint
     * when querying prices at 10:00 AM on day 15.
     * Expects an empty array in the response body.
     */
    @Test
    public void testGetPricesAt10AMOnDay15() throws Exception {
        LocalDateTime dateTime = LocalDateTime.of(2020, 6, 15, 10, 0);
        mockMvc.perform(get("/prices")
                .param("productId", "35455")
                .param("brandId", "1")
                .param("date", dateTime.toString()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(0));
    }

    /**
     * Test case to validate the behavior of the '/prices' endpoint
     * when querying prices at 9:00 PM on day 16.
     * Expects an empty array in the response body.
     */
    @Test
    public void testGetPricesAt9PMOnDay16() throws Exception {
        LocalDateTime dateTime = LocalDateTime.of(2020, 6, 16, 21, 0);
        mockMvc.perform(get("/prices")
                .param("productId", "35455")
                .param("brandId", "1")
                .param("date", dateTime.toString()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(0));
    }

}
