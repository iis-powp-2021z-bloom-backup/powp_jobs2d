package edu.kis.powp.jobs2d.command;

import java.util.List;
public class ComplexCommand implements DriverCommand{
    public List<DriverCommand> drivers;

    public ComplexCommand(List<DriverCommand> drivers){
        this.drivers = drivers;
    }

    @Override public void execute() {
        for (DriverCommand command:drivers){
            command.execute();
        }
    }
}

