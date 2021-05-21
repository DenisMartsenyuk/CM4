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

    public int getSize() {
        return pointsX.size();
    }

    public ArrayList<Double> getPointsX() {
        return pointsX;
    }

    public ArrayList<Double> getPointsY() {
        return pointsY;
    }

    public double getMinX() {
        return pointsX.get(0);
    }

    public double getMaxX() {
        return pointsX.get(pointsX.size() - 1);
    }
}
