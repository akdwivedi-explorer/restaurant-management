package com.ashutosh.restaurant_management.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum SpiceLevel {
    HIGH("High"),
    MEDIUM("Medium"),
    LOW("Low");

    private final String levelDescription;
}
