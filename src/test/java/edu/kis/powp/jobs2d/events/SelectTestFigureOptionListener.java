package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
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
		else if(e.getActionCommand().equals("Figure Joe 3")){
			ArrayList<DriverCommand> commands = new ArrayList<>();
			commands.add(new SetPositionCommand(0,0));
			commands.add(new OperateToCommand(0,50));
			commands.add(new OperateToCommand(50,50));
			commands.add(new OperateToCommand(50,0));
			commands.add(new OperateToCommand(0,0));

			ComplexCommand command = new ComplexCommand(commands);
			command.execute(driverManager.getCurrentDriver());

		}



	}
}
