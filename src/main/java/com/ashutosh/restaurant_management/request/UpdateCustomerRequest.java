package com.ashutosh.restaurant_management.request;

import com.ashutosh.restaurant_management.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateCustomerRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private RoleType roleType;
    private Boolean isActive;
    private String avatarUrl;
}
