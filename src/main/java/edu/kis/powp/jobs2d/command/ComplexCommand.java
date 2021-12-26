package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> drivers;

    public ComplexCommand() {
        drivers = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> drivers) {
        this.drivers = drivers;
    }

    ComplexCommand addDriverCommand(DriverCommand driverCommand) {
        drivers.add(driverCommand);
        return this;
    }

    @Override
    public void execute() {
        drivers.forEach(DriverCommand::execute);
    }
}
