package ru.lab.lab4;

import java.util.ArrayList;
import java.util.Arrays;

public class ReaderPoints {
    private ArrayList<Point> points;

    public void readPoints() {
        points = (ArrayList<Point>) Arrays.asList(new Point(1, 1), new Point(2, 2), new Point(3, 3), new Point(4,4 ));
        //todo написать
    }

    public ArrayList<Point> getPoints() {
        return points;
    }
}
