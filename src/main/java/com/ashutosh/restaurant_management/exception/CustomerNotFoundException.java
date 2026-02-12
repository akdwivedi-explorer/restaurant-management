package com.ashutosh.restaurant_management.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException() {
        super("Customer not found exception");
    }
}