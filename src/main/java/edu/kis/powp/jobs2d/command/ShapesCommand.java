package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapesCommand {
    public static ComplexCommand square(){
        ComplexCommand shape = new ComplexCommand();
        shape.addCommand(new SetPositionCommand(0,0));
        shape.addCommand(new OperateToCommand(50,0));
        shape.addCommand(new OperateToCommand(50,50));
        shape.addCommand(new OperateToCommand(0,50));
        shape.addCommand(new OperateToCommand(0,0));
        return shape;
    }
    public static ComplexCommand rectangle(){
        ComplexCommand shape = new ComplexCommand();
        shape.addCommand(new SetPositionCommand(0,0));
        shape.addCommand(new OperateToCommand(50,0));
        shape.addCommand(new OperateToCommand(50,100));
        shape.addCommand(new OperateToCommand(0,100));
        shape.addCommand(new OperateToCommand(0,0));
        return shape;
    }

    public static ComplexCommand envelop(){
        ComplexCommand shape = new ComplexCommand();
        shape.addCommand(new SetPositionCommand(0,0));
        shape.addCommand(new OperateToCommand(100,0));
        shape.addCommand(new OperateToCommand(50,25));
        shape.addCommand(new OperateToCommand(0,0));
        shape.addCommand(new OperateToCommand(0,50));
        shape.addCommand(new OperateToCommand(50,25));
        shape.addCommand(new OperateToCommand(100,50));
        shape.addCommand(new OperateToCommand(0,50));
        shape.addCommand(new OperateToCommand(50,75));
        shape.addCommand(new OperateToCommand(100,50));
        shape.addCommand(new OperateToCommand(100,0));
        return shape;
    }

}

