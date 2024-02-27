package com.ticket.booking.admin.controller;

import com.ticket.booking.admin.model.EventAddressDto;
import com.ticket.booking.admin.model.EventTypeDto;
import com.ticket.booking.admin.service.EventAddressService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/address/")
public class EventAddressController {

    @Autowired
    private EventAddressService eventAddressService;

    @GetMapping("{id}")
    public EventAddressDto getEntityAddress(@PathVariable Integer id){

        return eventAddressService.getAddress(id);
    }

    @PostMapping("post")
    public void saveEntityAddress(@RequestBody EventAddressDto eventAddressDto){
        eventAddressService.saveAddress(eventAddressDto);
    }

}
