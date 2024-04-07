package com.jorgejimenezsl.springbootrest.repository;

import com.jorgejimenezsl.springbootrest.domain.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
    List<Price> findPricesByProductIdAndBrandIdAndStartDate(
            Long productId,
            Long brandId,
            LocalDateTime startDate);
}
