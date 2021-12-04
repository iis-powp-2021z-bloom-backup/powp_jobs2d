package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.LineFeature;


public class AbstractAdapter extends AbstractDriver implements Job2dDriver {
    private DrawPanelController drawPanelController;
    private Job2dDriver driver;

    public AbstractAdapter(Job2dDriver driver) {
        super(0,0);
        this.drawPanelController = DrawerFeature.getDrawerController();
        this.driver = driver;
    }

    @Override
    public void operateTo(int x, int y) {
        driver.operateTo(x,y);
    }

    @Override
    public String toString() {
        return "Abstract Drawer";
    }
}
