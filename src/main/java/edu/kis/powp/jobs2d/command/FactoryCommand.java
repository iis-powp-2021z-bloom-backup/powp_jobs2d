package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.ArrayList;
import java.util.List;
public class FactoryCommand {
    public static ComplexCommand drawTrinagle(Job2dDriver driver){
        List<DriverCommand> shapes = new ArrayList<>();
        shapes.add(new SetPositionCommand(-80,-80, driver));
        shapes.add(new OperateToCommand(-80,80, driver));
        shapes.add(new OperateToCommand(0,80, driver));
        shapes.add(new OperateToCommand(-80,-80, driver));
        return new ComplexCommand(shapes);
    }
    public static ComplexCommand drawFigure(Job2dDriver driver){
        List<DriverCommand> shapes = new ArrayList<>();
        shapes.add(new SetPositionCommand(-100,-100, driver));
        shapes.add(new OperateToCommand(-100,100, driver));
        shapes.add(new OperateToCommand(0,0, driver));
        shapes.add(new OperateToCommand(100,100, driver));
        shapes.add(new OperateToCommand(100,-100, driver));
        shapes.add(new OperateToCommand(-100,-100, driver));
        return new ComplexCommand(shapes);
    }
}
