package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.List;


public class ComplexCommand implements DriverCommand{
    private Job2dDriver job2dDriver;
    private List<DriverCommand> driverCommands;

    public ComplexCommand(Job2dDriver job2dDriver, List<DriverCommand> driverCommands){
        this.job2dDriver = job2dDriver;
        this.driverCommands = driverCommands;
    }

    @Override
    public void execute() {
        for (DriverCommand command : driverCommands){
            command.execute();
        }
    }
}
