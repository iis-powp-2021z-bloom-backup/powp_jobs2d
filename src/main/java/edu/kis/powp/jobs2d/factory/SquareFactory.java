package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class SquareFactory {
    public static ComplexCommand square(Job2dDriver driver){

        ComplexCommand square = new ComplexCommand();

        square.addCommand(new SetPositionCommand(driver).setX(-50).setY(0));
        square.addCommand(new OperateToCommand(driver).setX(-50).setY(50));
        square.addCommand(new OperateToCommand(driver).setX(50).setY(50));
        square.addCommand(new OperateToCommand(driver).setX(50).setY(-50));
        square.addCommand(new OperateToCommand(driver).setX(-50).setY(-50));
        square.addCommand(new OperateToCommand(driver).setX(-50).setY(0));

        return square;
    }
}
