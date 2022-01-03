package edu.kis.powp.jobs2d.command.figures;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class FiguresFactory {

    public static DriverCommand createFigure(FiguresType figuresType, int x, int y, int length) {
        switch (figuresType) {
            case SQUARE: {
                return square(x, y, length);
            }
            case TRIANGLE: {
                return triangle(x, y, length);
            }
            default: {
                throw new NotImplementedException();
            }
        }
    }

    private static DriverCommand square(int x, int y, int length) {
        List<DriverCommand> driverCommandList = new ArrayList<>();

        driverCommandList.add(new SetPositionCommand(x, y));
        driverCommandList.add(new OperateToCommand(x + length, y));
        driverCommandList.add(new OperateToCommand(x + length, y + length));
        driverCommandList.add(new OperateToCommand(x, y + length));
        driverCommandList.add(new OperateToCommand(x, y));

        return new ComplexCommand(driverCommandList);
    }

    private static DriverCommand triangle(int x, int y, int length) {
        List<DriverCommand> list = new ArrayList<>();

        list.add(new SetPositionCommand(x, y));
        list.add(new OperateToCommand(x + length, y));
        // It's a formula for determining the vertex of an equilateral triangle. The '-' was added to put vertex above the base of triangle.
        list.add(new OperateToCommand(x + length / 2,  - (int) (length * Math.sqrt(3)) / 2));
        list.add(new OperateToCommand(x, y));

        return new ComplexCommand(list);
    }

}
