package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.factory.CarFactory;
import one.digitalinnovation.gof.factory.FordFactory;
import one.digitalinnovation.gof.factory.TeslaFactory;
import one.digitalinnovation.gof.model.Car;
import one.digitalinnovation.gof.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * Aqui vemos a aplicação do padrão de projeto Factory e Template Method.
 * Dependendo do sufixo da url passada, uma fábrica diferente será instanciada. Mas o método
 * de construção de um carro é compartilhado pela interface CarFactory.
 * Depois da fábrica criada, um carro deve ser produzido, salvo no banco e retornado para o usuário.
 * Como as duas fábricas possuem isso em comum, essa parte do algorítimo é abstraída pela Template Method.
 *
 * @Author RammaR
 */

@RestController
@RequestMapping("car/v1/")
public class CarController {

    @Autowired
    private CarService service;
    private CarFactory factory;

    @GetMapping(value = "ford/")
    public ResponseEntity<Car> createFordCard(){
        this.factory = new FordFactory();
        return carCreate();
    }

    @GetMapping(value = "tesla/")
    public ResponseEntity<Car> createTeslaCar(){
        this.factory = new TeslaFactory();
        return carCreate();
    }

    private ResponseEntity<Car> carCreate() {
        Car car = factory.create();
        return ResponseEntity.ok(this.service.create(car));
    }

}
