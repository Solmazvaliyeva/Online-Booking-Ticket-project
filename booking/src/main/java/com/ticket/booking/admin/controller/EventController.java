package com.ticket.booking.admin.controller;

import com.ticket.booking.admin.model.AllEventsDto;
import com.ticket.booking.admin.service.AllEventsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0/event")
public class EventController {

    private final AllEventsService allEventsService;


    public EventController(AllEventsService allEventsService) {
        this.allEventsService = allEventsService;
    }

    @PostMapping("/post")
    public  void saveEvent(@RequestBody AllEventsDto allEventsDto){
        allEventsService.saveEvent(allEventsDto);
    }
}
