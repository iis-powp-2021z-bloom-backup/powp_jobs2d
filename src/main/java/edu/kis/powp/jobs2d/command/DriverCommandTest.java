package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.LoggerDriver;

public class DriverCommandTest {
    public static void main(String[] args) {
        Job2dDriver driver = new LoggerDriver();
        DriverCommand setPositionCommand = new SetPositionCommand(80,80,driver);
        DriverCommand operateToCommand = new OperateToCommand(-80,-80,driver);
        setPositionCommand.execute();
        operateToCommand.execute();

    }
}
