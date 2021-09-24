package one.digitalinnovation.gof.model.Gear;

public class GearStateOne implements IGearState{

    @Override
    public IGearState next() {
        return new GearStateTwo();
    }

    @Override
    public IGearState previous() {
        return new GearStateZero();
    }
}
