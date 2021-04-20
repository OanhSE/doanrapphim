package com.iuh.doanrapphim.service.impl;

import com.iuh.doanrapphim.model.Hall;
import com.iuh.doanrapphim.repository.CinemaRepository;
import com.iuh.doanrapphim.repository.HallRepository;
import com.iuh.doanrapphim.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HallServiceImpl implements HallService {

    @Autowired
    private HallRepository hallRepository;
    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public List<Hall> getAllHall() {
        return hallRepository.findAll();
    }

    @Override
    public Hall getHallByID(Long id) {
        return hallRepository.findById(id).get();
    }

    @Override
    public String deleteHallByID(Long id) {
        Hall hall = getHallByID(id);
        if(hall == null){
            return "FAILURE";
        }
        hall.setStatus(0);
        hallRepository.saveAndFlush(hall);
        return "SUCCESS";
    }

    @Override
    public Hall addHall(Hall hall) {
        hallRepository.save(hall);
        return hall;
    }

    @Override
    public List<Hall> getHallByCinema(Long idCinema) {
        return hallRepository.findByCinema(cinemaRepository.getOne(idCinema));
    }
}
