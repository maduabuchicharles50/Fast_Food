package com.charles.request;

import com.charles.model.Category;
import com.charles.model.IngredientsItem;
import lombok.Data;

import java.util.List;

@Data
public class createFoodRequest {

    private String name;
    private  String description;
    private Long price;
    private Category category;
    private List<String> images;

    private Long RestaurantId;
    private boolean vegetarian;
    private boolean isSeasonal;

    private List<IngredientsItem> ingredients;

}
