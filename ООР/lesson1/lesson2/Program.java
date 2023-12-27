/*
 * Реализовать класс Market и все методы, которые он обязан реализовывать.
 * Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
 * MarketBehaviour – помещает и удаляет человека из очереди, 
 * метод update – обновляет состояние магазина (принимает и отдаёт заказы)
 */
package group4386.gerasimava;

public class Program21 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Market myMarket = new Market();
        System.out.println();
        myMarket.acceptToMarket(new Human("ергей"));

        myMarket.update();

        myMarket.acceptToMarket(new Human("Маша"));
        myMarket.acceptToMarket(new Human("Вася"));

        myMarket.update();

    }
}