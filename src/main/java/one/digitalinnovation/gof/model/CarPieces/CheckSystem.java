package one.digitalinnovation.gof.model.CarPieces;

import one.digitalinnovation.gof.helper.Subscriber;

public class CheckSystem implements Subscriber {

    public void ignit() {
        System.out.println("CheckSystem: turn on all the warning lights");
    }

    @Override
    public void update(String errorMessage) {
        System.out.println("CheckSystem: " + errorMessage);
    }
}
