package ru.lab.lab4.solutions;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.functions.FunctionLogarithm;

import java.util.ArrayList;

public class SolutionLogarithm implements Solution{
    @Override
    public Answer solve(Points points) {
        Answer answer = new Answer();

        answer.setFunction(new FunctionLogarithm(new ArrayList<>())); //todo коэфы
        return answer;
    }
}
