package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String test = "Figure Joe 1";
		if(e.getActionCommand().equals(test))
		{
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());

		}
		else {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
