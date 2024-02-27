package com.ticket.booking.admin.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllEventsDto {
    @JsonIgnore
    private Integer id;
    private String eventName;
    private Date eventDate;
    private EventAddressDto eventAddress;
    private EventTypeDto eventType;
}
