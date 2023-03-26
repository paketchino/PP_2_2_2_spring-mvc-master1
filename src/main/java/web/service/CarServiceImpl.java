package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> storageCar = new ArrayList<>();

    public CarServiceImpl() {
        storageCar.add(new Car("reno", "machina", "dadad"));
        storageCar.add(new Car("wolv", "wolv engine", "dada"));
        storageCar.add(new Car("porsche", "weak", "vcxv"));
        storageCar.add(new Car("lamba", "bamba", "gfgd"));
        storageCar.add(new Car("lada", "danger", "fdsfs"));
        storageCar.add(new Car("granda", "danger master", "shina"));
    }

    @Override
    public void add(Car car) {
        storageCar.add(car);
    }

    @Override
    public List<Car> getAllCar() {
        return storageCar;
    }

    @Override
    public List<Car> capacityCar(int count) {
        if (count >= 5) {
            return storageCar;
        }
        return IntStream.range(0, storageCar.size())
                .takeWhile(i -> i != count)
                .mapToObj(i -> storageCar.get(i))
                .collect(Collectors.toList());
    }
}
