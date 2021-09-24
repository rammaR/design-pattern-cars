package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.model.Strategies.IPark;
import one.digitalinnovation.gof.model.Strategies.StratParkToLeft;
import one.digitalinnovation.gof.model.Strategies.StratParkToRight;

/**
 * O carro autônomo usa o padrão Strategy virar a esquerda ou direita
 * @author RammaR
 */
public class AutonomousCar extends Car {

    public IPark parkControl;

    public void turnToLeft(StratParkToLeft stratParkToLeft){
        this.parkControl = stratParkToLeft;
        turn();
    }

    public void turnToRight(StratParkToRight stratParkToRight){
        this.parkControl = stratParkToRight;
        turn();
    }

    private void turn() {
        this.parkControl.doPark(this.getSignalControl(), this.getDirectionControl());
    }

}
