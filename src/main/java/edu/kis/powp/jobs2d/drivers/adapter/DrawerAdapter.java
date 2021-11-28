package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class DrawerAdapter implements Job2dDriver {

    private final DrawerFeature drawerFeature;
    private final ILine line;
    private int startX;
    private int startY;

    public DrawerAdapter() {
        super();
        this.drawerFeature = new DrawerFeature();
        this.line = LineFactory.getBasicLine();
    }

    public DrawerAdapter(ILine line) {
        super();
        this.line = line;
        this.drawerFeature = new DrawerFeature();
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
        setPosition(x, y);
    }

}
