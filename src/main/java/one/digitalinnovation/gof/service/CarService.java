package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Car;
import one.digitalinnovation.gof.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarRepository repository;

    public Car create(Car car) {
        return repository.save(car);
    }
}
