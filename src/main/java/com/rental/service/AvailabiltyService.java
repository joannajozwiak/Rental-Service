package com.rental.service;

public class AvailabiltyService implements IAvailabiltyService{
    private CarBase carBase;

    public AvailabiltyService(CarBase carBase) {
        this.carBase = carBase;
    }
@Override
    public boolean carAvailable (CarDto carDto) {
        Car car = carBase.findCar(carDto);
        if (car != null){
            return car.isAvailable();}
        return false;
    }
}
