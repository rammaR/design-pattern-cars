package one.digitalinnovation.gof.model.Gear;

public class GearStateThree implements IGearState {
    @Override
    public IGearState next() {
        return new GearStateFour();
    }

    @Override
    public IGearState previous() {
        return new GearStateTwo();
    }
}
