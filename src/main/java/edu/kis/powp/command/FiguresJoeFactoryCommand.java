package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.util.ArrayList;

public class FiguresJoeFactoryCommand implements Job2dDriver {

    private ComplexCommand.Builder builder;

    private FiguresJoeFactoryCommand() {
        this.builder = new ComplexCommand.Builder();
    }

    @Override
    public void setPosition(int x, int y) {
        builder.setPosition(x,y);
    }

    @Override
    public void operateTo(int x, int y) {
        builder.operateTo(x,y);
    }

    public static DriverCommand make(Const.FigureJoe figure) {
        switch (figure) {
            case SCRIPT_1:
                return getScript1();
            case SCRIPT_2:
                return getScript2();
            default:
                return new ComplexCommand(new ArrayList<>());
        }
    }

    private static DriverCommand getScript1() {
        FiguresJoeFactoryCommand factory = new FiguresJoeFactoryCommand();
        FiguresJoe.figureScript1(factory);
        return factory.builder.build();
    }

    private static DriverCommand getScript2() {
        FiguresJoeFactoryCommand factory = new FiguresJoeFactoryCommand();
        FiguresJoe.figureScript2(factory);
        return factory.builder.build();
    }
}
