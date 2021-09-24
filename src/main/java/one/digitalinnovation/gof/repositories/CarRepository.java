package one.digitalinnovation.gof.repositories;

import one.digitalinnovation.gof.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
