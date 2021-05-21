package ru.lab.lab4.functions;

import java.util.ArrayList;

public class FunctionExponential extends Function {
    public FunctionExponential(ArrayList<Double> coefficients) {
        super(coefficients);
    }

    @Override
    public String getName() {
        return "Exponential";
    }

    @Override
    public double calcValue(double x) { //ae^(bx)
        return coefficients.get(0) * Math.pow(Math.E, coefficients.get(1) * x);
    }
}
