package com.ashutosh.restaurant_management.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum FoodType {
    VEG("Vegetarian"),
    NON_VEG("Non-Vegetarian"),
    VEGAN("Vegan"),
    JAIN("Jain");

    private final String displayName;
}
