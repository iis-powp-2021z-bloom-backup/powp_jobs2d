package src.main.java.edu.kis.powp.jobs2d.factory;

import src.main.java.edu.kis.powp.jobs2d.command.ComplexCommand;
import src.main.java.edu.kis.powp.jobs2d.command.DriverCommand;
import src.main.java.edu.kis.powp.jobs2d.command.OperateToCommand;
import src.main.java.edu.kis.powp.jobs2d.command.SetPositionCommand;

public class Rectangle implements Factory{
    private ComplexCommand rect = new ComplexCommand();

    public DriverCommand getShape(edu.kis.powp.jobs2d.drivers.DriverManager driver) {

        rect.addCommand(new SetPositionCommand(-100,-100));
        rect.addCommand(new OperateToCommand(-100,200));
        rect.addCommand(new OperateToCommand(100,200));
        rect.addCommand(new OperateToCommand(100,-100));
        rect.addCommand(new OperateToCommand(-100,-100));

        return rect;
    }
}
