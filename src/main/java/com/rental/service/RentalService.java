package com.rental.service;

public class RentalService {
    private IAvailabiltyService iAvailabiltyService;
    private IRentalRepository iRentalRepository;
    private CarBase carBase;

    public RentalService(IAvailabiltyService iAvailabiltyService, IRentalRepository iRentalRepository, CarBase carBase) {
        this.iAvailabiltyService = iAvailabiltyService;
        this.iRentalRepository = iRentalRepository;
        this.carBase = carBase;
    }

    public RentalDto rent (final RentRequest rentRequest) {
        boolean isAvailable = iAvailabiltyService.carAvailable(rentRequest.getCarDto());

        if (isAvailable){
            iRentalRepository.rentCar(rentRequest.getCarDto());
            return new RentalDto(rentRequest.getUser(), rentRequest.getCarDto(),  true);
        } else {
            System.out.println("Car " + rentRequest.getCarDto().getBrand() + " is unavaiable");
            return new RentalDto(rentRequest.getUser(), rentRequest.getCarDto(), false);
        }
    }

    public void returnCar (final RentRequest rentRequest) {
            iRentalRepository.returnCar(rentRequest.getCarDto());
        }
}
