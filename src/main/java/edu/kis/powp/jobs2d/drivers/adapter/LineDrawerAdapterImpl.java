package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapterImpl implements Job2dDriver {
    private int startX = 0;
    private int startY = 0;
    private final DrawerFeature drawerFeature;
    private ILine line;

    public LineDrawerAdapterImpl(ILine line) {
        super();
        this.drawerFeature = new DrawerFeature();
        this.line = line;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        drawerFeature.drawLine(line);
        setPosition(x,y);
    }

}
