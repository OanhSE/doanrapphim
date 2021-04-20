package com.iuh.doanrapphim.service.impl;

import com.iuh.doanrapphim.model.Ticket;
import com.iuh.doanrapphim.repository.TicketRepository;
import com.iuh.doanrapphim.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAll(Integer pageNumber) {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket findById(Long id) {
        return ticketRepository.findById(id).get();
    }

    @Override
    public void update(Ticket ticket) {
        ticketRepository.save(ticket);
    }
}
