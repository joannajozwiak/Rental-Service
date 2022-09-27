package com.rental.service;

public interface IRentalRepository {
    public void rentCar (CarDto carDto);

    public void returnCar (CarDto carDto);
}
