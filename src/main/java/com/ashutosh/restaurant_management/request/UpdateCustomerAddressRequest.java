package com.ashutosh.restaurant_management.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerAddressRequest {
    private int customerId;
    private String cityName;
    private String streetName;
    private Integer pincode;
    private Double longitude;
    private Double latitude;
    private Boolean isDefault;
}
