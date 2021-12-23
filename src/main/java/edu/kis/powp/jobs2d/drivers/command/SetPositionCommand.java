package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private final int mX;
    private final int mY;

    public SetPositionCommand(int x, int y){
        mX = x;
        mY = y;
    }

    @Override
    public void execute(Job2dDriver driver) {
        driver.setPosition(mX , mY);
    }
}