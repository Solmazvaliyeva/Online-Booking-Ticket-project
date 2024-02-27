package com.ticket.booking.admin.dao.repo;

import com.ticket.booking.admin.dao.EventTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepo extends JpaRepository<EventTypeEntity, Integer> {
}
