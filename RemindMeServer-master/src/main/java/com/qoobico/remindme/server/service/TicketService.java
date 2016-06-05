package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.entity.Ticked;

import java.util.List;

public interface TicketService {

    List<Ticked> getAll();
    Ticked getByID(long id);
    Ticked save(Ticked ticked);
    void remove(long id);

}
