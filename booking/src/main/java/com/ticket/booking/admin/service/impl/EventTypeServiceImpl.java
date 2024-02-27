package com.ticket.booking.admin.service.impl;

import com.ticket.booking.admin.dao.repo.EventTypeRepo;
import com.ticket.booking.admin.model.EventAddressDto;
import com.ticket.booking.admin.model.EventTypeDto;
import com.ticket.booking.admin.service.EventTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventTypeServiceImpl implements EventTypeService {

    private final EventTypeRepo eventTypeRepo;

    public EventTypeServiceImpl(EventTypeRepo eventTypeRepo) {
        this.eventTypeRepo = eventTypeRepo;
    }

    @Override
    public Integer saveType(EventTypeDto eventTypeDto) {
        return null;
    }

    @Override
    public Integer updateType(EventTypeDto eventTypeDto) {
        return null;
    }

    @Override
    public Integer deleteType(EventTypeDto eventTypeDto) {
        return null;
    }

    @Override
    public List<EventAddressDto> getAllTypes() {
        return null;
    }

    @Override
    public EventAddressDto getType() {
        return null;
    }
}
