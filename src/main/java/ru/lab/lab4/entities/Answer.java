package ru.lab.lab4.entities;

import ru.lab.lab4.functions.Function;

public class Answer {
    private Function function;
    private double S;
    private double r;

    public void setFunction(Function function) {
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }

    public void setS(double S) {
        this.S = S;
    }

    public double getS() {
        return S;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
}
