package ru.lab.lab4.solutions;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.functions.Function;
import ru.lab.lab4.functions.FunctionSquare;

import java.util.ArrayList;

public class SolutionSquare implements Solution {
    @Override
    public Answer solve(Points points) {
        ArrayList<Double> pointsX = points.getPointsX();
        ArrayList<Double> pointsY = points.getPointsY();

        double SX = 0, SX2 = 0, SY = 0, SXY = 0, SX3 = 0, SX4 = 0, SX2Y = 0;
        for (int i = 0; i < points.getSize(); ++i) {
            double x = pointsX.get(i);
            double y = pointsY.get(i);
            SX += x;
            SX2 += x * x;
            SX3 += x * x * x;
            SX4 += x * x * x * x;
            SY += y;
            SXY += x * y;
            SX2Y += x * x * y;
        }
        double n = points.getSize();
        double delta = n * SX2 * SX4 + 2 * SX * SX3 * SX2 - SX2 * SX2 * SX2 - n * SX3 * SX3 - SX * SX * SX4;
        double a = (SY * SX2 * SX4 + SX * SX3 * SX2Y + SXY * SX2 * SX3 - SX2 * SX2 * SX2Y - SX3 * SX3 * SY - SX * SXY * SX4) / delta;
        double b = (n * SX4 * SXY + SY * SX3 * SX2 + SX * SX2Y * SX2 - SXY * SX2 * SX2 - n * SX3 * SX2Y - SX * SY * SX4) / delta;
        double c = (n * SX2 * SX2Y + SX * SX2 * SXY + SX * SX3 * SY - SY * SX2 * SX2 - n * SX3 * SXY - SX * SX * SX2Y) / delta;

        ArrayList<Double> coefficients = new ArrayList<>();
        coefficients.add(c);
        coefficients.add(b);
        coefficients.add(a);
        Function approximated = new FunctionSquare(coefficients);
        double S = 0;
        for (int i = 0; i < points.getSize(); ++i) {
            double x = pointsX.get(i);
            double y = pointsY.get(i);
            double approxY = approximated.calcValue(x);
            S += (approxY - y) * (approxY - y);
        }

        Answer answer = new Answer();
        answer.setFunction(approximated);
        answer.setS(S);
        answer.setR(null);
        return answer;
    }
}
