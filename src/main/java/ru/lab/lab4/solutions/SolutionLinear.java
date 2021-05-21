package ru.lab.lab4.solutions;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.functions.FunctionLinear;

import java.util.ArrayList;

public class SolutionLinear implements Solution {
    @Override
    public Answer solve(Points points) {

        double SX = 0, SXX = 0, SY = 0, SXY = 0;
        ArrayList<Double> x = points.getPointsX();
        ArrayList<Double> y = points.getPointsY();

        for (int i = 0; i < points.getSize(); i++) {
            SX += x.get(i);
            SXX += x.get(i) * x.get(i);
            SY += y.get(i);
            SXY += x.get(i) * y.get(i);
        }
        double delta = SXX * points.getSize() - SX * SX;
        double a = (SXY * points.getSize() - SX * SY) / delta;
        double b = (SXX * SY - SX * SXY) / delta;


        Answer answer = new Answer();
        ArrayList<Double> coefficients = new ArrayList<>();
        coefficients.add(a);
        coefficients.add(b);

        answer.setFunction(new FunctionLinear(coefficients));
        return answer;
    }
}
