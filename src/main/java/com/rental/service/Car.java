package com.rental.service;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String idNumber;
    private boolean isAvailable;

    public Car(String brand, String model, int year, String idNumber, boolean isAvailable) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.idNumber = idNumber;
        this.isAvailable = isAvailable;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
