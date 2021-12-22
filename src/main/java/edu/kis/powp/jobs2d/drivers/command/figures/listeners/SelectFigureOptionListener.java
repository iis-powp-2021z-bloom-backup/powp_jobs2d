package edu.kis.powp.jobs2d.drivers.command.figures.listeners;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.figures.FiguresFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFigureOptionListener implements ActionListener {
    private DriverManager driverManager;
    private FiguresFactory figuresFactory = FiguresFactory.getInstance();
    private String figure;

    public SelectFigureOptionListener(DriverManager driverManager, String figure) {
        this.driverManager = driverManager;
        this.figure = figure;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        figuresFactory.getFigure(driverManager, figure).execute();
    }
}