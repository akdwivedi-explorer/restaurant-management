package com.ashutosh.restaurant_management.model;

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
@Table(name = "order_item")
public class OrderItem {
    @Id
    private int id;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "food_id")
    private int foodId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price_at_order_time")
    private double priceAtOrderTime;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "created_at")
    private Timestamp createdAt;
}
