package one.digitalinnovation.gof.model.Gear;

public class GearStateFour implements IGearState {
    @Override
    public IGearState next() {
        System.out.println("This car cannot go faster");
        return new GearStateFour();
    }

    @Override
    public IGearState previous() {
        return new GearStateThree();
    }
}
