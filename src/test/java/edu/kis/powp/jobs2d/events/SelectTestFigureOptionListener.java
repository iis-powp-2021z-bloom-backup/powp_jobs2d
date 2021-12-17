package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.TestName;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;
import edu.kis.powp.jobs2d.factory.SquareFactory;
import edu.kis.powp.jobs2d.factory.TriangleFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private final TestName name;
	public SelectTestFigureOptionListener(DriverManager driverManager,TestName name) {
		this.driverManager = driverManager;
		this.name = name;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Job2dDriver currentDriver = driverManager.getCurrentDriver();
		switch (name){
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(currentDriver);
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(currentDriver);
				break;
			case COMPLEX_COMMAND:
				ComplexCommand commands = new ComplexCommand();
				commands.addCommand(new SetPositionCommand(currentDriver).setX(-100).setY(0));
				commands.addCommand(new OperateToCommand(currentDriver).setX(0).setY(-100));
				commands.addCommand(new OperateToCommand(currentDriver).setX(100).setY(0));
				commands.addCommand(new OperateToCommand(currentDriver).setX(-100).setY(0));
				commands.execute();
				System.out.println("Drawer should display triangle");
				break;
			case SQUARE_FACTORY:
				SquareFactory.square(currentDriver).execute();
				break;
			case TRIANGLE_FACTORY:
				TriangleFactory.triangle(currentDriver).execute();
				break;
		}


	}
}
