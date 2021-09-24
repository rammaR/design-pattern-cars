package one.digitalinnovation.gof.model.CarPieces;

import one.digitalinnovation.gof.helper.Publisher;
import one.digitalinnovation.gof.helper.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class AlertBeltSystem implements Publisher {

    List<Subscriber> list = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.list.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.list.remove(subscriber);
    }

    @Override
    public void notifyList() {
        for (Subscriber subs: list) {
            subs.update("One of the belts are not setted");
        }
    }
}
