package com.iuh.doanrapphim.controller;

import com.iuh.doanrapphim.model.Film;
import com.iuh.doanrapphim.service.FilmService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmController {

    @Autowired
    private FilmService filmService;

    Logger logger = LogManager.getLogger(FilmController.class);

    @PostMapping("/insert")
    public Film insert(Film phim) {
        return filmService.addFilm(phim);
    }

    @GetMapping("/getMovies")
    public List<Film> getAll() {

        logger.info("Call getAll()");
        List<Film> list = filmService.getAllFilms();
        return list;
    }

    /*@DeleteMapping("/xoaPhim/{id}")
    public String xoaPhim(@PathVariable String id) {
        return movieImpl.xoaPhim(id);
    }*/
}
