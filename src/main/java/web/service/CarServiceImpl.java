package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoRepository;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarDaoRepository carDaoRepository;

    public CarServiceImpl(@Autowired CarDaoRepository carDaoRepository) {
        this.carDaoRepository = carDaoRepository;
    }

    @Override
    public void add(Car car) {
        carDaoRepository.getAllCar().add(car);
    }

    @Override
    public List<Car> getAllCar() {
        return carDaoRepository.getAllCar();
    }

    @Override
    public List<Car> capacityCar(Integer count) {
        if (count <= 0) {
            count = getAllCar().size();
        }
        if (count >= 5) {
            return carDaoRepository.getAllCar();
        }
        return carDaoRepository.getAllCar().stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
