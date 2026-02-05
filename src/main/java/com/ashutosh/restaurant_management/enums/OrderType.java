package com.ashutosh.restaurant_management.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OrderType {
    DELIVERY("Delivery"),
    TAKEAWAY("Take Away"),
    DINE_IN("Dine In");

    private final String orderDescription;
}
