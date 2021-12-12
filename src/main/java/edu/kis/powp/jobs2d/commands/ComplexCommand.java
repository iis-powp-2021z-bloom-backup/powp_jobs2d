package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> driverCommandList;
    private Job2dDriver job2dDriver;

    public ComplexCommand() {
        this.driverCommandList = new ArrayList<>();
    }

    public void addCommand(DriverCommand driverCommand){
        driverCommandList.add(driverCommand);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand driverCommand: driverCommandList){
            driverCommand.execute(job2dDriver);
        }
    }
}
