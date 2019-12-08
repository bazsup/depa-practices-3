package model;

import java.util.ArrayList;
import java.util.List;

abstract class Publisher {
    List<Subscriber> subscribers;

    Publisher() {
        subscribers = new ArrayList<Subscriber>();
    }

    public void sendNotify() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
