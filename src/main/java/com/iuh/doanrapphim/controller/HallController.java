package com.iuh.doanrapphim.controller;

import com.iuh.doanrapphim.model.Hall;
import com.iuh.doanrapphim.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HallController {

    @Autowired
    private HallService hallService;

    @GetMapping("/halls/{idCinema}")
    public List<Hall> getHallByCinema(@PathVariable("idCinema") Long idCinema){
        return hallService.getHallByCinema(idCinema);
    }

    @PostMapping("/halls/{idCinema}")
    public Hall add(@PathVariable("idCinema") Long idCinema, @RequestBody Hall hall){
        return hallService.addHall(hall);
    }



}
