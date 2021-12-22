package edu.kis.powp.jobs2d.drivers.command.figures;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;

import java.util.HashMap;
import java.util.Map;

public class FiguresFactory {

    private Map<String, Figure> figures;

    private FiguresFactory(){
        figures = new HashMap<>();
        figures.put("Rectange", new Rectangle());
        figures.put("Triangle", new Triangle());
    }
    public DriverCommand getFigure(DriverManager driverManager, String type){
        return figures.get(type).draw(driverManager);
    }
    public static FiguresFactory getInstance(){
        return new FiguresFactory();
    }
}