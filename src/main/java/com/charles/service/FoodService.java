package com.charles.service;

import com.charles.model.Category;
import com.charles.model.Food;
import com.charles.model.Restaurant;
import com.charles.request.createFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(createFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId)throws Exception;

    public List<Food> getRestaurantFood(Long restaurantId,
                                        boolean isVegetarian,
                                        boolean isNonveg,
                                        boolean isSeasonal,
                                        String foodCategory
    );

    //public List<Food>searchFood(String keyword);

    public Food findFoodById(Long foodId) throws Exception;

    public Food updateFoodAvailabilityStatus(Long foodId) throws Exception;


}
