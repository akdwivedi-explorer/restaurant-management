package com.ashutosh.restaurant_management.response;

import com.ashutosh.restaurant_management.dto.CustomerProfileDto;
import lombok.Builder;

@Builder
public class CustomerProfileResponse {
    CustomerProfileDto customerProfile;

    public static CustomerProfileResponse from(CustomerProfileDto dto){
        return CustomerProfileResponse.builder()
                .customerProfile(dto)
                .build();
    }
}
