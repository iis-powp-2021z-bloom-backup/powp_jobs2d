package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class RectangleFactory implements FigureFactory{
    @Override
    public void drawFigure(Job2dDriver driver) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(-120,-120));
        complexCommand.addCommand(new OperateToCommand(120,-120));
        complexCommand.addCommand(new OperateToCommand(120,200));
        complexCommand.addCommand(new OperateToCommand(-120,200));
        complexCommand.addCommand(new OperateToCommand(-120,-120));
        complexCommand.addCommand(new SetPositionCommand(-120,-120));
        complexCommand.addCommand(new SetPositionCommand(120,-120));
        complexCommand.execute(driver);
    }
}
