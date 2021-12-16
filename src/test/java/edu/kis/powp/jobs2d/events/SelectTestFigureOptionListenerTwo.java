package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectTestFigureOptionListenerTwo implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListenerTwo(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();

        ArrayList<DriverCommand> driverCommands = new ArrayList<>(Arrays.asList(
                new SetPositionCommand(currentDriver, -100, -100),
                new OperateToCommand(currentDriver, -100, 100),
                new OperateToCommand(currentDriver, 100, 100),
                new OperateToCommand(currentDriver, 100, -100),
                new OperateToCommand(currentDriver, -100, -100))
        );

        new ComplexCommand(driverCommands).execute();
    }
}