package com.iuh.doanrapphim.service;

import com.iuh.doanrapphim.model.Hall;

import java.util.List;

public interface HallService {
    List<Hall> getAllHall();

    Hall getHallByID(Long id);

    String deleteHallByID(Long id);

    Hall addHall(Hall hall);

    List<Hall> getHallByCinema(Long idCinema);



}
