package ru.lab.lab4.solutions;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.functions.FunctionExponential;

import java.util.ArrayList;

public class SolutionExponential implements Solution {
    @Override
    public Answer solve(Points points) {
        Answer answer = new Answer();

        answer.setFunction(new FunctionExponential(new ArrayList<>())); //todo сюды коэфициенты
        return answer;
    }
}
