package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.entity.Ticked;
import com.qoobico.remindme.server.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository repository;

    public List<Ticked> getAll() {
        return repository.findAll();
    }

    public Ticked getByID(long id) {
        return repository.findOne(id);
    }

    public Ticked save(Ticked ticked) {
        return repository.saveAndFlush(ticked);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
