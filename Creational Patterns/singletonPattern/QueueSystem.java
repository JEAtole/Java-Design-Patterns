public class QueueSystem {

    private static QueueSystem instance;
    private int queueNumber;

    private QueueSystem() {
        queueNumber = 1;
    }

    public static QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public void showQueueNumber() {
        System.out.println("Queue Number: " + queueNumber);
    }

    public void resetQueueNumber(int newQueueNumber) {
        queueNumber = newQueueNumber;
    }

    public void nextQueueNumber() {
        queueNumber++;
    }

}
