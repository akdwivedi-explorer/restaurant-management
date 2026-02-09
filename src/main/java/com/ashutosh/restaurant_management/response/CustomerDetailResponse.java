package com.ashutosh.restaurant_management.response;

import com.ashutosh.restaurant_management.dto.CustomerDetailDto;
import lombok.Builder;

@Builder
public class CustomerDetailResponse {
    CustomerDetailDto customerDetail;

    public static CustomerDetailResponse from(CustomerDetailDto customer){
        return CustomerDetailResponse.builder()
                .customerDetail(customer)
                .build();
    }
}
