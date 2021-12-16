package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver j2dd;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Job2dDriver getJ2dd() {
        return j2dd;
    }

    public void setJ2dd(Job2dDriver j2dd) {
        this.j2dd = j2dd;
    }

    public SetPositionCommand(Job2dDriver j2dd, int x, int y) {
        this.j2dd = j2dd;
        this.x = x;
        this.y = y;
    }



    @Override
    public void execute() {
        j2dd.setPosition(x, y);
    }
}