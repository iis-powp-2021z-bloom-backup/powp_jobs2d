package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> commandList;

    public ComplexCommand() {
        this.commandList = new ArrayList<DriverCommand>();
    }
    @Override
    public void execute() {
        commandList.forEach(DriverCommand::execute);
    }
    public void addCommand(DriverCommand driverCommand){
        this.commandList.add(driverCommand);
    }
}