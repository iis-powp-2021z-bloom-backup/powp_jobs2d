package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Callable;
import java.util.function.Function;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	protected DriverManager driverManager;
	private Runnable action;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	public DriverManager getDriverManager() {
		return driverManager;
	}

	public void addAction(Runnable function) {
		action = function;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			action.run();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
