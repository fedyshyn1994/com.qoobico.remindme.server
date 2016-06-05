package com.qoobico.remindme.server.controller;

import com.qoobico.remindme.server.service.TicketService;
import com.qoobico.remindme.server.entity.Ticked;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketsController {

    @Autowired
    private TicketService service;

    @RequestMapping(value = "/tickets", method = RequestMethod.GET)
    @ResponseBody
    public List<Ticked> getAllReminders() {
        return service.getAll();
    }

    @RequestMapping(value = "/tickets/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Ticked getReminder(@PathVariable("id") long remindID) {
        return service.getByID(remindID);
    }

    @RequestMapping(value = "/tickets", method = RequestMethod.POST)
    @ResponseBody
    public Ticked saveRemider(@RequestBody Ticked ticked) {
        return service.save(ticked);
    }

    @RequestMapping(value = "/tickets/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }

}
