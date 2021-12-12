package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> commandList = new ArrayList<>();

    public ComplexCommand(List<DriverCommand> complexList){
        commandList = complexList;
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand command : commandList){
            command.execute(driver);
        }
    }
}
