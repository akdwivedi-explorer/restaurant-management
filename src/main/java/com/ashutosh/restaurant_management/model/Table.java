package com.ashutosh.restaurant_management.model;

import com.ashutosh.restaurant_management.enums.TableStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@jakarta.persistence.Table(name = "table")
public class Table {
    @Id
    private int id;

    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "table_number")
    private int tableNumber;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "table_status")
    private TableStatus tableStatus;
}
