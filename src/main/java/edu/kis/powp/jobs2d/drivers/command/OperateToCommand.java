package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand
{
    private int x;
    private int y;
    private Job2dDriver job;

    public OperateToCommand(int x, int y, Job2dDriver job) {
        this.x = x;
        this.y = y;
        this.job = job;
    }

    @Override
    public void execute() {
        this.job.operateTo(this.x, this.y);
    }

    public Job2dDriver getJob() {
        return job;
    }

    public void setJob(Job2dDriver job) {
        this.job = job;
    }
}
