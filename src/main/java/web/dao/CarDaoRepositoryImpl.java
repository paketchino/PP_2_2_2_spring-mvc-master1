package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoRepositoryImpl implements CarDaoRepository {

    private List<Car> storageCar = new ArrayList<>();

    public CarDaoRepositoryImpl() {
        storageCar.add(new Car("reno", "machina", "dadad"));
        storageCar.add(new Car("wolv", "wolv engine", "dada"));
        storageCar.add(new Car("porsche", "weak", "vcxv"));
        storageCar.add(new Car("lamba", "bamba", "gfgd"));
        storageCar.add(new Car("lada", "danger", "fdsfs"));
        storageCar.add(new Car("granda", "danger master", "shina"));
    }

    @Override
    public List<Car> getAllCar() {
        return storageCar;
    }
}
