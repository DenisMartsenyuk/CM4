package ru.lab.lab4.solutions;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.functions.FunctionLinear;

import java.util.ArrayList;

public class SolutionLinear implements Solution {
    @Override
    public Answer solve(Points points) {
        Answer answer = new Answer();

        answer.setFunction(new FunctionLinear(new ArrayList<>())); //todo коэфы
        return answer;
    }
}
