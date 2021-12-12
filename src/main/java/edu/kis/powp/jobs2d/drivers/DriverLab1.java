package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class DriverLab1 extends AbstractDriver
{
    public DriverLab1(int x, int y) {
        super(x, y);
    }

    @Override
    public void operateTo(int x, int y) {
        Job2dDriver job2dDriver = DriverFeature.getDriverManager().getCurrentDriver();

        job2dDriver.setPosition(getX(), getY());
        job2dDriver.operateTo(x, y);
        setPosition(x, y);
    }
}
