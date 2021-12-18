package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> commandList;
//    private Job2dDriver driver;

    public ComplexCommand() {
//        this.driver = driver;
        this.commandList = new ArrayList<>();
    }


    public void addCommand(DriverCommand command) {
        commandList.add(command);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand command : commandList) {
            command.execute(driver);
        }
    }
}
