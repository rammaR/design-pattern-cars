package one.digitalinnovation.gof.model.CarPieces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.gof.helper.ENUM_TYPE_FUEL;
import one.digitalinnovation.gof.helper.Publisher;
import one.digitalinnovation.gof.helper.Subscriber;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class FuelSystem implements Publisher {

    private ENUM_TYPE_FUEL type_fuel;
    private Double stock = 0d;
    private static final Double MAX_STOCK = 1000d;
    private List<Subscriber> subscriberList;

    public FuelSystem() {
        this.subscriberList = new ArrayList<>();
    }

    public void lowFuel() {
        if (this.stock <= 0) {
            System.out.println("FuelSystem: attention! low fuel warning");
            this.notifyList();
        }
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscriberList.remove(subscriber);
    }

    @Override
    public void notifyList() {
        for (Subscriber subscriber : this.subscriberList) {
            subscriber.update("FuelSystem: low fuel warning");
        }
    }

    public void supply(Double quant) {
        this.stock += quant;
        System.out.println("Fuel System: added "+quant+" to stock, now is: "+this.stock);
    }
}
