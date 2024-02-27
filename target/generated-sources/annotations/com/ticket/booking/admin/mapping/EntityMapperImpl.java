package com.ticket.booking.admin.mapping;

import com.ticket.booking.admin.dao.AllEventsEntity;
import com.ticket.booking.admin.dao.EventAddressEntity;
import com.ticket.booking.admin.dao.EventTypeEntity;
import com.ticket.booking.admin.model.AllEventsDto;
import com.ticket.booking.admin.model.EventAddressDto;
import com.ticket.booking.admin.model.EventTypeDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-24T17:01:03+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
public class EntityMapperImpl implements EntityMapper {

    @Override
    public AllEventsDto mapEventEntityToDto(AllEventsEntity allEventsEntity) {
        if ( allEventsEntity == null ) {
            return null;
        }

        AllEventsDto allEventsDto = new AllEventsDto();

        if ( allEventsEntity.getId() != null ) {
            allEventsDto.setId( allEventsEntity.getId().intValue() );
        }
        allEventsDto.setEventName( allEventsEntity.getEventName() );
        allEventsDto.setEventDate( allEventsEntity.getEventDate() );
        allEventsDto.setEventAddress( mapEventAddressEntityToDto( allEventsEntity.getEventAddress() ) );
        allEventsDto.setEventType( mapEventTypeEntityToDto( allEventsEntity.getEventType() ) );

        return allEventsDto;
    }

    @Override
    public AllEventsEntity mapEventDtoToEntity(AllEventsDto allEventsDto) {
        if ( allEventsDto == null ) {
            return null;
        }

        AllEventsEntity allEventsEntity = new AllEventsEntity();

        if ( allEventsDto.getId() != null ) {
            allEventsEntity.setId( allEventsDto.getId().longValue() );
        }
        allEventsEntity.setEventName( allEventsDto.getEventName() );
        allEventsEntity.setEventDate( allEventsDto.getEventDate() );
        allEventsEntity.setEventAddress( mapEventAddressDtoToEntity( allEventsDto.getEventAddress() ) );
        allEventsEntity.setEventType( mapEventTypeDtoToEntity( allEventsDto.getEventType() ) );

        return allEventsEntity;
    }

    @Override
    public EventAddressDto mapEventAddressEntityToDto(EventAddressEntity addressEntity) {
        if ( addressEntity == null ) {
            return null;
        }

        EventAddressDto eventAddressDto = new EventAddressDto();

        eventAddressDto.setId( addressEntity.getId() );
        eventAddressDto.setAddress( addressEntity.getAddress() );

        return eventAddressDto;
    }

    @Override
    public EventAddressEntity mapEventAddressDtoToEntity(EventAddressDto eventAddressDto) {
        if ( eventAddressDto == null ) {
            return null;
        }

        EventAddressEntity eventAddressEntity = new EventAddressEntity();

        eventAddressEntity.setId( eventAddressDto.getId() );
        eventAddressEntity.setAddress( eventAddressDto.getAddress() );

        return eventAddressEntity;
    }

    @Override
    public EventTypeDto mapEventTypeEntityToDto(EventTypeEntity eventTypeEntity) {
        if ( eventTypeEntity == null ) {
            return null;
        }

        EventTypeDto eventTypeDto = new EventTypeDto();

        eventTypeDto.setId( eventTypeEntity.getId() );

        return eventTypeDto;
    }

    @Override
    public EventTypeEntity mapEventTypeDtoToEntity(EventTypeDto eventTypeDto) {
        if ( eventTypeDto == null ) {
            return null;
        }

        EventTypeEntity eventTypeEntity = new EventTypeEntity();

        eventTypeEntity.setId( eventTypeDto.getId() );

        return eventTypeEntity;
    }
}
