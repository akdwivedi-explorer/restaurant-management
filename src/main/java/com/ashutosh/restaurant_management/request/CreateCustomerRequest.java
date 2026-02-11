package com.ashutosh.restaurant_management.request;

import com.ashutosh.restaurant_management.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String avatarUrl;
    private RoleType roleType;
    private Boolean isActive;
}
