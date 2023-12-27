package group4386.gerasimava;

public interface QueueBehaviour {
    void takeInQueue(APerson1 aPerson1);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}