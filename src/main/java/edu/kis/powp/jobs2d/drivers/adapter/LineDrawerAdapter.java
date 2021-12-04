package edu.kis.powp.jobs2d.drivers.adapter;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver{
    private int startX = 0, startY = 0;
    private final DrawerFeature linesDrawer;
   private ILine specialLine;
    public LineDrawerAdapter(ILine specialLine) {
        super();
        this.linesDrawer = new DrawerFeature();
        this.specialLine = specialLine;
    }
    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        specialLine.setStartCoordinates(this.startX, this.startY);
        specialLine.setEndCoordinates(x, y);
        setPosition(x,y); //improved functionality to draw rectangle shape
        linesDrawer.drawLines(specialLine); //display shape in main app window
    }
}
