package ru.lab.lab4.functions;

import java.util.ArrayList;

public class FunctionSquare extends Function {
    public FunctionSquare(ArrayList<Double> coefficients) {
        super(coefficients);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double calcValue(double x) { //ax^2 + bx + c
        return coefficients.get(0) * x * x + coefficients.get(1) * x + coefficients.get(2);
    }
}
