package com.rental.service;

public class RentalRepository implements IRentalRepository {
    private CarBase carBase;

    public RentalRepository(CarBase carBase) {
        this.carBase = carBase;
    }

    @Override
    public void rentCar(CarDto carDto) {
        Car car = carBase.findCar(carDto);
        carBase.editCar(car, false);
    }

    @Override
    public void returnCar(CarDto carDto) {
        Car car = carBase.findCar(carDto);
        carBase.editCar(car, true);
    }
}
