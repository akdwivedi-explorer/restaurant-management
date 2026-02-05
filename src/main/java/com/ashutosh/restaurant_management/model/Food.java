package com.ashutosh.restaurant_management.model;

import com.ashutosh.restaurant_management.enums.FoodType;
import com.ashutosh.restaurant_management.enums.SpiceLevel;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "food")
public class Food {
    @Id
    private int id;

    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "food_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private FoodType foodType;

    @Column(name = "spice_level")
    private SpiceLevel spiceLevel;

    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "is_available")
    private boolean isAvailable;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
