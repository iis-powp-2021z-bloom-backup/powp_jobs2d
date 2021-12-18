package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand{

    ArrayList<DriverCommand> commands;

    public ComplexCommand(ArrayList<DriverCommand> commands)
    {
        this.commands = commands;
    }

    public void addCommand(DriverCommand job)
    {
        this.commands.add(job);
    }


    @Override
    public void execute() {

        commands.stream().forEach(t -> t.execute());
    }

}
