package com.jorgejimenezsl.springbootrest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Define a logger
    private static final Logger logger = LoggerFactory.getLogger(PriceControllerTest.class);

    @Test
    public void testRequest_At_10AM_On_14th_June_For_Product_35455_And_Brand_1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/prices")
                .param("productId", "35455")
                .param("brandId", "1")
                .param("date", "2020-06-14T10:00:00")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(result -> {
                    String responseBody = result.getResponse().getContentAsString();
                    logger.info("Response body: {}", responseBody);
                    // Add additional assertions/logic here if needed
                });
    }

    // @Test
    // public void testRequest_At_16PM_On_14th_June_For_Product_35455_And_Brand_1()
    // throws Exception {
    // mockMvc.perform(MockMvcRequestBuilders.get("/prices")
    // .param("productId", "35455")
    // .param("brandId", "1")
    // .param("date", "2020-06-14T16:00:00")
    // .contentType(MediaType.APPLICATION_JSON)
    // .accept(MediaType.APPLICATION_JSON))
    // .andDo(print())
    // .andExpect(MockMvcResultMatchers.status().isOk())
    // .andDo(result -> {
    // String responseBody = result.getResponse().getContentAsString();
    // logger.info("Response body: {}", responseBody);
    // });
    // }

    // @Test
    // public void testRequest_At_21PM_On_14th_June_For_Product_35455_And_Brand_1()
    // throws Exception {
    // mockMvc.perform(MockMvcRequestBuilders.get("/prices")
    // .param("productId", "35455")
    // .param("brandId", "1")
    // .param("date", "2020-06-14T21:00:00")
    // .contentType(MediaType.APPLICATION_JSON)
    // .accept(MediaType.APPLICATION_JSON))
    // .andDo(print())
    // .andExpect(MockMvcResultMatchers.status().isOk())
    // .andDo(result -> {
    // String responseBody = result.getResponse().getContentAsString();
    // logger.info("Response body: {}", responseBody);
    // });
    // }

    // @Test
    // public void testRequest_At_10AM_On_15th_June_For_Product_35455_And_Brand_1()
    // throws Exception {
    // mockMvc.perform(MockMvcRequestBuilders.get("/prices")
    // .param("productId", "35455")
    // .param("brandId", "1")
    // .param("date", "2020-06-15T10:00:00")
    // .contentType(MediaType.APPLICATION_JSON)
    // .accept(MediaType.APPLICATION_JSON))
    // .andDo(print())
    // .andExpect(MockMvcResultMatchers.status().isOk())
    // .andDo(result -> {
    // String responseBody = result.getResponse().getContentAsString();
    // logger.info("Response body: {}", responseBody);
    // });
    // }

    // @Test
    // public void testRequest_At_21PM_On_16th_June_For_Product_35455_And_Brand_1()
    // throws Exception {
    // mockMvc.perform(MockMvcRequestBuilders.get("/prices")
    // .param("productId", "35455")
    // .param("brandId", "1")
    // .param("date", "2020-06-16T21:00:00")
    // .contentType(MediaType.APPLICATION_JSON)
    // .accept(MediaType.APPLICATION_JSON))
    // .andDo(print())
    // .andExpect(MockMvcResultMatchers.status().isOk())
    // .andDo(result -> {
    // String responseBody = result.getResponse().getContentAsString();
    // logger.info("Response body: {}", responseBody);
    // });
    // }

}
