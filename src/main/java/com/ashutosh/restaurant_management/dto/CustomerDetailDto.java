package com.ashutosh.restaurant_management.dto;

import com.ashutosh.restaurant_management.enums.RoleType;
import com.ashutosh.restaurant_management.model.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDetailDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private RoleType roleType;
    private String avatarUrl;
    private boolean isActive;
    private Address address;
    private String createdAt;
    private String updatedAt;
}