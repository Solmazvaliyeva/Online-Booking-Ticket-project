package com.ticket.booking.admin.service;

import com.ticket.booking.admin.model.EventAddressDto;

import java.util.List;


public interface EventAddressService {
    Integer saveAddress(EventAddressDto eventAddressDto);

    Integer updateAddress(EventAddressDto eventAddressDto);

    Integer deleteAddress(EventAddressDto eventAddressDto);

    List<EventAddressDto> getAllAddresses();

    EventAddressDto getAddress(Integer id);

}
