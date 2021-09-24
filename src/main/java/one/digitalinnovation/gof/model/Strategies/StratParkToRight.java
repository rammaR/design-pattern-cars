package one.digitalinnovation.gof.model.Strategies;

import one.digitalinnovation.gof.model.CarPieces.DirectionControl;
import one.digitalinnovation.gof.model.CarPieces.SignalControl;

public class StratParkToRight implements IPark{
    @Override
    public void doPark(SignalControl signalControl, DirectionControl directionControl) {
        signalControl.toRight();
        directionControl.toRight();
    }
}
