package com.charles.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Embeddable
@Data
public class RestaurantDto {
    private String name;

    @Column(length = 1000)
    private List<String> images;

    private  Long id;

    private String description;

}
