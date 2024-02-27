package com.ticket.booking.admin.service.impl;

import com.ticket.booking.admin.dao.EventAddressEntity;
import com.ticket.booking.admin.dao.repo.EventAddressesRepo;
import com.ticket.booking.admin.mapping.EntityMapper;
import com.ticket.booking.admin.model.EventAddressDto;
import com.ticket.booking.admin.service.EventAddressService;
import com.ticket.booking.exception.NoDataFoundException;
import org.hibernate.event.spi.EventManager;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EventAddressServiceImpl implements EventAddressService {

    private final EventAddressesRepo eventAddressesRepo;

    public EventAddressServiceImpl(EventAddressesRepo eventAddressesRepo) {
        this.eventAddressesRepo = eventAddressesRepo;
    }

    @Override
    public Integer saveAddress(EventAddressDto eventAddressDto) {
        return eventAddressesRepo.save(EntityMapper.INSTANCE
                .mapEventAddressDtoToEntity(eventAddressDto)).getId();
    }

    @Override
    public Integer updateAddress(EventAddressDto eventAddressDto) {
        return null;
    }

    @Override
    public Integer deleteAddress(EventAddressDto eventAddressDto) {
        return null;
    }

    @Override
    public List<EventAddressDto> getAllAddresses() {

        return eventAddressesRepo.findAll()
                .stream()
                .map(it-> EntityMapper.INSTANCE.mapEventAddressEntityToDto(it)).toList();


    }

    @Override
    public EventAddressDto getAddress(Integer id) {

     EventAddressEntity entity = eventAddressesRepo
             .findById(id).orElseThrow(()-> new NoDataFoundException("Address not found "));

         return  EntityMapper.INSTANCE.mapEventAddressEntityToDto(entity);


    }
}
