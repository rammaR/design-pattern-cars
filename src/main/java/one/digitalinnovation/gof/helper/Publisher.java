package one.digitalinnovation.gof.helper;

public interface Publisher {

    public void addSubscriber(Subscriber subscriber);

    public void unsubscribe(Subscriber subscriber);

    public void notifyList();

}
