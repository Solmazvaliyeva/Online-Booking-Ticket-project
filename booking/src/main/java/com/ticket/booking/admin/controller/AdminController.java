package com.ticket.booking.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/book")
public class AdminController {

    @GetMapping("/hello")
    public String getAllAuthors(){
        return "Hello World";
    }
}
