package com.iuh.doanrapphim.controller;

import com.iuh.doanrapphim.model.FilmSession;
import com.iuh.doanrapphim.service.CinemaService;
import com.iuh.doanrapphim.service.FilmSessionService;
import com.iuh.doanrapphim.service.HallService;
import com.iuh.doanrapphim.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmSessionController {

    @Autowired
    private FilmSessionService filmSessionService;
    @Autowired
    private CinemaService cinemaService;
    @Autowired
    private HallService hallService;
    @Autowired
    private TicketService ticketService;

    @PostMapping("/admin/add-session")
    public FilmSession addSession(@RequestBody FilmSession filmSession){
        return filmSessionService.addSession(filmSession);
    }

    @GetMapping("/admin/delete/session/{id}")
    public String deleteSession(@PathVariable Long id){
        return filmSessionService.deleteSessionById(id);
    }

    @GetMapping("/admin/session")
    public List<FilmSession> getSession(){
        return filmSessionService.getAllSession();
    }

    @GetMapping("/session")
    public FilmSession update(@RequestBody FilmSession filmSession){
        return filmSessionService.update(filmSession);
    }

//    @GetMapping("/filmSessions")
//    public List<FilmSession> getFilmSessionByCinemaAndDate(){
//
//    }

}
