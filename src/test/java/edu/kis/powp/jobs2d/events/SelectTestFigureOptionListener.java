package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.*;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Figure Joe 1")){

			FiguresJoe.figureScript1(driverManager.getCurrentDriver());

		}
		else if(e.getActionCommand().equals("Figure Joe 2")){

			FiguresJoe.figureScript2(driverManager.getCurrentDriver());

		}
		else if(e.getActionCommand().equals("Rectangle")){

			ComplexCommand command = new ComplexCommand(Factories.Rectangle());
			command.execute(driverManager.getCurrentDriver());

		}
		else if(e.getActionCommand().equals("Square")){

			ComplexCommand command = new ComplexCommand(Factories.Square());
			command.execute(driverManager.getCurrentDriver());

		}
		else if(e.getActionCommand().equals("Triangle")){

			ComplexCommand command = new ComplexCommand(Factories.Triangle());
			command.execute(driverManager.getCurrentDriver());

		}



	}
}
