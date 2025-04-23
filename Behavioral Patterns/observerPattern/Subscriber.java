public class Subscriber implements Observer{

    private final String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateNews(String newsTitle) {

        String output = "Good day " + subscriberName + "!\n";
               output += "News Update: " + newsTitle + "\n";
               output += "For more info, visit ...\n";

        System.out.println(output);

    }

}
