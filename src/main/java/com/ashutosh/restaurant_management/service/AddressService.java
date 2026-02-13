package com.ashutosh.restaurant_management.service;

import com.ashutosh.restaurant_management.request.UpdateCustomerAddressRequest;

public interface AddressService {

    Integer updateAddress(int addressId, UpdateCustomerAddressRequest request);

    Integer setAddressAsDefault(int addressId);

    Integer deleteAddress(int addressId);
}
