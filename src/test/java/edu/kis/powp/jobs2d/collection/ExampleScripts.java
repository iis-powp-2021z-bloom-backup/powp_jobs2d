package edu.kis.powp.jobs2d.collection;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.figures.FiguresFactory;
import edu.kis.powp.jobs2d.figures.FiguresType;

public class ExampleScripts {

    public static void squareScript(Job2dDriver driver) {
        FiguresFactory.createFigure(FiguresType.SQUARE, -200, 0, 200).execute(driver);
    }

    public static void triangleScript(Job2dDriver driver) {
        FiguresFactory.createFigure(FiguresType.TRIANGLE, -200, 0, 200).execute(driver);
    }

}
