package com.iuh.doanrapphim.service;

import com.iuh.doanrapphim.model.Ticket;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TicketService {
    List<Ticket> findAll(Integer pageNumber);

    Ticket findById(Long id);

    void update(Ticket ticket);
}
