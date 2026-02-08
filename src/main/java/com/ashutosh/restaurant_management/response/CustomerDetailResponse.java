package com.ashutosh.restaurant_management.response;

import com.ashutosh.restaurant_management.dto.CustomerDto;
import com.ashutosh.restaurant_management.enums.RoleType;
import lombok.Builder;

@Builder
public class CustomerDetailResponse {
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

    public static CustomerDetailResponse from(CustomerDto customer){
        return CustomerDetailResponse.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .email(customer.getEmail())
                .mobileNumber(customer.getMobileNumber())
                .roleType(customer.getRoleType())
                .avatarUrl(customer.getAvatarUrl())
                .isActive(customer.isActive())
                .createdAt(customer.getCreatedAt())
                .updatedAt(customer.getUpdatedAt())
                .build();
    }
}
