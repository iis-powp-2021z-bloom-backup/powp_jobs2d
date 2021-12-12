package edu.kis.powp.jobs2d.command;

public class FiguresFactory {

    public static ComplexCommand getRectangle() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.add(new SetPositionCommand(-100, 100));
        complexCommand.add(new OperateToCommand(-100, -100));
        complexCommand.add(new OperateToCommand(100, -100));
        complexCommand.add(new OperateToCommand(100, 100));
        complexCommand.add(new OperateToCommand(-100, 100));
        return complexCommand;
    }


    public static ComplexCommand getTriangle() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.add(new SetPositionCommand(0, 100));
        complexCommand.add(new OperateToCommand(-50, -50));
        complexCommand.add(new OperateToCommand(50, -50));
        complexCommand.add(new OperateToCommand(0, 100));
        return complexCommand;
    }
}