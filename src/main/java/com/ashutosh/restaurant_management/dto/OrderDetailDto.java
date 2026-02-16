package com.ashutosh.restaurant_management.dto;

import com.ashutosh.restaurant_management.enums.OrderStatus;
import com.ashutosh.restaurant_management.enums.OrderType;
import com.ashutosh.restaurant_management.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDto {
    private int restaurantId;
    private int customerId;
    private OrderType orderType;
    private OrderStatus orderStatus;
    private double totalAmount;
    private PaymentStatus paymentStatus;
}
