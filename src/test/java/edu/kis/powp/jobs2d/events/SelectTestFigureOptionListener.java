package edu.kis.powp.jobs2d.events;

import src.main.java.edu.kis.powp.jobs2d.command.ComplexCommand;
import src.main.java.edu.kis.powp.jobs2d.factory.Circle;
import src.main.java.edu.kis.powp.jobs2d.factory.Rectangle;
import src.main.java.edu.kis.powp.jobs2d.factory.Factory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.Figure;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private Figure figure;



	public SelectTestFigureOptionListener(DriverManager driverManager, Figure name) {
		this.driverManager = driverManager;
		this.figure = name;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (figure.equals(Figure.figureScript1))
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if (figure.equals(Figure.figureScript2))
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		else if (figure.equals(Figure.rect)){
			Factory factory = (Factory) new Rectangle();
			factory.getShape(driverManager).execute(driverManager.getCurrentDriver());
		}else if (figure.equals(Figure.circle)){
			Factory factory = (Factory) new Circle();
			factory.getShape(driverManager).execute(driverManager.getCurrentDriver());
		}
	}
}