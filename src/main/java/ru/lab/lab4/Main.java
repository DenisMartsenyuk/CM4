package ru.lab.lab4;

public class Main {
    public static void main(String[] args) {
        ReaderPoints readerPoints = new ReaderPoints();
        readerPoints.readPoints();
        Solver solver = new Solver();
        solver.solve(readerPoints.getPoints());
    }
}
