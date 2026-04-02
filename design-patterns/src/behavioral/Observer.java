package behavioral;

/*
    When to use Observer pattern?
    When you want to notify all the dependent objects when one object changes.
 */

import java.util.ArrayList;
import java.util.List;

interface ObserverClass {
    void update(String message);
}

interface Subject {
    void addObserver(ObserverClass o);
    void removeObserver(ObserverClass o);
    void notifyObserver();
}

class YoutubeChannel implements Subject {
    private List<ObserverClass> observers = new ArrayList<>();
    private String videoTitle;

    @Override
    public void addObserver(ObserverClass o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverClass o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (ObserverClass o : observers) {
            o.update(videoTitle);
        }
    }

    public void uploadVideo(String title) {
        this.videoTitle = title;
        notifyObserver();
    }
}

class Subscriber implements ObserverClass {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " received notification: New video " + videoTitle);
    }
}

public class Observer {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber sub1 = new Subscriber("Rahul");
        Subscriber sub2 = new Subscriber("Manoj");

        channel.addObserver(sub1);
        channel.addObserver(sub2);

        channel.uploadVideo("Learn React in 10 minutes");
    }
}
