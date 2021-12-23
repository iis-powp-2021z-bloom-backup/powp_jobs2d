package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> operations = new ArrayList<>();

    public ComplexCommand(List<DriverCommand> list) {
        this.addCommands(list);
    }

    public void addCommand(DriverCommand command) {
        operations.add(command);
    }

    public void addCommands(List<DriverCommand> list) {
        list.forEach(this::addCommand);
    }

    @Override
    public void execute(Job2dDriver driver) {
        operations.forEach(x -> x.execute(driver));
    }
}