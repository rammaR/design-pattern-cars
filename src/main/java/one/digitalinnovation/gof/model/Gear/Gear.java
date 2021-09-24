package one.digitalinnovation.gof.model.Gear;

public class Gear {

    private IGearState state;

    public Gear() {
        this.state = new GearStateZero();
    }

    public void toNext() {
        System.out.println("\n" + "pedal activated");
        this.state = this.state.next();
        System.out.println("\n" + "pedal slowly deactivated");
    }

    public void toPrevious() {
        System.out.println("\n" + "pedal activated");
        this.state = this.state.previous();
        System.out.println("\n" + "pedal slowly deactivated");
    }

}
