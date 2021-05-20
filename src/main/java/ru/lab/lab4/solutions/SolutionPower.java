package ru.lab.lab4.solutions;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.functions.FunctionPower;

import java.util.ArrayList;

public class SolutionPower implements Solution {
    @Override
    public Answer solve(Points points) {
        Answer answer = new Answer();

        answer.setFunction(new FunctionPower(new ArrayList<>())); //todo коэфы
        return answer;    }
}
