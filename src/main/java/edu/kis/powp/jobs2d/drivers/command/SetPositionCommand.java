package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;
    private  Job2dDriver job;

    public Job2dDriver getJob() {
        return job;
    }

    public void setJob(Job2dDriver job) {
        this.job = job;
    }

    public SetPositionCommand(int x, int y, Job2dDriver job) {
        this.x = x;
        this.y = y;
        this.job = job;
    }

    @Override
    public void execute() {
        job.setPosition(this.x, this.y);
    }
}
