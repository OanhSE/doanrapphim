package com.iuh.doanrapphim.service;


import com.iuh.doanrapphim.model.Film;
import org.springframework.data.domain.Page;

import java.util.List;

public interface FilmService {

    List<Film> getAllFilms();

    Film getFilmByID(Long id);

    Film addFilm(Film film);

    String deleteFilmByID(Long id);



}
