package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factory.FigureFactory;
import edu.kis.powp.jobs2d.factory.RectangleFactory;
import edu.kis.powp.jobs2d.factory.TriangleFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private final static String TERN_TEST= "Tern test";
	private final static String RECTANGLE="Rectangle test";
	private final static String TRIANGLE="Triangle test";
	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(TERN_TEST)){
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		} else if(e.getActionCommand().equals(RECTANGLE)){
			FigureFactory rectangleFactory = new RectangleFactory();
			rectangleFactory.drawFigure(driverManager.getCurrentDriver());
		} else if(e.getActionCommand().equals(TRIANGLE)){
			FigureFactory triangleFactory = new TriangleFactory();
			triangleFactory.drawFigure(driverManager.getCurrentDriver());
		} else {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
	}
}
