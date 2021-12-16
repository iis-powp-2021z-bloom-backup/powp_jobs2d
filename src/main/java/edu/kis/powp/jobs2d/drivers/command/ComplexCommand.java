package edu.kis.powp.jobs2d.drivers.command;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand{
    ArrayList<DriverCommand> cmd;

    public ComplexCommand(ArrayList<DriverCommand> command) {
        cmd = command;
    }
    @Override
    public void execute() {
        for(int i = 0; i < this.cmd.size(); i++){
            cmd.get(i).execute();
        }
    }

    public void addCmd(DriverCommand driverCommand){
        cmd.add(driverCommand);
    }
}