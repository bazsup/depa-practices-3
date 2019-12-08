package model;

abstract class Subscriber {

    void interestIn(Publisher publisher) {
        publisher.addSubscriber(this);
    }

    void disinterest(Publisher publisher) {
        publisher.removeSubscriber(this);
    }

    abstract void update(Publisher publisher);
}
