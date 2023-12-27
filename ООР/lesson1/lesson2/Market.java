package group4386.gerasimava;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private final List<Person1> queue;

    public Market() {
        queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Person1 Person1) {
        System.out.println(Person1.getName() + " пришел в магазина");
        takeInQueue(Person1);
    }

    @Override
    public void releaseFromMarket(List<Person1> Person1s) {
        for (Person1 Person1 : Person1s) {
            queue.remove(Person1);
            System.out.println(Person1.getName() + " вышел из магазина");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Person1 Person1) {
        System.out.println(Person1.getName() + " встал в очередь");
        queue.add(Person1);
    }

    @Override
    public void takeOrders() {
        for (Person1 Person1 : queue) {
            if (!Person1.isMakeOrder()) {
                Person1.setMakeOrder();
                System.out.println(Person1.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Person1 Person1 : queue) {
            if (Person1.isMakeOrder()) {
                Person1.setTakeOrder();
                System.out.println(Person1.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Person1> releasePerson1s = new ArrayList<>();
        for (Person1 Person1 : queue) {
            if (Person1.isTakeOrder) {
                releasePerson1s.add(Person1);
                System.out.println(Person1.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releasePerson1s);
    }

}