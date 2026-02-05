package com.ashutosh.restaurant_management.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PaymentMethod {
    UPI("UPI"),
    CARD("Card"),
    CASH("Cash");

    private final String methodDescription;
}
