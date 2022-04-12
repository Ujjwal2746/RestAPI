package com.example.crudQ1.service;

import com.example.crudQ1.model.Car;
import com.example.crudQ1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
@Transactional
public class CarService {
    @Autowired
    private CarRepository carRepository;
    public List<Car> listAllCar() {
        return carRepository.findAll();
    }

    public void saveCar(Car car) {
        carRepository.save(car);
    }

    public Car getCar(Integer carId) {
        return carRepository.findById(carId).get();
    }

    public void deleteCar(Integer carId) {
        carRepository.deleteById(carId);
    }

    public List<Car> findByCarModelName(String modelName){
        return carRepository.findByCarModel(modelName);
    }
}