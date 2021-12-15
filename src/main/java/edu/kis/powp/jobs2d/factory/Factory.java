package src.main.java.edu.kis.powp.jobs2d.factory;

import src.main.java.edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public interface Factory {
    DriverCommand getShape(DriverManager driver);
}
