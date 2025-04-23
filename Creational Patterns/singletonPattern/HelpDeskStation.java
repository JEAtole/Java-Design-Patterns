public class HelpDeskStation {

    public static void main(String[] args) {

        QueueSystem queueSystem = QueueSystem.getInstance();
        queueSystem.showQueueNumber();

        System.out.println("Serving customer... Done!\n");

        queueSystem.nextQueueNumber();
        queueSystem.showQueueNumber();

        System.out.println("Serving customer... Done!\n");

        System.out.println("""
                Oops! Due to Technical Issue / Circumstance, a reset is needed.
                Resetting number to 25...
                """);

        queueSystem.resetQueueNumber(25);
        queueSystem.showQueueNumber();

        System.out.println("Serving customer... Done!");

    }

}
