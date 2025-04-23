import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    private String newsTitle;
    private final List<Subscriber> subscriberList = new ArrayList<>();

    public void addNewsUpdate(String newsTitle){
        this.newsTitle = newsTitle;
        notifySubscribers();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber : subscriberList) {
            subscriber.updateNews(newsTitle);
        }
    }
}
