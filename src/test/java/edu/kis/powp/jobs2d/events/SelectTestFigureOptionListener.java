package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.drivers.DriverWrapper;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private DriverWrapper wrapper = new DriverWrapper(0,0);

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			case "Figure Joe 1":
				DrawerFeature.getDrawerController().clearPanel();
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case "Figure Joe 2":
				DrawerFeature.getDrawerController().clearPanel();
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case "Figure Jane":
				FiguresJane.figureScript(wrapper);
		}
	}

}
