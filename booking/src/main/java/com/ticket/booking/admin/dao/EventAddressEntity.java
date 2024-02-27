package com.ticket.booking.admin.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "event_addresses")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventAddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String address;

    @OneToOne(mappedBy = "eventAddress" ,cascade = CascadeType.REMOVE)
    private AllEventsEntity allEventsEntity;




}
