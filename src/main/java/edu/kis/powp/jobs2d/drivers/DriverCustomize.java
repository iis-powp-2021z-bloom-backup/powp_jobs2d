package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class DriverCustomize extends AbstractDriver
{
    public DriverCustomize(int x, int y) {
        super(x, y);
    }

    @Override
    public void operateTo(int i, int i1) {
        Job2dDriver job2dDriver = DriverFeature.getDriverManager().getCurrentDriver();

        job2dDriver.setPosition(getX(), getY());
        job2dDriver.operateTo(i, i1);
        setPosition(i, i1);
    }
}
