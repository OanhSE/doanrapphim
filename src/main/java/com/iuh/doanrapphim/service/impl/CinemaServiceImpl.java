package com.iuh.doanrapphim.service.impl;

import com.iuh.doanrapphim.model.Cinema;
import com.iuh.doanrapphim.repository.AddressRepository;
import com.iuh.doanrapphim.repository.CinemaRepository;
import com.iuh.doanrapphim.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Cinema> getAllCinema() {
        return cinemaRepository.findAll();
    }


    @Override
    public Cinema addCinema(Cinema cinema) {
        cinemaRepository.saveAndFlush(cinema);
        return cinema;
    }

    @Override
    public String deleteCinemaByID(Long id) {
        if (existCinema(id)){
            cinemaRepository.deleteById(id);
            return "SUCCESS";
        }
        return "FAILURE";
    }

    @Override
    public Cinema getCinemaByID(Long id) {
        return cinemaRepository.findById(id).get();
    }

    @Override
    public List<Cinema> getCinemasByAddress(Long address) {

        return cinemaRepository.getCinemaByAddress(addressRepository.getOne(address));
    }

    private boolean existCinema(Long id) {

        return cinemaRepository.existsById(id);
    }
}
