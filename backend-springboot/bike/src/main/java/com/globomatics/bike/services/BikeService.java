package com.globomatics.bike.services;

import com.globomatics.bike.models.Bike;

import java.util.List;

public interface BikeService {
    public List<Bike> getAllBikes();

    public Bike getBike(long id);

    public void createBike(Bike bike);
}
