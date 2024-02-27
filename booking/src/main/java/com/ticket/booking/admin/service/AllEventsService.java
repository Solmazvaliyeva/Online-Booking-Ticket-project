package com.ticket.booking.admin.service;

import com.ticket.booking.admin.model.AllEventsDto;

import java.util.List;

public interface AllEventsService {
    void saveEvent(AllEventsDto allEventsDto);
    Integer updateEvent(AllEventsDto allEventsDto);
    Integer deleteEvent(AllEventsDto allEventsDto);
    AllEventsDto getEvent();
    List<AllEventsDto> getAllEvents();


}
