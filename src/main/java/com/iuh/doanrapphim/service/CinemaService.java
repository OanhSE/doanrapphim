package com.iuh.doanrapphim.service;

import com.iuh.doanrapphim.model.Cinema;

import java.util.List;

public interface CinemaService {


    List<Cinema> getAllCinema();

    Cinema addCinema(Cinema cinema);

    String deleteCinemaByID(Long id);

    Cinema getCinemaByID(Long id);

    List<Cinema> getCinemasByAddress(Long address);

}
