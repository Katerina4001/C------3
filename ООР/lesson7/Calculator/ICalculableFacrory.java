package group4386.gerasimava.lesson7.calculator;

import group4386.gerasimava.lesson7.complex.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}