package com.ashutosh.restaurant_management.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PaymentStatus {
    SUCCESS("Success"),
    FAILED("Failed"),
    REFUNDED("Refunded");

    private final String paymentStatusDescription;
}
