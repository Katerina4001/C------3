package group4386.gerasimava;

public abstract class Person1 implements Person1Behavoir {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Person1(String name) {
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }

    abstract String getName();
}