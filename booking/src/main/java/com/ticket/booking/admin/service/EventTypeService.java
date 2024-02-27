package com.ticket.booking.admin.service;

import com.ticket.booking.admin.model.EventAddressDto;
import com.ticket.booking.admin.model.EventTypeDto;

import java.util.List;

public interface EventTypeService {

    Integer saveType(EventTypeDto eventTypeDto);

    Integer updateType(EventTypeDto eventTypeDto);

    Integer deleteType(EventTypeDto eventTypeDto);

    List<EventAddressDto> getAllTypes();

    EventAddressDto getType();
}
