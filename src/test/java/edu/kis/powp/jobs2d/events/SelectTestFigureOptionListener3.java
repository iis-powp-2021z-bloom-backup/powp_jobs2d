package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.comand.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.comand.DriverCommand;
import edu.kis.powp.jobs2d.drivers.comand.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.comand.SetPositionCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class SelectTestFigureOptionListener3 implements ActionListener {

    private DriverManager driverManager;
    public SelectTestFigureOptionListener3(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();

        List<DriverCommand> driverCommands = Arrays.asList(
                new SetPositionCommand(currentDriver, -200, 100),
                new OperateToCommand(currentDriver, 200, 100),
                new OperateToCommand(currentDriver, 200, -100),
                new OperateToCommand(currentDriver, -200, -100),
                new OperateToCommand(currentDriver, -200, 100)
        );

        new ComplexCommand(driverCommands).execute();
    }
}
