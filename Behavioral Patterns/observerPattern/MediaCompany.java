public class MediaCompany {
    public static void main(String[] args) {

        Subscriber maria = new Subscriber("Maria");
        Subscriber juan = new Subscriber("Juan");
        Subscriber oliver = new Subscriber("Oliver");

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.subscribe(maria);
        newsAgency.subscribe(juan);
        newsAgency.subscribe(oliver);

        newsAgency.addNewsUpdate("McDonald | New Deals Now Available!");

        newsAgency.unsubscribe(juan);

        newsAgency.addNewsUpdate("KathNiel confirmed breakup!");

    }


}
