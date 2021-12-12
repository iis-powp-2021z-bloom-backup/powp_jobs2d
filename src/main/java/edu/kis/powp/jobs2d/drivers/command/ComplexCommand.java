package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private Job2dDriver job2dDriver;
    private ArrayList<DriverCommand> commands;

    public ComplexCommand(Job2dDriver job2dDriver) {
        this.job2dDriver = job2dDriver;
        commands = new ArrayList<>();
    }

    public void add(DriverCommand driverCommand) {
        commands.add(driverCommand);
    }

    public void remove(int id) {
        commands.remove(id);
    }

    public void set(ArrayList<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(command -> command.execute());
    }
}