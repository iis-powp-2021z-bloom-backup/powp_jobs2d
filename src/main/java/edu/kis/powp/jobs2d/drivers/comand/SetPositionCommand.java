package edu.kis.powp.jobs2d.drivers.comand;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand extends DriverCommand {
    private int x,y;
    private Job2dDriver job2dDriver;

    public SetPositionCommand(Job2dDriver job2dDriver,int x, int y) {
        this.job2dDriver = job2dDriver;
        this.job2dDriver = job2dDriver;
        this.y = y;
        this.x = x;

    }

    public void execute() {job2dDriver.setPosition(x,y);}}