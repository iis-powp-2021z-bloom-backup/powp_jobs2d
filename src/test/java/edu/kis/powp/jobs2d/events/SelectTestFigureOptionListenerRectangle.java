package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class SelectTestFigureOptionListenerRectangle implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListenerRectangle(DriverManager driverManager){
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DrawerFeature.getDrawerController().clearPanel();
        Job2dDriver driver = driverManager.getCurrentDriver();

        List<DriverCommand> commandList = Arrays.asList(
                new SetPositionCommand(75, 75),
                new OperateToCommand(75, -75),
                new OperateToCommand(-75, -75),
                new OperateToCommand(-75, 75),
                new OperateToCommand(75, 75)
        );

        new ComplexCommand(commandList).execute(driver);
    }
}
