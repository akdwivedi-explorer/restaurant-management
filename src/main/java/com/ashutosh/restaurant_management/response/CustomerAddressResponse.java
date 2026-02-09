package com.ashutosh.restaurant_management.response;

import com.ashutosh.restaurant_management.dto.CustomerAddressDto;
import lombok.Builder;

@Builder
public class CustomerAddressResponse {
    CustomerAddressDto customerAddress;

    public static CustomerAddressResponse from(CustomerAddressDto customerAddress) {
        return CustomerAddressResponse.builder()
                .customerAddress(customerAddress)
                .build();
    }
}
