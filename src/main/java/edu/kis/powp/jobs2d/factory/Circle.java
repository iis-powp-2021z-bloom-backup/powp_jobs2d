package src.main.java.edu.kis.powp.jobs2d.factory;

import src.main.java.edu.kis.powp.jobs2d.command.ComplexCommand;
import src.main.java.edu.kis.powp.jobs2d.command.DriverCommand;
import src.main.java.edu.kis.powp.jobs2d.command.OperateToCommand;
import src.main.java.edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class Circle implements Factory{

    private ComplexCommand circle = new ComplexCommand();

    public DriverCommand getShape(DriverManager driver) {

        circle.addCommand(new SetPositionCommand(100, 0));

        for (float i = 0; i < 2*Math.PI+1; i+=0.1) {
            int x = (int) (100 * Math.cos(i));
            int y = (int) (100 * Math.sin(i));
            circle.addCommand(new OperateToCommand(x, y));
        }

        return circle;
    }
}
