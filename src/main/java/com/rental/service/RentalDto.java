package com.rental.service;

public class RentalDto {
    private User user;
    private CarDto carDto;
    private boolean isRented;

    public RentalDto(User user, CarDto carDto, boolean isRented) {
        this.user = user;
        this.carDto = carDto;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public CarDto getCarDto() {
        return carDto;
    }

    public boolean isRented() {
        return isRented;
    }
}
