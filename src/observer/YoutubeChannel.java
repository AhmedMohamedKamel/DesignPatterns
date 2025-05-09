package observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    private final List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
        System.out.println("New subscriber added.");
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
        System.out.println("Subscriber removed.");
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (Observer subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }

    public void uploadVideo(String title) {
        System.out.println("YouTubeChannel: New video uploaded - " + title);
        notifySubscribers(title);
    }
}
