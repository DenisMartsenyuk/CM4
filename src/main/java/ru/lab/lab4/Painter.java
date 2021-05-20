package ru.lab.lab4;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.Styler;

public class Painter {
    private XYChart chart;

    public Painter() {
        chart = new XYChartBuilder().width(600).height(400).title("Area Chart").xAxisTitle("X").yAxisTitle("Y").build();
        chart.getStyler().setChartTitleVisible(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideSW);
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
        chart.getStyler().setMarkerSize(5);
    }

    public void addPrimitive(Points points, String name) {
        chart.addSeries(name, points.getPointsX(), points.getPointsY());
    }

    public void openGraph() { //todo мб переименовать
        new SwingWrapper(chart).displayChart();
    }
}
