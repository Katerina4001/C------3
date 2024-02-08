package group4386.gerasimava.lesson7.calculator;

import group4386.gerasimava.lesson7.complex.Complex;

public interface Calculable {
    Calculable sum(Complex arg);
    Calculable multi(Complex arg);
    Calculable div(Complex arg);
    Calculable minus(Complex arg);
    Complex getResult();
}