-- schema.sql
-- SQL script to define the database schema.

-- Creating the BRANDS table to store brand information.
CREATE TABLE IF NOT EXISTS BRANDS (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(100) 
);

-- Creating the PRICES table to store pricing information.
CREATE TABLE IF NOT EXISTS PRICES (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    BRAND_ID INT NOT NULL,
    START_DATE TIMESTAMP NOT NULL,
    END_DATE TIMESTAMP NOT NULL,
    PRICE_LIST INT NOT NULL,
    PRODUCT_ID INT NOT NULL,
    PRIORITY INT NOT NULL,
    PRICE DECIMAL(19, 2) NOT NULL,
    CURR VARCHAR(3) NOT NULL,
    FOREIGN KEY (BRAND_ID) REFERENCES BRANDS(ID)
);

