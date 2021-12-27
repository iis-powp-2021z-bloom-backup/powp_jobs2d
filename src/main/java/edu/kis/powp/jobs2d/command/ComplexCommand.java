package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.utils.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands;

    public ComplexCommand() {
        commands = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> drivers) {
        this.commands = drivers;
    }

    public ComplexCommand addCommand(DriverCommand driverCommand) {
        commands.add(driverCommand);
        return this;
    }

    @Override
    public void execute() {
        commands.forEach(DriverCommand::execute);
    }

    public static ComplexCommand createSquare(Job2dDriver driver, int startX, int startY, int length) {
        return new ComplexCommand(List.of(
                new SetPositionCommand(driver, startX, startY),
                new OperateToCommand(driver, startX + length, startY),
                new OperateToCommand(driver, startX + length, startY + length),
                new OperateToCommand(driver, startX, startY + length),
                new OperateToCommand(driver, startX, startY)
        ));
    }

    // wanted to create more simplified but robust and agile method to create figures
    public static ComplexCommand createFigure(Job2dDriver driver, List<Point> points) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(driver, points.get(0).getX(), points.get(0).getY()));

        commands.addAll(points.stream().skip(1)
                .map(point -> new OperateToCommand(driver, point.getX(), point.getY()))
                .collect(Collectors.toList()));

        commands.add(new OperateToCommand(driver, points.get(0).getX(), points.get(0).getY()));
        return new ComplexCommand(commands);
    }
}
