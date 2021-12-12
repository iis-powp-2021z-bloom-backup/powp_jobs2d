package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.FiguresFactory;

public class SelectTestFigureOptionListener implements ActionListener {

    private final DriverManager driverManager;
    private final FigureTypeEnum type;

    public SelectTestFigureOptionListener(DriverManager driverManager, FigureTypeEnum type) {
        this.driverManager = driverManager;
        this.type = type;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver driver = driverManager.getCurrentDriver();
        switch (type) {
            case FIGURE_JOE_1:
                FiguresJoe.figureScript1(driver);
                break;
            case FIGURE_JOE_2:
                FiguresJoe.figureScript2(driver);
                break;
            case RECTANGLE:
                ComplexCommand rectangle = FiguresFactory.getRectangle();
                rectangle.execute(driver);
                break;
            case TRIANGLE:
                ComplexCommand triangle = FiguresFactory.getTriangle();
                triangle.execute(driver);
                break;
            default:
                System.out.println("error wrong option");
        }
    }
}
