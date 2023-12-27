package group4386.gerasimava;

import group4386.gerasimava.Person1;

public class Person extends Person1 {

    public Person(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }    

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }
}