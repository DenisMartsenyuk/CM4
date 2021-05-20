package ru.lab.lab4.functions;

import java.util.ArrayList;

public class FunctionLinear extends Function {
    public FunctionLinear(ArrayList<Double> coefficients) {
        super(coefficients);
    }

    @Override
    public String getName() {
        return "Linear";
    }

    @Override
    public double calcValue(double x) { //ax + b
        return coefficients.get(0) * x + coefficients.get(1); //todo а если не дабл
    }
}
