package com.main.demo4;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    private LineChart<?,?> chart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series series = new XYChart.Series();

        series.getData().add(new XYChart.Data("1",5));
        series.getData().add(new XYChart.Data("2",4));
        series.getData().add(new XYChart.Data("3",5));

    }
    public static void main(String[] args) {
        launch();
    }
}