package com.rental.service;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rental")
public class RentalController {
    private final CarBase carBase;
    private final RentalService rentalService;

    public RentalController() {
        this.carBase = new CarBase();
        this.rentalService = new RentalService(new AvailabiltyService(carBase), new RentalRepository(carBase), carBase);
    }

    @GetMapping
    public List<Car> getCars() {
        return carBase.getCars();
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        carBase.addCar(car);
    }

    @DeleteMapping
    public void deleteCar(@RequestBody Car car) {
        carBase.deleteCar(car);
    }

    @PutMapping
    public Car editCar(@RequestBody Car car, boolean available) {
        Car car1 = carBase.editCar(car, available);
        return car1;
    }

}
