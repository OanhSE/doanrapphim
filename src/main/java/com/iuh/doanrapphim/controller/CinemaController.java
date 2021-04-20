package com.iuh.doanrapphim.controller;

import com.iuh.doanrapphim.model.Cinema;
import com.iuh.doanrapphim.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/cinema")
    public List<Cinema> getAll(){
        return cinemaService.getAllCinema();
    }

    @PostMapping("/cinemas")
    public Cinema addCinema(@RequestBody Cinema cinema){
        return cinemaService.addCinema(cinema);
    }

    @DeleteMapping("/cinemas/{id}")
    public String deleteCinema(@PathVariable("id") Long id){
        return cinemaService.deleteCinemaByID(id);
    }

    @GetMapping("/cinemas/{id}")
    public Cinema getCinemaById(@PathVariable("id") Long id){
        return cinemaService.getCinemaByID(id);
    }

    @GetMapping("/cinemas/address/{address}")
    public List<Cinema> getCinemaByAddress(@PathVariable("address") Long address ){
        return cinemaService.getCinemasByAddress(address);
    }






    //tim theo khu vuc
    //hall total in cinema and seat total in cinema
    //filmsession by day and cinema
    //ticket by
    //discount

}
