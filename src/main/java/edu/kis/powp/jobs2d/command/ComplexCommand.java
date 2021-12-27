package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands;

    public ComplexCommand() {
        commands = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> drivers) {
        this.commands = drivers;
    }

    public ComplexCommand addDriverCommand(DriverCommand driverCommand) {
        commands.add(driverCommand);
        return this;
    }

    @Override
    public void execute() {
        commands.forEach(DriverCommand::execute);
    }
}
