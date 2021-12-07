package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;

public class SelectTestFigure2OptionListener extends SelectTestFigureOptionListener {
    public SelectTestFigure2OptionListener(DriverManager driverManager) {
        super(driverManager);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJoe.figureScript2(driverManager.getCurrentDriver());
    }
}
