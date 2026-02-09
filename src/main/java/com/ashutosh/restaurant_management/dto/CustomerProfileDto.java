package com.ashutosh.restaurant_management.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerProfileDto {
    List<CustomerAddressDto> customerAddress;
    CustomerDetailDto customerDetail;
}
