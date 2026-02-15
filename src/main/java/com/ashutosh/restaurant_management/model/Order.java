package com.ashutosh.restaurant_management.model;

import com.ashutosh.restaurant_management.enums.OrderStatus;
import com.ashutosh.restaurant_management.enums.OrderType;
import com.ashutosh.restaurant_management.enums.PaymentStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    private int id;

    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "order_type")
    private OrderType orderType;

    @Column(name = "order_status")
    private OrderStatus orderStatus;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name = "payment_status")
    private PaymentStatus paymentStatus;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "created_at")
    private Timestamp createdAt;
}
