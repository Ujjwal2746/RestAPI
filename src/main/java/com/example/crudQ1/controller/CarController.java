package com.example.crudQ1.controller;

import com.example.crudQ1.model.Car;
import com.example.crudQ1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/")
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("getCars")
    public List<Car> list() {
        return carService.listAllCar();
    }

    @GetMapping("/getCar{id}")
    public ResponseEntity<Car> get(@PathVariable Integer id) {
        try {
            Car car = carService.getCar(id);
            return new ResponseEntity<Car>(car, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Car>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/saveCar")
    public void add(@RequestBody Car car) {
        carService.saveCar(car);
    }
    @PutMapping("/editCar{id}")
    public ResponseEntity<?> update(@RequestBody Car car, @PathVariable Integer id) {
        try {
            Car existUser = carService.getCar(id);
            car.setCarId(id);            
            carService.saveCar(car);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/deleteCar{id}")
    public void delete(@PathVariable Integer id) {

        carService.deleteCar(id);
    }
    @GetMapping("/getCar/{modelName}")
    public ResponseEntity<List<Car>> get(@PathVariable String modelName) {
        try {
            List<Car> cars = carService.findByCarModelName(modelName);
            System.out.println(cars);
            if(cars.isEmpty()){
                return new ResponseEntity<List<Car>>(HttpStatus.NOT_FOUND);
            }
            else{
                return new ResponseEntity<List<Car>>(cars, HttpStatus.OK);
            }
        } catch (NoSuchElementException e) {
            return new ResponseEntity<List<Car>>(HttpStatus.NOT_FOUND);
        }
    }
}