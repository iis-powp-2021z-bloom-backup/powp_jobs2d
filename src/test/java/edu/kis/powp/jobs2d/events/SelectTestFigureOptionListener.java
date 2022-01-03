package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.collection.TestNames;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.figures.FiguresFactory;
import edu.kis.powp.jobs2d.figures.FiguresType;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (TestNames.getByLabel(e.getActionCommand())) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case SQUARE:
				FiguresFactory.createFigure(FiguresType.SQUARE, -200, 0, 200).execute(DriverFeature.getDriverManager().getCurrentDriver());
				break;
			case TRIANGLE:
				FiguresFactory.createFigure(FiguresType.TRIANGLE, -200, 0, 200).execute(DriverFeature.getDriverManager().getCurrentDriver());
				break;
		}
	}
}
