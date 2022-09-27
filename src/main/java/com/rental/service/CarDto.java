package com.rental.service;

public class CarDto {
    private String brand;
    private String model;
    private int year;


    public CarDto(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

}
