package com.iuh.doanrapphim.service.impl;

import com.iuh.doanrapphim.model.Film;
import com.iuh.doanrapphim.repository.FilmRepository;
import com.iuh.doanrapphim.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepository filmRepository;


    @Override
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public Film getFilmByID(Long id) {
        return filmRepository.findById(id).get();
    }

    @Override
    public Film addFilm(Film film) {
        filmRepository.save(film);
        return film;
    }

    @Override
    public String deleteFilmByID(Long id) {
        Film film = getFilmByID(id);
        if(film == null){
            return "FAILURE";
        }
        film.setStatus(0);
        filmRepository.saveAndFlush(film);
        return "SUCCESS";

    }
}
