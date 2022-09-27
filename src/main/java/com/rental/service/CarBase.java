package com.rental.service;

import java.util.ArrayList;
import java.util.List;


public class CarBase {
    private List<Car> cars = new ArrayList<>();

    public CarBase() {
        cars.add(new Car ("Audi", "Q7", 2020, "PO1234", true));
        cars.add(new Car ("Volvo", "XC 90", 2019, "PO89890", true));
        cars.add(new Car ("Skoda", "Octavia", 2018, "PZ2345", true));
        cars.add(new Car ("Fiat", "500", 2021, "PO5678", true));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void deleteCar (Car car){
        cars.remove(car);
    }

    public Car findCar(CarDto carDto) {
        for(Car car:cars) {
            if (
            car.getBrand().equals(carDto.getBrand()) &&
                    car.getModel().equals(carDto.getModel()) &&
                    car.getYear()==carDto.getYear()){
                return car;
            }
        }
        System.out.println("Car is not found");
        return null;
    }

    public Car editCar (Car car, boolean available) {
        for(Car carDb:cars) {
            if (
                    carDb.getBrand().equals(car.getBrand()) &&
                            carDb.getModel().equals(car.getModel()) &&
                            carDb.getYear()==car.getYear()){
                carDb.setAvailable(available);
            }
            }
        return car;
    }

}
