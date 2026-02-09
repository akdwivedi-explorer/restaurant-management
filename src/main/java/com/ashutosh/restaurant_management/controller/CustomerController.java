package com.ashutosh.restaurant_management.controller;

import com.ashutosh.restaurant_management.dto.CustomerDto;
import com.ashutosh.restaurant_management.response.CustomerDetailResponse;
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
    public ResponseEntity<List<CustomerDetailResponse>> getCustomers() {
        List<CustomerDto> customers = customerService.getAllCustomers();
        List<CustomerDetailResponse> response = customers.stream()
                .map(CustomerDetailResponse::from)
                .toList();

        return ResponseEntity.ok(response);
    }

    @GetMapping("/customer")
    public ResponseEntity<CustomerDetailResponse> getCustomer(
            @RequestHeader("customerId") int customerId
    ){
        CustomerDto customer = customerService.getCustomerById(customerId);

        return ResponseEntity.ok(CustomerDetailResponse.from(customer));
    }

}
