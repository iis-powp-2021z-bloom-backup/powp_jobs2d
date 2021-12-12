package edu.kis.powp.jobs2d.drivers.comand;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    private int x, y;
    private Job2dDriver job2dDriver;

    public OperateToCommand(Job2dDriver job2Driver, int x, int y) {
        this.job2dDriver = job2Driver;
        this.x = x;
        this.y = y;
    }

    @Override public void execute() {
        job2dDriver.operateTo(x, y);
    }

}
