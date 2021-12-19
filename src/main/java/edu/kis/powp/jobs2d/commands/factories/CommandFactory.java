package edu.kis.powp.jobs2d.commands.factories;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

import static edu.kis.powp.jobs2d.commands.utils.Constants.*;

public class CommandFactory {
    private CommandFactory(){};

    public static DriverCommand make(Figure figure) {
        switch(figure){
            case SQUARE: {
                return makeSquare();
            }
            case TRIANGLE: {
                return makeTriangle();
            }
            case CROSS: {
                return makeCross();
            }
        }
        return new ComplexCommand(new ArrayList<>());
    }

    private static DriverCommand makeSquare() {
        List<DriverCommand> list = new ArrayList<>();

        list.add(new SetPositionCommand(10,10));
        list.add(new OperateToCommand(-10,10));
        list.add(new OperateToCommand(-10,-10));
        list.add(new OperateToCommand(10,-10));
        list.add(new OperateToCommand(10,10));

        return new ComplexCommand(list);
    }

    private static DriverCommand makeTriangle() {
        List<DriverCommand> list = new ArrayList<>();

        list.add(new SetPositionCommand(10,10));
        list.add(new OperateToCommand(-10,-10));
        list.add(new OperateToCommand(10,-10));
        list.add(new OperateToCommand(10,10));

        return new ComplexCommand(list);
    }

    // builder usage example
    private static DriverCommand makeCross() {
        return new ComplexCommand.Builder()
                .setPosition(10,10)
                .operateTo(-10,-10)
                .setPosition(10,-10)
                .operateTo(-10,10)
                .build();
    }
}
