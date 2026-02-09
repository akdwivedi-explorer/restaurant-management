package com.ashutosh.restaurant_management.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerAddressDto {
    private int id;
    private int customerId;
    private String cityName;
    private String streetName;
    private int pincode;
    private double latitude;
    private double longitude;
    private boolean isDefault;
    private String createdAt;
    private String updatedAt;
}
