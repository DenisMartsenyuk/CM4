package ru.lab.lab4.solutions;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.functions.FunctionPower;

import java.util.ArrayList;

public class SolutionPower extends Solution {
    @Override
    public Answer solve(Points points) {
        ArrayList<Double> pointsX = points.getPointsX();
        ArrayList<Double> pointsY = points.getPointsY();
        double n = points.getSize();

        double SX = 0, SXX = 0, SY = 0, SXY = 0;
        for (int i = 0; i < n; ++i) {
            double x = pointsX.get(i);
            double y = pointsY.get(i);
            SX += Math.log(x);
            SXX += Math.log(x) * Math.log(x);
            SY += Math.log(y);
            SXY += Math.log(x) * Math.log(y);
        }
        double delta = SXX * n - SX * SX;
        double b = (SXY * n - SX * SY) / delta;
        double a = (SXX * SY - SX * SXY) / delta;
        a = Math.exp(a);

        ArrayList<Double> coefficients = new ArrayList<>();
        coefficients.add(a);
        coefficients.add(b);
        return getAnswer(points, new FunctionPower(coefficients));
    }
}
