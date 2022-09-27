package com.rental.service;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class RentalServiceApplicationTests {
    @Mock
    private IAvailabiltyService iAvailabiltyServiceMock;
    @Mock
    private IRentalRepository iRentalRepositoryMock;
    @Mock
    private CarBase carBaseMock;

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Test
    void testAddCar() {
        //Given
        CarBase carBase = new CarBase();
        // When
        Car car = new Car("BMW", "X3", 2022, "PZ1111", true);
        Car car1 = new Car("BMW", "X7", 2022, "PZ12111", true);
        carBase.addCar(car);
        carBase.addCar(car1);
        // Then
        assertEquals(6, carBase.getCars().size());
    }

    @Test
    void testDeleteCar() {
        //Given
        CarBase carBase = new CarBase();
        CarDto carDto1 = new CarDto("Audi", "Q7", 2020);
        // When
        Car car = carBase.findCar(carDto1);
        carBase.deleteCar(car);
        // Then
        assertEquals(3, carBase.getCars().size());
    }

    @Test
    void testRent() {
        //Given
        RentRequest rentRequest1 = new RentRequest(new User("Jan", "Nowak"), new CarDto("Audi", "Q7", 2020));
        when(iAvailabiltyServiceMock.carAvailable(rentRequest1.getCarDto())).thenReturn(true);
        //When
        RentalService rentalService = new RentalService(iAvailabiltyServiceMock, iRentalRepositoryMock, carBaseMock);
        RentalDto rentalDto = rentalService.rent(rentRequest1);
        //Then
        assertEquals(true, rentalDto.isRented());


    }


}
