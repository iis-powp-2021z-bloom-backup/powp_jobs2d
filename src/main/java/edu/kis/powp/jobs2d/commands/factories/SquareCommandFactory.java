package edu.kis.powp.jobs2d.commands.factories;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class SquareCommandFactory {
    public static DriverCommand make() {
        List<DriverCommand> list = new ArrayList<>();

        list.add(new SetPositionCommand(10,10));
        list.add(new OperateToCommand(-10,10));
        list.add(new OperateToCommand(-10,-10));
        list.add(new OperateToCommand(10,-10));
        list.add(new OperateToCommand(10,10));

        return new ComplexCommand(list);
    }
}
