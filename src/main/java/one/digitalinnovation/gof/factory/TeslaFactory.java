package one.digitalinnovation.gof.factory;

import one.digitalinnovation.gof.model.Car;
import one.digitalinnovation.gof.helper.ENUM_TYPE_FUEL;
import one.digitalinnovation.gof.model.Gear.Gear;

/**
 * Aqui vemos a aplicação do método Builder na construção do carro de diferente modelo
 * @author RammaR
 */

public class TeslaFactory implements CarFactory {
    @Override
    public Car create() {
        return Car.builder()
                .year(2021)
                .speed(0)
                .make("TESLA")
                .gear(new Gear())
                .type_fuel(ENUM_TYPE_FUEL.ELETRIC)
                .color("blue_chip")
                .model("future")
                .build();
    }
}
