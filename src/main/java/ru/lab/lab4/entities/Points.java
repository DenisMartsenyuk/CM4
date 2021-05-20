package ru.lab.lab4.entities;

import java.util.ArrayList;

public class Points {
    private ArrayList<Double> pointsX;
    private ArrayList<Double> pointsY;

    public Points() {
        pointsX = new ArrayList<>();
        pointsY = new ArrayList<>();
    }

    public void addPoint(double x, double y) {
        pointsX.add(x);
        pointsY.add(y);
    }

    public ArrayList<Double> getPointsX() {
        return pointsX;
    }

    public ArrayList<Double> getPointsY() {
        return pointsY;
    }
}