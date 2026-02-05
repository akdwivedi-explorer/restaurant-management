package com.ashutosh.restaurant_management.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ReservationStatus {
    BOOKED("Booked"),
    CANCELLED("Cancelled"),
    COMPLETED("Completed");

    private final String reservationDescription;
}
