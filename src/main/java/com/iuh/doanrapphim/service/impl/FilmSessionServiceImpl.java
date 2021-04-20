package com.iuh.doanrapphim.service.impl;

import com.iuh.doanrapphim.model.Film;
import com.iuh.doanrapphim.model.FilmSession;
import com.iuh.doanrapphim.model.Hall;
import com.iuh.doanrapphim.repository.FilmSessionRepository;
import com.iuh.doanrapphim.repository.HallRepository;
import com.iuh.doanrapphim.service.FilmSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FilmSessionServiceImpl implements FilmSessionService {

    @Autowired
    private FilmSessionRepository filmSessionRepository;
    @Autowired
    private HallRepository hallRepository;

    @Override
    public FilmSession addSession(FilmSession filmSession) {
        filmSessionRepository.save(filmSession);
        return filmSession;
    }

    @Override
    public String deleteSessionById(Long id) {
        FilmSession filmSession = getSessionById(id);
        if(filmSession == null){
            return "FAILURE";
        }
        filmSessionRepository.deleteById(id);
        return "SUCCESS";
    }

    @Override
    public List<FilmSession> getAllSession() {
        return filmSessionRepository.findAll();
    }

    @Override
    public FilmSession getSessionById(Long id) {
        return filmSessionRepository.findById(id).get();
    }

    @Override
    public FilmSession update(FilmSession filmSession) {
        return filmSessionRepository.save(filmSession);
    }

    @Override
    public List<FilmSession> getSessionByDateAndHall(Date date, Long hallId) {
        List<FilmSession> filmSessions = new ArrayList<>();
        try {
            Hall hall = hallRepository.getOne(hallId);
            filmSessions = filmSessionRepository.findByDateAndAndHall(date,hall);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return filmSessions;
    }

    @Override
    public FilmSession getSessionByMovie(Film film) {

        return null;
    }

    //getFilmSessionByCinemaId
    //theo ngay va rap
    //

}
