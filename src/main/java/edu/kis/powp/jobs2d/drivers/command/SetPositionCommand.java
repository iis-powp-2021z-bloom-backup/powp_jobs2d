package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver driver;
    @Override
    public void execute() {
        this.driver.setPosition(this.x, this.y);
    }
    public SetPositionCommand(Job2dDriver driver){
        this.driver = driver;
    }
    public SetPositionCommand setX(int x){
        this.x = x;
        return this;
    }
    public SetPositionCommand setY(int y){
        this.y = y;
        return this;
    }
}
