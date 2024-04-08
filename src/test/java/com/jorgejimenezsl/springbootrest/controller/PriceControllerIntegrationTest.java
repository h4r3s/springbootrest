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

/**
 * Integration tests for the PriceController class.
 * These tests validate the behavior of the PriceController REST endpoints.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test case to validate the behavior of the '/prices' endpoint
     * when querying prices at 10:00 AM on day 14.
     * Expects one record with correct values.
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
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].startDate").value("2020-06-14T00:00:00"))
                .andExpect(jsonPath("$[0].endDate").value("2020-12-31T23:59:59"))
                .andExpect(jsonPath("$[0].price").value(35.50));
    }

    /**
     * Test case to validate the behavior of the '/prices' endpoint
     * when querying prices at 4:00 PM on day 14.
     * Expects one record with correct values.
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
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].startDate").value("2020-06-14T15:00:00"))
                .andExpect(jsonPath("$[0].endDate").value("2020-06-14T18:30:00"))
                .andExpect(jsonPath("$[0].price").value(25.45));
    }

    /**
     * Test case to validate the behavior of the '/prices' endpoint
     * when querying prices at 9:00 PM on day 14.
     * Expects one record with correct values.
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
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].startDate").value("2020-06-14T00:00:00"))
                .andExpect(jsonPath("$[0].endDate").value("2020-12-31T23:59:59"))
                .andExpect(jsonPath("$[0].price").value(35.50));
    }

    /**
     * Test case to validate the behavior of the '/prices' endpoint
     * when querying prices at 10:00 AM on day 15.
     * Expects one record with correct values.
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
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].startDate").value("2020-06-15T00:00:00"))
                .andExpect(jsonPath("$[0].endDate").value("2020-06-15T11:00:00"))
                .andExpect(jsonPath("$[0].price").value(30.50));
    }

    /**
     * Test case to validate the behavior of the '/prices' endpoint
     * when querying prices at 9:00 PM on day 16.
     * Expects one record with correct values.
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
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].startDate").value("2020-06-15T16:00:00"))
                .andExpect(jsonPath("$[0].endDate").value("2020-12-31T23:59:59"))
                .andExpect(jsonPath("$[0].price").value(38.95));
    }
}
