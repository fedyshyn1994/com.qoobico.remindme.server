package com.qoobico.remindme.server.repository;

import com.qoobico.remindme.server.entity.Ticked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticked, Long> {
}
