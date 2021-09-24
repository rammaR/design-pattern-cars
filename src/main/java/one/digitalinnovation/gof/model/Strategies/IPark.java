package one.digitalinnovation.gof.model.Strategies;

import one.digitalinnovation.gof.model.CarPieces.DirectionControl;
import one.digitalinnovation.gof.model.CarPieces.SignalControl;

public interface IPark {

    public void doPark(SignalControl signalControl, DirectionControl directionControl);

}
