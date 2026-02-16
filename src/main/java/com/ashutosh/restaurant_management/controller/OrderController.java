package com.ashutosh.restaurant_management.controller;

import com.ashutosh.restaurant_management.dto.OrderDetailDto;
import com.ashutosh.restaurant_management.global.ApiResponse;
import com.ashutosh.restaurant_management.response.OrderDetailResponse;
import com.ashutosh.restaurant_management.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<ApiResponse<List<OrderDetailResponse>>>getAllOrder(){
        List<OrderDetailDto> orderDetailDto = orderService.getAllOrders();
        List<OrderDetailResponse> response = orderDetailDto.stream().map(OrderDetailResponse::from).toList();
        ApiResponse<List<OrderDetailResponse>> responses = new ApiResponse<>(
                "Order details fetched successfully",
                response
        );

        return ResponseEntity.ok(responses);
    }
}
