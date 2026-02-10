package com.ashutosh.restaurant_management.repository;

import com.ashutosh.restaurant_management.model.Address;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository {
    Optional<List<Address>> findByCustomerId(int customerId);

    Optional<Address> findByCustomerIdAndId(int customerId, int addressId);
}
