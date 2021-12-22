package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver job2dDriver;

    public SetPositionCommand(Job2dDriver job2dDriver, int x, int y){
        this.x = x;
        this.y = y;
        this.job2dDriver = job2dDriver;

    }
    @Override
    public void execute(){
        job2dDriver.setPosition(this.x,this.y);
    }
}