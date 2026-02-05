package com.ashutosh.restaurant_management.model;

import com.ashutosh.restaurant_management.enums.ReservationStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    private int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "table_id")
    private int tableId;

    @Column(name = "reservation_time")
    private LocalTime reservationTime;

    @Column(name = "guest_count")
    private int guestCount;

    @Column(name = "reservation_status")
    private ReservationStatus reservationStatus;
}
