package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.legacy.drawer.shape.LineFactory;


import static edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController;

public class DrawLineAdapter extends AbstractDriver {
    private ILine line;

    public DrawLineAdapter(int x, int y, ILine line){
        super(x,y);
        this.line=line;
    }
    @Override
    public void operateTo(int x, int y) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(x, y);
        this.setPosition(x, y);
        getDrawerController().drawLine(line);
    }
    @Override
    public String toString() {
        return "DrawLineManager";
    }
}
