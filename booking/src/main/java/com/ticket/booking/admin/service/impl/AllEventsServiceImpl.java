package com.ticket.booking.admin.service.impl;

import com.ticket.booking.admin.dao.repo.AllEventsRepository;
import com.ticket.booking.admin.mapping.EntityMapper;
import com.ticket.booking.admin.model.AllEventsDto;
import com.ticket.booking.admin.service.AllEventsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllEventsServiceImpl implements AllEventsService {

    private final AllEventsRepository allEventsRepository;

    public AllEventsServiceImpl(AllEventsRepository allEventsRepository) {
        this.allEventsRepository = allEventsRepository;
    }

    @Override
    public void saveEvent(AllEventsDto allEventsDto) {

        allEventsRepository.save( EntityMapper.INSTANCE.mapEventDtoToEntity(allEventsDto));
    }

    @Override
    public Integer updateEvent(AllEventsDto allEventsDto) {
        return null;
    }

    @Override
    public Integer deleteEvent(AllEventsDto allEventsDto) {
        return null;
    }

    @Override
    public AllEventsDto getEvent() {
        return null;
    }

    @Override
    public List<AllEventsDto> getAllEvents() {
        return null;
    }
}
