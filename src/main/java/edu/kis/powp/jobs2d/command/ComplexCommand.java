package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private final List<DriverCommand> commands = new ArrayList<>();

    public ComplexCommand(List<DriverCommand> commands) {
        this.commands.addAll(commands);
    }

    @Override
    public void execute(Job2dDriver driver) {
        commands.forEach(driverCommand -> driverCommand.execute(driver));
    }

}
