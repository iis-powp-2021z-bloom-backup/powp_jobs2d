package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public abstract class ShapeFactory {
    public static ComplexCommand createTriangle(int edgeLength, Job2dDriver job2dDriver) {
        ComplexCommand command = new ComplexCommand();
        int halfSpan = edgeLength / 2;
        int halfHeight = (int) ((edgeLength * Math.sqrt(3)) / 2.0 / 2.0);

        command.add(new SetPositionCommand(0, -halfHeight, job2dDriver));
        command.add(new OperateToCommand(halfSpan, halfHeight, job2dDriver));
        command.add(new OperateToCommand(-halfSpan, halfHeight, job2dDriver));
        command.add(new OperateToCommand(0, -halfHeight, job2dDriver));

        return command;
    }

    public static ComplexCommand createSquare(int edgeLength, Job2dDriver job2dDriver) {
        ComplexCommand command = new ComplexCommand();
        int half = edgeLength / 2;

        command.add(new SetPositionCommand(-half, -half, job2dDriver));
        command.add(new OperateToCommand(half, -half, job2dDriver));
        command.add(new OperateToCommand(half, half, job2dDriver));
        command.add(new OperateToCommand(-half, half, job2dDriver));
        command.add(new OperateToCommand(-half, -half, job2dDriver));

        return command;
    }

    public static ComplexCommand createHexagon(int edgeLength, Job2dDriver job2dDriver) {
        ComplexCommand command = new ComplexCommand();
        int a = edgeLength / 2;
        int b = (int) ((edgeLength * Math.sqrt(3)) / 2.0);

        command.add(new SetPositionCommand(edgeLength, 0, job2dDriver));
        command.add(new OperateToCommand(a, b, job2dDriver));
        command.add(new OperateToCommand(-a, b, job2dDriver));
        command.add(new OperateToCommand(-edgeLength, 0, job2dDriver));
        command.add(new OperateToCommand(-a, -b, job2dDriver));
        command.add(new OperateToCommand(a, -b, job2dDriver));
        command.add(new OperateToCommand(edgeLength, 0, job2dDriver));

        return command;
    }

    public static ComplexCommand createCross(Job2dDriver job2dDriver) {
        ComplexCommand command = new ComplexCommand();

        command.add(new SetPositionCommand(10, 10, job2dDriver));
        command.add(new OperateToCommand(-10, -10, job2dDriver));
        command.add(new SetPositionCommand(10, -10, job2dDriver));
        command.add(new OperateToCommand(-10, 10, job2dDriver));

        return command;
    }

}