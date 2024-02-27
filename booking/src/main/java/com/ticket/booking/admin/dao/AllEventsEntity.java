package com.ticket.booking.admin.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "all_events_tbl")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AllEventsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String eventName;

    @Column
    private Date eventDate ;

    @OneToOne(cascade = CascadeType.REMOVE )
    @JoinColumn(columnDefinition = "address_id" ,referencedColumnName = "id")
    private EventAddressEntity eventAddress;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(columnDefinition = "event_type_id" ,referencedColumnName = "id")
    EventTypeEntity eventType;



}
