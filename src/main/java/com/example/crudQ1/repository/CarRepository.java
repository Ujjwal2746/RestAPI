package com.example.crudQ1.repository;

import com.example.crudQ1.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    public List<Car> findByCarModel(String carModel);
    
}
