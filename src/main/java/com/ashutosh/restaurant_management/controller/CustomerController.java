package com.ashutosh.restaurant_management.controller;

import com.ashutosh.restaurant_management.dto.CustomerAddressDto;
import com.ashutosh.restaurant_management.global.ApiResponse;
import com.ashutosh.restaurant_management.dto.CustomerDetailDto;
import com.ashutosh.restaurant_management.dto.CustomerProfileDto;
import com.ashutosh.restaurant_management.response.CustomerAddressResponse;
import com.ashutosh.restaurant_management.response.CustomerDetailResponse;
import com.ashutosh.restaurant_management.response.CustomerProfileResponse;
import com.ashutosh.restaurant_management.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/customers")
    public ResponseEntity<ApiResponse<List<CustomerDetailResponse>>> getCustomers() {
        List<CustomerDetailDto> customers = customerService.getAllCustomers();
        List<CustomerDetailResponse> response = customers.stream()
                .map(CustomerDetailResponse::from)
                .toList();
        ApiResponse<List<CustomerDetailResponse>> customerDetail = new ApiResponse<>(
                "Customer Details fetched successfully",
                response);

        return ResponseEntity.ok(customerDetail);
    }

    @GetMapping("/customer")
    public ResponseEntity<ApiResponse<CustomerDetailResponse>> getCustomer(
            @RequestHeader("customerId") int customerId
    ){
        CustomerDetailDto customer = customerService.getCustomerById(customerId);

        ApiResponse<CustomerDetailResponse> response = new ApiResponse<>(
                "Customer Detail fetched successfully by given customerId",
                CustomerDetailResponse.from(customer));

        return ResponseEntity.ok(response);
    }

    @GetMapping("/customer/profile")
    public ResponseEntity<ApiResponse<CustomerProfileResponse>> getCustomerProfile(
            @RequestHeader("customerId") int customerId
    ){
        CustomerProfileDto customerProfile = customerService.getCustomerProfile(customerId);
        ApiResponse<CustomerProfileResponse> response = new ApiResponse<>(
                "Customer profile fetched successfully",
                CustomerProfileResponse.from(customerProfile));

        return ResponseEntity.ok(response);
    }

    @GetMapping("/customer/addresses")
    public ResponseEntity<ApiResponse<List<CustomerAddressResponse>>> getCustomerAddresses(
            @RequestHeader("customerId") int customerId
    ){
        List<CustomerAddressDto> addresses = customerService.getCustomerAddresses(customerId);
        List<CustomerAddressResponse> response = addresses.stream().map(CustomerAddressResponse::from)
                .toList();
        ApiResponse<List<CustomerAddressResponse>> customerAddresses = new ApiResponse<>(
                "Customer Addresses fetched successfully for given customerId",
                response
        );

        return ResponseEntity.ok(customerAddresses);
    }

}
