package edu.kis.powp.jobs2d.drivers.command.figures;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;

public interface Figure {
    public DriverCommand draw(DriverManager driverManager);
}