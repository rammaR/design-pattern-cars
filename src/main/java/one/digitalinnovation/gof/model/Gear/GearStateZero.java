package one.digitalinnovation.gof.model.Gear;

public class GearStateZero implements IGearState {
    @Override
    public IGearState next() {
        return new GearStateOne();
    }

    @Override
    public IGearState previous() {
        System.out.println("This car is already stopped.");
        return new GearStateZero();
    }
}
