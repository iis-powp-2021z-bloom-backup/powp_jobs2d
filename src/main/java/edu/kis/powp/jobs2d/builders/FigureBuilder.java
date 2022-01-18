package edu.kis.powp.jobs2d.builders;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.util.ArrayList;
import java.util.List;

public class FigureBuilder implements Job2dDriver {
    private List<DriverCommand> commandList = new ArrayList<>();

    @Override
    public void setPosition(int x, int y) {
        this.commandList.add(new SetPositionCommand(x, y));
    }

    @Override
    public void operateTo(int x, int y) {
        this.commandList.add(new OperateToCommand(x, y));
    }

    public Object build() {
        if (this.commandList.size() == 0) {
            FiguresJoe.figureScript1(this);
        }
        return new ComplexCommand(this.commandList);
    }
}