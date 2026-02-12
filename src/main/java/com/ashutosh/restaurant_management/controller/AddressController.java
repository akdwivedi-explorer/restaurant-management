package com.ashutosh.restaurant_management.controller;

import com.ashutosh.restaurant_management.global.ApiResponse;
import com.ashutosh.restaurant_management.request.UpdateCustomerAddressRequest;
import com.ashutosh.restaurant_management.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class AddressController {
    private final AddressService addressService;
    private static final String SUCCESS_MESSAGE = "SUCCESS";

    @PatchMapping("/address")
    public ResponseEntity<ApiResponse<String>> updateAddress(
            @RequestHeader("addressId") int addressId,
            @RequestBody UpdateCustomerAddressRequest request
    ) {
        Integer id = addressService.updateAddress(addressId, request);


        ApiResponse<String> response = new ApiResponse<>(
                "Address updated successfully: " + id,
                SUCCESS_MESSAGE
        );

        return ResponseEntity.ok(response);
    }

    @PatchMapping("/address/default")
    public ResponseEntity<ApiResponse<String>> setDefaultAddress(
            @RequestHeader("addressId") int addressId
    ) {
        Integer id = addressService.setAddressAsDefault(addressId);

        ApiResponse<String> response = new ApiResponse<>(
                "Address set as default, addressId: " + id,
                SUCCESS_MESSAGE
        );

        return ResponseEntity.ok(response);
    }
}
