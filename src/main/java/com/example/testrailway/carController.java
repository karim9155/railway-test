package com.example.testrailway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class carController {

    @Autowired
    private CarRepository carRepository;

    // API to add a car
    @PostMapping("/add")
    public Car addCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    // API to show all cars
    @GetMapping("/all")
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}