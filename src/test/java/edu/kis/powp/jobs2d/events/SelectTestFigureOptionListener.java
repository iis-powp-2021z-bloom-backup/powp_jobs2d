package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverCustomize;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private DriverCustomize jane = new DriverCustomize(0,0);

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().toString().compareTo("Figure Joe 1") == 0)
		{
			DrawerFeature.getDrawerController().clearPanel();
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else if (e.getActionCommand().toString().compareTo("Figure Joe 2") == 0)
		{
			DrawerFeature.getDrawerController().clearPanel();
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
		else if (e.getActionCommand().toString().compareTo("Figure Jane") == 0)
		{
			DrawerFeature.getDrawerController().clearPanel();
			FiguresJane.figureScript(jane);
		}

	}
}
