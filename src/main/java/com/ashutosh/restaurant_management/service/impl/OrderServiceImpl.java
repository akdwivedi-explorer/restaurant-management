package com.ashutosh.restaurant_management.service.impl;

import com.ashutosh.restaurant_management.dto.OrderDetailDto;
import com.ashutosh.restaurant_management.model.Order;
import com.ashutosh.restaurant_management.repository.OrderRepository;
import com.ashutosh.restaurant_management.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.ashutosh.restaurant_management.exception.OrderDetailNotFoundException;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public List<OrderDetailDto> getAllOrders() {
        List<Order> orders = orderRepository.findAll();

        return orders.stream().map(order ->
                OrderDetailDto.builder()
                        .restaurantId(order.getRestaurantId())
                        .customerId(order.getCustomerId())
                        .orderType(order.getOrderType())
                        .orderStatus(order.getOrderStatus())
                        .totalAmount(order.getTotalAmount())
                        .paymentStatus(order.getPaymentStatus())
                        .build()
        ).toList();
    }

    @Override
    public OrderDetailDto getOrderDetail(int orderId){
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new OrderDetailNotFoundException("Oder detail not found"));

        return OrderDetailDto.builder()
                .customerId(order.getCustomerId())
                .restaurantId(order.getRestaurantId())
                .orderType(order.getOrderType())
                .orderStatus(order.getOrderStatus())
                .totalAmount(order.getTotalAmount())
                .paymentStatus(order.getPaymentStatus())
                .build();
    }
}
