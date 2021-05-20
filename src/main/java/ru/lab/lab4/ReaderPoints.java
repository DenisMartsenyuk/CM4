package ru.lab.lab4;

import java.util.ArrayList;

public class ReaderPoints {
    private Points points;

    public void readPoints() {
        points = new Points();
        points.addPoint(1, 1);
        points.addPoint(2, 2);
        points.addPoint(3, 3);
        points.addPoint(4, 4);
        points.addPoint(5, 5);
        //(Arrays.asList(new Point(1, 1), new Point(2, 2), new Point(3, 3), new Point(4,4 ));
        //todo написать
    }

    public Points getPoints() {
        return points;
    }
}
