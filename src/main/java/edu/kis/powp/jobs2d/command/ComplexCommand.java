package src.main.java.edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> listCMDs = new ArrayList();

    public void addCommand(DriverCommand cmd) {
        listCMDs.add(cmd);
    }

    @Override
    public void execute(Job2dDriver driver) {
        listCMDs.forEach(cmd -> {
            cmd.execute(driver);
        });
    }
}