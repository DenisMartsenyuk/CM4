package ru.lab.lab4.solutions;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.functions.Function;

import java.util.ArrayList;

public abstract class Solution {
    public abstract Answer solve(Points points);
    public Answer getAnswer(Points points, Function approximated) {
        ArrayList<Double> pointsX = points.getPointsX();
        ArrayList<Double> pointsY = points.getPointsY();
        double n = points.getSize();

        double S = 0;
        double middleSumX = 0;
        double middleSumY = 0;
        for (int i = 0; i < n; ++i) {
            double x = pointsX.get(i);
            double y = pointsY.get(i);
            double approxY = approximated.calcValue(x);
            S += (approxY - y) * (approxY - y);
            middleSumX += x;
            middleSumY += approxY;
        }
        middleSumX /= n;
        middleSumY /= n;

        double numerator = 0;
        double denominatorX = 0;
        double denominatorY = 0;
        for (int i = 0; i < n; ++i) {
            double x = pointsX.get(i);
            double approxY = approximated.calcValue(x);
            numerator += (x - middleSumX) * (approxY - middleSumY);
            denominatorX += (x - middleSumX) * (x - middleSumX);
            denominatorY += (approxY - middleSumY) * (approxY - middleSumY);
        }
        double r = numerator / (Math.sqrt(denominatorX * denominatorY));

        Answer answer = new Answer();
        answer.setFunction(approximated);
        answer.setR(r);
        answer.setSigma(Math.sqrt(S / n));
        answer.setS(S);
        return answer;
    }
}
