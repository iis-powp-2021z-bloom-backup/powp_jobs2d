package edu.kis.powp.jobs2d.drivers;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class DrawLineManager extends AbstractDriver {
    private ILine line;

    public DrawLineManager(int x, int y, ILine line){
        super(x,y);
        this.line=line;
    }
    @Override
    public void operateTo(int x, int y) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(x, y);
        this.setPosition(x, y);
        DrawerFeature.getDrawerController().drawLine(line);
    }
    @Override
    public String toString() {
        return "DrawLineManager";
    }
}
