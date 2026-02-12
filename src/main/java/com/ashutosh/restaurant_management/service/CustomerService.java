package com.ashutosh.restaurant_management.service;

import com.ashutosh.restaurant_management.dto.CustomerAddressDto;
import com.ashutosh.restaurant_management.dto.CustomerDetailDto;
import com.ashutosh.restaurant_management.dto.CustomerProfileDto;
import com.ashutosh.restaurant_management.request.CreateCustomerAddressRequest;
import com.ashutosh.restaurant_management.request.CreateCustomerRequest;
import com.ashutosh.restaurant_management.request.UpdateCustomerRequest;
import jakarta.transaction.Transactional;

import java.util.List;

public interface CustomerService {
    List<CustomerDetailDto> getAllCustomers();

    CustomerDetailDto getCustomerById(int customerId);

    CustomerProfileDto getCustomerProfile(int customerId);

    List<CustomerAddressDto> getCustomerAddresses(int customerId);

    CustomerAddressDto getCustomerAddress(int customerId, int addressId);

    Integer createNewCustomer(CreateCustomerRequest request);

    @Transactional
    Integer updateCustomer(int customerId, UpdateCustomerRequest request);

    @Transactional
    Integer deleteCustomer(int customerId);

    @Transactional
    Integer deactivateCustomer(int customerId);

    @Transactional
    Integer createCustomerAddress(int customerId, CreateCustomerAddressRequest request);
}
