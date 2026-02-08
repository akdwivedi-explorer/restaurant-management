package com.ashutosh.restaurant_management.dto;

import com.ashutosh.restaurant_management.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private RoleType roleType;
    private String avatarUrl;
    private boolean isActive;
    private String createdAt;
    private String updatedAt;
}