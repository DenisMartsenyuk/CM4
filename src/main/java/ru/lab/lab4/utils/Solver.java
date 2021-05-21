package ru.lab.lab4.utils;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.functions.Function;
import ru.lab.lab4.solutions.*;

import java.util.ArrayList;

public class Solver {

    private final Painter painter;
    private final ArrayList<Solution> solutions;

    private final double OFFSET = 1.0;
    private double minX;
    private double maxX;

    public Solver() {
        painter = new Painter();
        solutions = new ArrayList<>();
        solutions.add(new SolutionLinear());
        solutions.add(new SolutionSquare());
        solutions.add(new SolutionExponential());
        solutions.add(new SolutionLogarithm());
        solutions.add(new SolutionPower());
    }

    public void solve(Points points) {
        painter.addPrimitive(points, "Points");
        minX = points.getMinX();
        maxX = points.getMaxX();

        double minSigma = Double.MAX_VALUE;
        String optimumFunctionName = "";
        for (Solution solution : solutions) {
            Answer answer = solution.solve(points);
            parseAnswer(answer);

            if (minSigma >= answer.getSigma()) {
                minSigma = answer.getSigma();
                optimumFunctionName = answer.getFunction().getName();
            }
        }

        System.out.println("Наилучшая аппроксимирующая функция:");
        System.out.println(optimumFunctionName);

        painter.openGraph();
    }

    private void parseAnswer(Answer answer) {
        System.out.println(answer.getFunction().getName() + ":");
        System.out.println("Коэфициент пирсона: " + answer.getR()); //todo что-то с ним не так и может не выводить его у всех?
        System.out.println("Мера отклонения: " + answer.getS());
        System.out.println("Среднеквадратичное отклонение : " + answer.getSigma() + "\n");
        painter.addPrimitive(getPointsForCurve(answer.getFunction()), answer.getFunction().getName());

    }

    public Points getPointsForCurve(Function function) {
        Points points = new Points();
        for (double i = minX - OFFSET; i <= maxX + OFFSET; i += 0.5) {
            Double y = function.calcValue(i);
            if (y.isNaN() || y.isInfinite()) {
                continue;
            }
            points.addPoint(i, y);
        }
        return points;
    }
}
