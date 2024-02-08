package group4386.gerasimava.lesson7.calculator;

import group4386.gerasimava.lesson7.complex.Complex;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(Complex firstArg) {
        return new Calculator(firstArg);
    }
}