package ru.lab.lab4.utils;

import ru.lab.lab4.entities.Answer;
import ru.lab.lab4.entities.Points;
import ru.lab.lab4.solutions.*;
import ru.lab.lab4.utils.Painter;

import java.util.ArrayList;

public class Solver {

    private final Painter painter;
    private final ArrayList<Solution> solutions;

    public Solver() {
        painter = new Painter();
        solutions = new ArrayList<>();
        solutions.add(new SolutionLinear());
        solutions.add(new SolutionSquare());
        solutions.add(new SolutionExponential());
        solutions.add(new SolutionLogarithm());
        solutions.add(new SolutionPower());
    }

    public void solve(Points points) {
        painter.addPrimitive(points, "lol"); //имена давать
        for (Solution solution : solutions) {
            parseAnswer(solution.solve(points));
        }

        painter.openGraph();
    }

    private void parseAnswer(Answer answer) {
        //todo отрисовать
    }
}
