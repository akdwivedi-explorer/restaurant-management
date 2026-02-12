package com.ashutosh.restaurant_management.service.impl;

import com.ashutosh.restaurant_management.exception.AddressNotFoundException;
import com.ashutosh.restaurant_management.model.Address;
import com.ashutosh.restaurant_management.repository.AddressRepository;
import com.ashutosh.restaurant_management.request.UpdateCustomerAddressRequest;
import com.ashutosh.restaurant_management.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.time.Instant;

@AllArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public Integer updateAddress(int addressId, UpdateCustomerAddressRequest request) {
        Address address = addressRepository.findById(addressId).orElseThrow(() -> new AddressNotFoundException("Address not found"));

        if (!StringUtils.hasText(request.getCityName())) {
            address.setCityName(request.getCityName());
        }

        if (!StringUtils.hasText(request.getStreetName())) {
            address.setStreetName(request.getStreetName());
        }

        if (request.getPincode() != null) {
            address.setPincode(request.getPincode());
        }

        if (request.getLatitude() != null) {
            address.setLatitude(request.getLatitude());
        }

        if (request.getLongitude() != null) {
            address.setLongitude(request.getLongitude());
        }

        if (request.getIsDefault() != null) {
            address.setDefault(request.getIsDefault());
        }

        address.setUpdatedAt(Timestamp.from(Instant.now()));

        addressRepository.save(address);

        return address.getId();
    }

    @Override
    public Integer setAddressAsDefault(int addressId){
        Address address = addressRepository.findById(addressId).orElseThrow(() -> new AddressNotFoundException("Address not found"));

        address.setDefault(true);

        addressRepository.save(address);

        return address.getId();
    }
}
