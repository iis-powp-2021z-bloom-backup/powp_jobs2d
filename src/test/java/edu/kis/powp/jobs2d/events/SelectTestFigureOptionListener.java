package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private String figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, String name) {
		this.driverManager = driverManager;
		this.figure = name;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (figure == "figureScript1")
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if (figure == "figureScript2")
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}
}