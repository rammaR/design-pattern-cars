package one.digitalinnovation.gof.model.Gear;

public class GearStateTwo implements IGearState {
    @Override
    public IGearState next() {
        return new GearStateThree();
    }

    @Override
    public IGearState previous() {
        return new GearStateOne();
    }
}
