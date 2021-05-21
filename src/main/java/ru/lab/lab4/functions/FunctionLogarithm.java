package ru.lab.lab4.functions;

import java.util.ArrayList;

public class FunctionLogarithm extends Function {
    public FunctionLogarithm(ArrayList<Double> coefficients) {
        super(coefficients);
    }

    @Override
    public String getName() {
        return "Logarithm";
    }

    @Override
    public double calcValue(double x) {//alnx + b
        return coefficients.get(0) * Math.log(x) + coefficients.get(1);
    }
}
