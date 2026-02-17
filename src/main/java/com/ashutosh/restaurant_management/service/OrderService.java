package com.ashutosh.restaurant_management.service;

import com.ashutosh.restaurant_management.dto.OrderDetailDto;

import java.util.List;

public interface OrderService {
    List<OrderDetailDto> getAllOrders();

    OrderDetailDto getOrderDetail(int orderId);
}
