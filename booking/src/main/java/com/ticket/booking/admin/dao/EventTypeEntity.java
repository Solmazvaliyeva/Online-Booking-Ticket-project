package com.ticket.booking.admin.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "event_types")
public class EventTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String eventTypeName;

    @OneToOne(mappedBy = "eventType" ,cascade = CascadeType.REMOVE)
    AllEventsEntity allEventsEntity;
}
