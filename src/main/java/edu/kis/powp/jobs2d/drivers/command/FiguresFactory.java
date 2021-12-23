package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class FiguresFactory {

    public static DriverCommand square(int startX, int startY, int sideLength) {
        List<DriverCommand> list = new ArrayList<>();

        list.add(new SetPositionCommand(startX,startY));
        list.add(new OperateToCommand(startX + sideLength, startY));
        list.add(new OperateToCommand(startX + sideLength, startY + sideLength));
        list.add(new OperateToCommand(startX,startY + sideLength));
        list.add(new OperateToCommand(startX,startY));

        return new ComplexCommand(list);
    }

    public static DriverCommand triangle(int startX, int startY, int sideLength) {
        List<DriverCommand> list = new ArrayList<>();

        list.add(new SetPositionCommand(startX,startY));
        list.add(new OperateToCommand(startX + sideLength,startY));
        list.add(new OperateToCommand(startX + sideLength / 2, (int) ((startY - sideLength * Math.sqrt(3)) / 2)));
        list.add(new OperateToCommand(startX,startY));

        return new ComplexCommand(list);
    }
}