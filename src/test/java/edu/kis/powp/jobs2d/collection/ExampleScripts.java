package edu.kis.powp.jobs2d.collection;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.figures.FiguresFactory;
import edu.kis.powp.jobs2d.figures.FiguresType;

import java.util.ArrayList;
import java.util.List;

public class ExampleScripts {

    public static void squareScript(Job2dDriver driver) {
        FiguresFactory.createFigure(FiguresType.SQUARE, -200, 0, 200).execute(driver);
    }

    public static void triangleScript(Job2dDriver driver) {
        FiguresFactory.createFigure(FiguresType.TRIANGLE, -200, 0, 200).execute(driver);
    }

    public static void customScript(Job2dDriver driver) {
        List<DriverCommand> driverCommandList = new ArrayList<>();

        driverCommandList.add(new SetPositionCommand(-120, -120));
        driverCommandList.add(new OperateToCommand(120, -120));
        driverCommandList.add(new OperateToCommand(120, 120));
        driverCommandList.add(new OperateToCommand(-120, 120));
        driverCommandList.add(new OperateToCommand(-120, -120));
        driverCommandList.add(new OperateToCommand(-120, -120));
        driverCommandList.add(new OperateToCommand(120, 120));
        driverCommandList.add(new SetPositionCommand(120, -120));
        driverCommandList.add(new OperateToCommand(-120, 120));

        new ComplexCommand(driverCommandList).execute(driver);
    }

}
