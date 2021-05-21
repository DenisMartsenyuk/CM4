package ru.lab.lab4.solutions;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.functions.Function;
import ru.lab.lab4.functions.FunctionLinear;

import java.util.ArrayList;

public class SolutionLinear implements Solution {
    @Override
    public Answer solve(Points points) {
        ArrayList<Double> pointsX = points.getPointsX();
        ArrayList<Double> pointsY = points.getPointsY();

        double SX = 0, SXX = 0, SY = 0, SXY = 0;
        for (int i = 0; i < points.getSize(); ++i) {
            double x = pointsX.get(i);
            double y = pointsY.get(i);
            SX += x;
            SXX += x * x;
            SY += y;
            SXY += x * y;
        }
        double delta = SXX * points.getSize() - SX * SX;
        double a = (SXY * points.getSize() - SX * SY) / delta;
        double b = (SXX * SY - SX * SXY) / delta;

        ArrayList<Double> coefficients = new ArrayList<>();
        coefficients.add(a);
        coefficients.add(b);
        Function approximated = new FunctionLinear(coefficients);
        double S = 0;
        double middleSumX = 0;
        double middleSumY = 0;
        for (int i = 0; i < points.getSize(); ++i) {
            double x = pointsX.get(i);
            double y = pointsY.get(i);
            double approxY = approximated.calcValue(x);
            S += (approxY - y) * (approxY - y);
            middleSumX += x;
            middleSumY += approxY;
        }
        middleSumX /= points.getSize();
        middleSumY /= points.getSize();

        double numerator = 0;
        double denominatorX = 0;
        double denominatorY = 0;
        for (int i = 0; i < points.getSize(); ++i) {
            double x = pointsX.get(i);
            double approxY = approximated.calcValue(x);
            numerator += (x - middleSumX) * (approxY - middleSumY);
            denominatorX += (x - middleSumX) * (x - middleSumX);
            denominatorY += (approxY - middleSumY) * (approxY - middleSumY);
        }
        double r = numerator / (Math.sqrt(denominatorX * denominatorY));

        Answer answer = new Answer();
        answer.setFunction(approximated);
        answer.setS(S);
        answer.setR(r);
        return answer;
    }
}
