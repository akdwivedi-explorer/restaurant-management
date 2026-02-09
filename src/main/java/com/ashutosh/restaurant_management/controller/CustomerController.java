package com.ashutosh.restaurant_management.controller;

import com.ashutosh.restaurant_management.GlobalApiResponse;
import com.ashutosh.restaurant_management.dto.CustomerDetailDto;
import com.ashutosh.restaurant_management.dto.CustomerProfileDto;
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
    public ResponseEntity<GlobalApiResponse<List<CustomerDetailResponse>>> getCustomers() {
        List<CustomerDetailDto> customers = customerService.getAllCustomers();
        List<CustomerDetailResponse> response = customers.stream()
                .map(CustomerDetailResponse::from)
                .toList();
        GlobalApiResponse<List<CustomerDetailResponse>> customerDetail = new GlobalApiResponse<>(
                "Customer Details fetched successfully",
                response);

        return ResponseEntity.ok(customerDetail);
    }

    @GetMapping("/customer")
    public ResponseEntity<GlobalApiResponse<CustomerDetailResponse>> getCustomer(
            @RequestHeader("customerId") int customerId
    ){
        CustomerDetailDto customer = customerService.getCustomerById(customerId);

        GlobalApiResponse<CustomerDetailResponse> response = new GlobalApiResponse<>(
                "Customer Detail fetched successfully by given customerId",
                CustomerDetailResponse.from(customer));

        return ResponseEntity.ok(response);
    }

    @GetMapping("/customer/profile")
    public ResponseEntity<GlobalApiResponse<CustomerProfileResponse>> getCustomerProfile(
            @RequestHeader("customerId") int customerId
    ){
        CustomerProfileDto customerProfile = customerService.getCustomerProfile(customerId);
        GlobalApiResponse<CustomerProfileResponse> response = new GlobalApiResponse<>(
                "Customer profile fetched successfully",
                CustomerProfileResponse.from(customerProfile));

        return ResponseEntity.ok(response);
    }

}
