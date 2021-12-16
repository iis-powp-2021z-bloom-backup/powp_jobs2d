package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.Arrays;

public class Test
{
    public static void test1(DriverManager manager)
    {
        ArrayList<DriverCommand> driverCommands = new ArrayList(Arrays.asList(
                new SetPositionCommand(0, 0, manager.getCurrentDriver()),
                new OperateToCommand(50, 100, manager.getCurrentDriver()),
                new OperateToCommand(150, 0, manager.getCurrentDriver()),
                new OperateToCommand(0, 0, manager.getCurrentDriver())
        ));

        ComplexCommand cc = new ComplexCommand(driverCommands);
        cc.execute();

    }

    public static void test2(DriverManager manager)
    {
        int wsp_x = 3;
        int offset_x = -120;
        int wsp_y = 5;
        int offset_y = -100;
        ArrayList<DriverCommand> driverCommands = new ArrayList(Arrays.asList(

                new SetPositionCommand(50*wsp_x + offset_x, 0+ offset_y, manager.getCurrentDriver()),
                new OperateToCommand(40*wsp_x+ offset_x, 10*wsp_y+ offset_y, manager.getCurrentDriver()),
                new OperateToCommand(60*wsp_x+ offset_x, 10*wsp_y+ offset_y, manager.getCurrentDriver()),
                new OperateToCommand(50*wsp_x+ offset_x, 0+ offset_y, manager.getCurrentDriver()),

                new SetPositionCommand(50*wsp_x+ offset_x, 10*wsp_y+ offset_y, manager.getCurrentDriver()),
                new OperateToCommand(30*wsp_x+ offset_x, 20*wsp_y+ offset_y, manager.getCurrentDriver()),
                new OperateToCommand(70*wsp_x+ offset_x, 20*wsp_y+ offset_y, manager.getCurrentDriver()),
                new OperateToCommand(50*wsp_x+ offset_x, 10*wsp_y+ offset_y, manager.getCurrentDriver()),

                new SetPositionCommand(50*wsp_x+ offset_x, 20*wsp_y+ offset_y, manager.getCurrentDriver()),
                new OperateToCommand(20*wsp_x+ offset_x, 30*wsp_y+ offset_y, manager.getCurrentDriver()),
                new OperateToCommand(80*wsp_x+ offset_x, 30*wsp_y+ offset_y, manager.getCurrentDriver()),
                new OperateToCommand(50*wsp_x+ offset_x, 20*wsp_y+ offset_y, manager.getCurrentDriver())
        ));

        ComplexCommand cc = new ComplexCommand(driverCommands);
        cc.execute();

    }


}
