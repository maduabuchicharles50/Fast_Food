package com.charles.service;

import com.charles.dto.RestaurantDto;
import com.charles.model.Restaurant;
import com.charles.model.User;
import com.charles.request.CreateRestaurantRequest;

import java.util.List;

public interface RestaurantService {
    public Restaurant createRestaurant(CreateRestaurantRequest req, User user);

    public  Restaurant updateRestaurant( Long restaurantId, CreateRestaurantRequest updatedRestaurant )throws Exception;

    public void deleteRestaurant(Long restaurantId) throws Exception;

    public List<Restaurant> getALLRestaurant();

//    public List<Restaurant> searchRestaurant(String keyword);

    public Restaurant findRestaurantById(Long id)throws Exception;

    public Restaurant getRestaurantByUserId(Long userId)throws Exception;

    public RestaurantDto addToFavorites(Long restaurantId,User user)throws Exception;

    public Restaurant updateRestaurantStatus(Long id)throws Exception;
}
