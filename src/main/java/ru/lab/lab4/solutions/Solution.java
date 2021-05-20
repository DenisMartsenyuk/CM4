package ru.lab.lab4.solutions;

import ru.lab.lab4.Answer;
import ru.lab.lab4.FunctionType;
import ru.lab.lab4.Point;

import java.util.ArrayList;

public interface Solution {
    Answer solve(ArrayList<Point> points);
    FunctionType getType();
}
