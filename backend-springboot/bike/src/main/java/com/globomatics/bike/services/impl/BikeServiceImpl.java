package com.globomatics.bike.services.impl;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;
import com.globomatics.bike.services.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeServiceImpl implements BikeService {

    @Autowired
    BikeRepository bikeRepository;

    @Override
    public List<Bike> getAllBikes() {
        return bikeRepository.findAll();
    }

    @Override
    public Bike getBike(long id) {
        return bikeRepository.getOne(id);
    }

    @Override
    public void createBike(Bike bike) {
        bikeRepository.save(bike);
    }
}
