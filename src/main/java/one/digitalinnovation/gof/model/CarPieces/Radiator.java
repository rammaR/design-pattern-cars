package one.digitalinnovation.gof.model.CarPieces;

import one.digitalinnovation.gof.helper.Temperature;

public class Radiator {

    public void resfriar(Temperature temperature) {
        if (temperature.getGraus() > 50) {
            System.out.println("Radiador: resfriando");
        }else{
            System.out.println("Radiador: em espera");
        }
    }
}
