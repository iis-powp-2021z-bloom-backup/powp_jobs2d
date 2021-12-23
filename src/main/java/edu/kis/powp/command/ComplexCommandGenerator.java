package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommandGenerator implements Job2dDriver {
    private Job2dDriver job2dDriver;
    private ComplexCommand commands = new ComplexCommand();

    public ComplexCommandGenerator(Job2dDriver job2dDriver) {
        this.job2dDriver = job2dDriver;
    }

    public ComplexCommand get() {
        return commands;
    }

    @Override
    public void setPosition(int x, int y) {
        commands.add(new SetPositionCommand(x, y, job2dDriver));
    }

    @Override
    public void operateTo(int x, int y) {
        commands.add(new OperateToCommand(x, y, job2dDriver));
    }
}
