package one.digitalinnovation.gof.model.CarPieces;

public class MovableAdapter implements IMovableKph {

    private IMovable carMovable;

    public MovableAdapter(IMovable car) {
        this.carMovable = car;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(carMovable.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

}
