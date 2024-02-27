package com.ticket.booking.admin.dao.repo;

import com.ticket.booking.admin.dao.EventAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventAddressesRepo extends JpaRepository<EventAddressEntity, Integer> {

}
