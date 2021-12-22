package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandsTest {
    private static Job2dDriver driver = new StubDriver();


    public static void main(String[] args){
        DriverCommand setPositionCommand = new SetPositionCommand(driver, 4, 5);
        DriverCommand operateToCommand = new OperateToCommand(driver, 7,8);
        DriverCommand operateToCommand2 = new OperateToCommand(driver,8,8);
        DriverCommand operateToCommand3 = new OperateToCommand(driver,9,10);
        DriverCommand operateToCommand4 = new OperateToCommand(driver,11,12);

        List<DriverCommand> driverCommands = new ArrayList<>();
        driverCommands.add(setPositionCommand);
        driverCommands.add(operateToCommand);
        driverCommands.add(operateToCommand2);
        driverCommands.add(operateToCommand3);
        driverCommands.add(operateToCommand4);

        DriverCommand complexCommand = new ComplexCommand(driver, driverCommands);

        setPositionCommand.execute();
        operateToCommand.execute();

        complexCommand.execute();

    }

    private static class StubDriver implements Job2dDriver{

        @Override
        public void operateTo(int x, int y){
            System.out.println("Driver action operateTo...");
        }

        @Override
        public void setPosition(int x, int y){
            System.out.println("Driver action setPosition...");
        }
    }
}
