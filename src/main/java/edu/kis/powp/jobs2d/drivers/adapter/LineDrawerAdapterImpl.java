package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapterImpl implements Job2dDriver {
    private int sX = 0;
    private int sY = 0;
    private final DrawerFeature drawFeature;
    private ILine line;

    public LineDrawerAdapterImpl(ILine line) {
        super();
        this.drawFeature = new DrawerFeature();
        this.line = line;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.sX, this.sY);
        line.setEndCoordinates(x, y);
        drawFeature.drawLine(line);
        setPosition(x,y);
    }

    @Override
    public void setPosition(int x, int y) {
        this.sX = x;
        this.sY = y;
    }

}
