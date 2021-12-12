package edu.kis.powp.jobs2d.drivers.lineDrawerAdapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver
{
    private int startX = 0, startY = 0;
    ILine line;
    DrawPanelController panel = DrawerFeature.getDrawerController();

    public LineDrawerAdapter(ILine line) {
        this.line = line;
    }

    @Override
    public void setPosition(int i, int i1) {
        this.startX = i;
        this.startY = i1;
    }

    @Override
    public void operateTo(int i, int i1) {
        //ILine line = LineFactory.getBasicLine();
        this.line.setStartCoordinates(this.startX, this.startY);
        this.line.setEndCoordinates(i, i1);

        panel.drawLine(this.line);
        setPosition(i, i1);
    }
}
