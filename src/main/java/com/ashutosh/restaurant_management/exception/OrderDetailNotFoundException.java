package com.ashutosh.restaurant_management.exception;

public class OrderDetailNotFoundException extends RuntimeException {
    public OrderDetailNotFoundException(String message) {
        super(message);
    }
}
