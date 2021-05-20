package ru.lab.lab4;

import ru.lab.lab4.solutions.*;

import java.util.ArrayList;

public class Solver {

    private Painter painter;
    private ArrayList<Solution> solutions;

    public Solver() {
        painter = new Painter();
        solutions = new ArrayList<>();
        solutions.add(new SolutionLinear());
        solutions.add(new SolutionSquare());
        solutions.add(new SolutionExponential());
        solutions.add(new SolutionLogarithm());
        solutions.add(new SolutionPower());
    }

    public void solve(ArrayList<Point> points) {
        for (Solution solution : solutions) {
            parseAnswer(solution.solve(points));
        }
    }

    private void parseAnswer(Answer answer) {
        //todo отрисовать 
    }
}
