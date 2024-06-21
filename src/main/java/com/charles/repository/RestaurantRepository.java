package com.charles.repository;

import com.charles.model.Restaurant;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
//    @Transactional
//    @Modifying
//    @Query("SELECT r FROM Restaurant r WHERE lower(r.name) LIKE lower(concat('%':query,'%')) " +
//            "OR lower(r.cuisineType) LIKE lower(concat('%':query,'%'))")
//    List<Restaurant> findBySearchQuery(String query);
    Restaurant findByOwnerId(Long userId);

}
