package com.globomatics.bike.controllers;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;
import com.globomatics.bike.services.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/bikes")
public class BikesController {

    @Autowired
    BikeService bikeService;

    @GetMapping
    public List<Bike> getAllBikes() {

        return bikeService.getAllBikes();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createBike(@RequestBody Bike bike) {

        bikeService.createBike(bike);
    }

    @GetMapping(path = "/{id}")
    public Bike getBike(@PathVariable long id) {

        return bikeService.getBike(id);
    }
}
