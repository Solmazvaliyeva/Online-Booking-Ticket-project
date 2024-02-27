package com.ticket.booking.admin.mapping;

import com.ticket.booking.admin.dao.AllEventsEntity;
import com.ticket.booking.admin.dao.EventAddressEntity;
import com.ticket.booking.admin.dao.EventTypeEntity;
import com.ticket.booking.admin.model.AllEventsDto;
import com.ticket.booking.admin.model.EventAddressDto;
import com.ticket.booking.admin.model.EventTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EntityMapper {

    EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);

    AllEventsDto mapEventEntityToDto(AllEventsEntity allEventsEntity);

    AllEventsEntity mapEventDtoToEntity(AllEventsDto allEventsDto);

    EventAddressDto mapEventAddressEntityToDto(EventAddressEntity addressEntity);

    EventAddressEntity mapEventAddressDtoToEntity(EventAddressDto eventAddressDto);

    EventTypeDto mapEventTypeEntityToDto(EventTypeEntity eventTypeEntity);

    EventTypeEntity mapEventTypeDtoToEntity(EventTypeDto eventTypeDto);


}
