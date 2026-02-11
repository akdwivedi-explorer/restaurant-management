package com.ashutosh.restaurant_management.repository;

import com.ashutosh.restaurant_management.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    Optional<List<Address>> findByCustomerId(int customerId);

    Optional<Address> findByCustomerIdAndId(int customerId, int addressId);
}
