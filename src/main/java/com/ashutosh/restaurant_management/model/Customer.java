package com.ashutosh.restaurant_management.model;

import com.ashutosh.restaurant_management.enums.RoleType;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "auth_token")
    private String authToken;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "role")
    private RoleType role;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @JoinColumn(referencedColumnName = "id")
    private Address address;
}
