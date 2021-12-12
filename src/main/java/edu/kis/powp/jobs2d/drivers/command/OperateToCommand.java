package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver driver;

    public OperateToCommand(Job2dDriver driver){
        this.driver=driver;
    }

    @Override
    public void execute() {
        this.driver.operateTo(this.x,this.y);
    }
    public OperateToCommand setX(int x){
        this.x=x;
        return this;
    }
    public OperateToCommand setY(int y){
        this.y=y;
        return this;
    }
}
