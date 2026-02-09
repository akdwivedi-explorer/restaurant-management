package com.ashutosh.restaurant_management.service.impl;

import com.ashutosh.restaurant_management.dto.CustomerDto;
import com.ashutosh.restaurant_management.exception.CustomerNotFoundException;
import com.ashutosh.restaurant_management.model.Customer;
import com.ashutosh.restaurant_management.repository.CustomerRepository;
import com.ashutosh.restaurant_management.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        return customers.stream()
                .map(customer -> CustomerDto.builder()
                        .id(customer.getId())
                        .firstName(customer.getFirstName())
                        .lastName(customer.getLastname())
                        .email(customer.getEmail())
                        .mobileNumber(customer.getMobileNumber())
                        .avatarUrl(customer.getAvatarUrl())
                        .roleType(customer.getRole())
                        .isActive(customer.isActive())
                        .createdAt(String.valueOf(customer.getCreatedAt()))
                        .updatedAt(String.valueOf(customer.getUpdatedAt()))
                        .build()
                )
                .toList();
    }

    @Override
    public CustomerDto getCustomerById(int customerId){
        Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new CustomerNotFoundException("Customer not found"));

        return CustomerDto.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastname())
                .email(customer.getEmail())
                .mobileNumber(customer.getMobileNumber())
                .avatarUrl(customer.getAvatarUrl())
                .roleType(customer.getRole())
                .isActive(customer.isActive())
                .createdAt(String.valueOf(customer.getCreatedAt()))
                .updatedAt(String.valueOf(customer.getUpdatedAt()))
                .build();
    }
}
