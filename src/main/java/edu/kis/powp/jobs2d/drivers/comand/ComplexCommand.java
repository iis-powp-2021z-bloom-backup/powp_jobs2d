package edu.kis.powp.jobs2d.drivers.comand;

import java.util.List;

public class ComplexCommand extends DriverCommand {

    public List<DriverCommand> listOfCommands;

    public ComplexCommand(List<DriverCommand> list){
        this.listOfCommands = list;
    }

    @Override public void execute() {
        for (DriverCommand command:listOfCommands){
            command.execute();
        }
    }
}
