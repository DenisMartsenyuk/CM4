package ru.lab.lab4;

import ru.lab.lab4.utils.ReaderPoints;
import ru.lab.lab4.utils.Solver;

public class Main {
    public static void main(String[] args) {
        ReaderPoints readerPoints = new ReaderPoints();
        readerPoints.read();
        Solver solver = new Solver();
        solver.solve(readerPoints.getPoints());
    }
}
