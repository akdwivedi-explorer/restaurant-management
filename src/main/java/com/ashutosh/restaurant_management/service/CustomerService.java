package com.ashutosh.restaurant_management.service;

import com.ashutosh.restaurant_management.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> getAllCustomers();

    CustomerDto getCustomerById(int customerId);
}
