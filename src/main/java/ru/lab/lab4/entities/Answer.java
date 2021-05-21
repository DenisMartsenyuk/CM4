package ru.lab.lab4.entities;

import ru.lab.lab4.functions.Function;

public class Answer {
    private Function function;
    private double S;
    private Double r;
    private double sigma;

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

    public void setR(Double r) {
        this.r = r;
    }

    public Double getR() {
        return r;
    }

    public void setSigma(double sigma) {
        this.sigma = sigma;
    }

    public double getSigma() {
        return sigma;
    }
}
