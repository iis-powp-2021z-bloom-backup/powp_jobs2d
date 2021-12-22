package edu.kis.powp.jobs2d.drivers.command.figures;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Figure{
    @Override
    public DriverCommand draw(DriverManager driverManager) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), -100, 0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), 0, 150));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), 100, 0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));

        return new ComplexCommand(driverManager.getCurrentDriver(), commandList);
    }

}