package com.ashutosh.restaurant_management.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerAddressRequest {
    private String cityName;
    private String streetName;
    private int pincode;
    private double longitude;
    private double latitude;
    private boolean isDefault;
}
