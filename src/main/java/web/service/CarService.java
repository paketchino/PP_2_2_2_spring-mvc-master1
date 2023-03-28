package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    void add(Car car);

    List<Car> getAllCar();

    List<Car> capacityCar(Integer count);
}
