package one.digitalinnovation.gof.factory;

import one.digitalinnovation.gof.model.Car;
import one.digitalinnovation.gof.helper.ENUM_TYPE_FUEL;
import one.digitalinnovation.gof.model.Gear.Gear;

/**
 * Aqui vemos a aplicação do método Builder na construção do carro de diferente modelo
 * @author RammaR
 */

public class FordFactory implements CarFactory {
    @Override
    public Car create() {
        return Car.builder()
                .color("purple")
                .gear(new Gear())
                .make("FORD")
                .type_fuel(ENUM_TYPE_FUEL.GASOLINE)
                .speed(0)
                .year(2020)
                .model("velocity")
                .build();
    }
}
