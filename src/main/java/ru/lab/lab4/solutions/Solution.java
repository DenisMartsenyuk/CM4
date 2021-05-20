package ru.lab.lab4.solutions;

import ru.lab.lab4.Answer;
import ru.lab.lab4.FunctionType;
import ru.lab.lab4.Points;

public interface Solution {
    Answer solve(Points points);
    FunctionType getType();
}
