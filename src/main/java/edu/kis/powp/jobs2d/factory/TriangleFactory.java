package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;


public class TriangleFactory {
    public static ComplexCommand triangle(Job2dDriver driver){
        ComplexCommand triangle = new ComplexCommand();
        triangle.addCommand(new SetPositionCommand(driver).setX(-100).setY(0));
        triangle.addCommand(new OperateToCommand(driver).setX(0).setY(-100));
        triangle.addCommand(new OperateToCommand(driver).setX(100).setY(0));
        triangle.addCommand(new OperateToCommand(driver).setX(-100).setY(0));

        return triangle;
    }
}
