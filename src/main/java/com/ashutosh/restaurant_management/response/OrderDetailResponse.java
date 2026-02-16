package com.ashutosh.restaurant_management.response;

import com.ashutosh.restaurant_management.dto.OrderDetailDto;
import lombok.Builder;

@Builder
public class OrderDetailResponse {
    private OrderDetailDto orderDetail;

    public static OrderDetailResponse from(OrderDetailDto orderDetail){
        return OrderDetailResponse.builder()
                .orderDetail(orderDetail)
                .build();
    }
}
