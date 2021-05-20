package ru.lab.lab4.functions;

import java.util.ArrayList;

public abstract class Function {
    protected ArrayList<Double> coefficients;

    public Function(ArrayList<Double> coefficients) {
        this.coefficients = coefficients;
    }

    public abstract String getName();
    public abstract double calcValue(double x);
}
