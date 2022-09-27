package com.rental.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RentRequest {
    private User user;
    private CarDto carDto;


    public RentRequest(User user, CarDto carDto) {
        this.user = user;
        this.carDto = carDto;
    }

    public User getUser() {
        return user;
    }

    public CarDto getCarDto() {
        return carDto;
    }

}
