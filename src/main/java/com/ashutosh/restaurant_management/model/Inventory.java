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
@Table(name = "inventory")
public class Inventory {
    @Id
    private int id;

    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "ingredient_name")
    private String ingredientName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "unit")
    private int unit;

    @Column(name = "threshold")
    private int threshold;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "created_at")
    private Timestamp createdAt;
}
