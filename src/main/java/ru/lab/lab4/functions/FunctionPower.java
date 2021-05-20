package ru.lab.lab4.functions;

import java.util.ArrayList;

public class FunctionPower extends Function {
    public FunctionPower(ArrayList<Double> coefficients) {
        super(coefficients);
    }

    @Override
    public String getName() {
        return "Power";
    }

    @Override
    public double calcValue(double x) { //ax^b
        return coefficients.get(0) * Math.pow(x, coefficients.get(1));
    }
}
