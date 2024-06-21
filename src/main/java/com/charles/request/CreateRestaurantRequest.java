package com.charles.request;

import com.charles.model.Address;
import com.charles.model.ContactInfo;
import lombok.Data;

import java.util.List;

@Data
public class CreateRestaurantRequest {
    private Long id;
    private String name;
    private String description;
    private String cuisineType;
    private Address address;
    private List<String> images;
    private ContactInfo contactInfo;
    private String openingHours;
}
