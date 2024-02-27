package com.ticket.booking.admin.dao.repo;

import com.ticket.booking.admin.dao.AllEventsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllEventsRepository  extends JpaRepository<AllEventsEntity,Integer> {
}
