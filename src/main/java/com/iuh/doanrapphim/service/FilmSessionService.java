package com.iuh.doanrapphim.service;

import com.iuh.doanrapphim.model.Film;
import com.iuh.doanrapphim.model.FilmSession;
import com.iuh.doanrapphim.model.Hall;

import java.util.Date;
import java.util.List;

public interface FilmSessionService {

    FilmSession addSession(FilmSession filmSession);

    String deleteSessionById(Long id);

    List<FilmSession> getAllSession();

    FilmSession getSessionById(Long id);

    FilmSession update(FilmSession filmSession);

    List<FilmSession> getSessionByDateAndHall(Date date, Long hallId);

    FilmSession getSessionByMovie(Film film);

//    List<FilmSession> getFilmSessionByCinemaAndDate()
}
