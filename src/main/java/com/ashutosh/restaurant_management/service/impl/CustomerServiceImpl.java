package com.ashutosh.restaurant_management.service.impl;

import com.ashutosh.restaurant_management.dto.CustomerAddressDto;
import com.ashutosh.restaurant_management.dto.CustomerDetailDto;
import com.ashutosh.restaurant_management.dto.CustomerProfileDto;
import com.ashutosh.restaurant_management.exception.AddressNotFoundException;
import com.ashutosh.restaurant_management.exception.CustomerNotFoundException;
import com.ashutosh.restaurant_management.model.Address;
import com.ashutosh.restaurant_management.model.Customer;
import com.ashutosh.restaurant_management.repository.AddressRepository;
import com.ashutosh.restaurant_management.repository.CustomerRepository;
import com.ashutosh.restaurant_management.request.CreateCustomerRequest;
import com.ashutosh.restaurant_management.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final AddressRepository addressRepository;

    @Override
    public List<CustomerDetailDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        return customers.stream()
                .map(customer -> CustomerDetailDto.builder()
                        .id(customer.getId())
                        .firstName(customer.getFirstName())
                        .lastName(customer.getLastname())
                        .email(customer.getEmail())
                        .mobileNumber(customer.getMobileNumber())
                        .avatarUrl(customer.getAvatarUrl())
                        .roleType(customer.getRole())
                        .isActive(customer.getIsActive())
                        .createdAt(String.valueOf(customer.getCreatedAt()))
                        .updatedAt(String.valueOf(customer.getUpdatedAt()))
                        .build()
                )
                .toList();
    }

    @Override
    public CustomerDetailDto getCustomerById(int customerId) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new CustomerNotFoundException("Customer not found"));

        return CustomerDetailDto.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastname())
                .email(customer.getEmail())
                .mobileNumber(customer.getMobileNumber())
                .avatarUrl(customer.getAvatarUrl())
                .roleType(customer.getRole())
                .isActive(customer.getIsActive())
                .createdAt(String.valueOf(customer.getCreatedAt()))
                .updatedAt(String.valueOf(customer.getUpdatedAt()))
                .build();
    }

    @Override
    public CustomerProfileDto getCustomerProfile(int customerId) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new CustomerNotFoundException("Customer not found for given customerId"));

        List<Address> addresses = addressRepository.findByCustomerId(customerId).orElseThrow(() -> new AddressNotFoundException("Address not available for given customerId"));

        return CustomerProfileDto.builder()
                .customerDetail(CustomerDetailDto.builder()
                        .id(customer.getId())
                        .firstName(customer.getFirstName())
                        .lastName(customer.getLastname())
                        .email(customer.getEmail())
                        .avatarUrl(customer.getAvatarUrl())
                        .mobileNumber(customer.getMobileNumber())
                        .roleType(customer.getRole())
                        .isActive(customer.getIsActive())
                        .updatedAt(String.valueOf(customer.getUpdatedAt()))
                        .createdAt(String.valueOf(customer.getCreatedAt()))
                        .build())
                .customerAddress(addresses.stream().map(address -> CustomerAddressDto.builder()
                        .id(address.getId())
                        .customerId(address.getCustomerId())
                        .cityName(address.getCityName())
                        .streetName(address.getStreetName())
                        .pincode(address.getPincode())
                        .latitude(address.getLatitude())
                        .longitude(address.getLongitude())
                        .isDefault(address.isDefault())
                        .createdAt(String.valueOf(address.getCreatedAt()))
                        .updatedAt(String.valueOf(address.getUpdatedAt()))
                        .build()
                ).toList())
                .build();
    }

    @Override
    public List<CustomerAddressDto> getCustomerAddresses(int customerId){
        List<Address> addresses = addressRepository.findByCustomerId(customerId).orElseThrow(() -> new AddressNotFoundException("Address not found for the given customerId"));

        return addresses.stream().map(address -> CustomerAddressDto.builder()
                .id(address.getId())
                .customerId(address.getCustomerId())
                .cityName(address.getCityName())
                .streetName(address.getStreetName())
                .pincode(address.getPincode())
                .latitude(address.getLatitude())
                .longitude(address.getLongitude())
                .isDefault(address.isDefault())
                .createdAt(String.valueOf(address.getCreatedAt()))
                .updatedAt(String.valueOf(address.getUpdatedAt()))
                .build()
        ).toList();
    }

    @Override
    public CustomerAddressDto getCustomerAddress(int customerId, int addressId) {
        Address address = addressRepository.findByCustomerIdAndId(customerId, addressId).orElseThrow(() -> new AddressNotFoundException("Address not found for the given customerId and addressId"));

        return CustomerAddressDto.builder()
                .id(address.getId())
                .customerId(address.getCustomerId())
                .cityName(address.getCityName())
                .streetName(address.getStreetName())
                .pincode(address.getPincode())
                .latitude(address.getLatitude())
                .longitude(address.getLongitude())
                .isDefault(address.isDefault())
                .createdAt(String.valueOf(address.getCreatedAt()))
                .updatedAt(String.valueOf(address.getUpdatedAt()))
                .build();
    }

    @Override
    public Integer createNewCustomer(CreateCustomerRequest request) {

        Customer customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastname(request.getLastName())
                .email(request.getEmail())
                .mobileNumber(request.getMobileNumber())
                .avatarUrl(request.getAvatarUrl())
                .role(request.getRoleType())
                .isActive(request.getIsActive())
                .build();

        customer = customerRepository.save(customer);

        return customer.getId();
    }
}
