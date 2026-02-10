package com.ashutosh.restaurant_management.service;

import com.ashutosh.restaurant_management.dto.CustomerAddressDto;
import com.ashutosh.restaurant_management.dto.CustomerDetailDto;
import com.ashutosh.restaurant_management.dto.CustomerProfileDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDetailDto> getAllCustomers();

    CustomerDetailDto getCustomerById(int customerId);

    CustomerProfileDto getCustomerProfile(int customerId);

    List<CustomerAddressDto> getCustomerAddresses(int customerId);

    CustomerAddressDto getCustomerAddress(int customerId, int addressId);
}
