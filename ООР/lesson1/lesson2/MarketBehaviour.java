package group4386.gerasimava;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Person1 Person1);

    void releaseFromMarket(List<Person1> Person1s);

    void update();
}