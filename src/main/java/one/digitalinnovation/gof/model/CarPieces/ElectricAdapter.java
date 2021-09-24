package one.digitalinnovation.gof.model.CarPieces;

import one.digitalinnovation.gof.model.Car;

public class ElectricAdapter implements IElectricSupplier {

    private final FuelSystem fuelSystem;

    public ElectricAdapter(FuelSystem fuelSystem) {
        this.fuelSystem = fuelSystem;
    }

    @Override
    public void addFuel(Double quant) {
        quant = conversionElectric(quant);
        this.fuelSystem.supply(quant);
    }

    private Double conversionElectric(Double quant) {
        //add some electric logic
        return quant;
    }
}
