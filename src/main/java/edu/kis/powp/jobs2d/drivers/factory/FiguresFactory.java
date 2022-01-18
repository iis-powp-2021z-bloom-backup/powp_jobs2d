package edu.kis.powp.jobs2d.drivers.factory;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class FiguresFactory {

    public static ComplexCommand getSquareCommands(int startX, int startY, int distance) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(startX, startY));
        commandList.add(new OperateToCommand(startX + distance, startY));
        commandList.add(new OperateToCommand(startX + distance, startY + distance));
        commandList.add(new OperateToCommand(startX, startY + distance));
        commandList.add(new OperateToCommand(startX, startY));
        return new ComplexCommand(commandList);
    }

    public static DriverCommand getTriangleCommands(int startX, int startY, int distance) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(startX, startY));
        commandList.add(new OperateToCommand(startX+distance, startY));
        commandList.add(new OperateToCommand(startX, startY+distance));
        commandList.add(new OperateToCommand(startX, startY));
        return new ComplexCommand(commandList);
    }

    public static ComplexCommand getTrapeziumCommands(int startX, int startY, int heightsDistance) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(startX, startY));
        commandList.add(new OperateToCommand(startX - 2*heightsDistance, startY));
        commandList.add(new OperateToCommand(startX - (3*heightsDistance)/2, startY - heightsDistance));
        commandList.add(new OperateToCommand(startX - heightsDistance/2, startY - heightsDistance));
        commandList.add(new OperateToCommand(startX, startY));
        return new ComplexCommand(commandList);
    }

    public static ComplexCommand getCrossCommands(int startX, int startY, int size) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(startX, startY));
        commandList.add(new OperateToCommand(startX + size, startY + size));
        commandList.add(new SetPositionCommand(startX, startY + size));
        commandList.add(new OperateToCommand(startX + size, startY));
        return new ComplexCommand(commandList);
    }

    public static ComplexCommand getArrowTipCommands(int startX, int startY, int side) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(startX, startY));
        commandList.add(new OperateToCommand(startX + side/2, startY + side/2));
        commandList.add(new OperateToCommand(startX + side, startY));
        commandList.add(new OperateToCommand(startX + side*2, startY));
        commandList.add(new OperateToCommand(startX + side/2, startY - side));
        commandList.add(new OperateToCommand(startX - side, startY));
        commandList.add(new OperateToCommand(startX, startY));
        return new ComplexCommand(commandList);
    }
}