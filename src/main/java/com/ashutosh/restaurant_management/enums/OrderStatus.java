package com.ashutosh.restaurant_management.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OrderStatus {
    CREATED("Created"),
    CONFIRMED("Confirmed"),
    PREPARING("Preparing"),
    READY("Ready"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled");

    private final String statusDescription;
}
