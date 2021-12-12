package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverLab1;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private DriverLab1 taxiDriverRobertDeNiro = new DriverLab1(0, 0);

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		DrawerFeature.getDrawerController().clearPanel();
		switch(e.getActionCommand()){
			case "Figure Joe 1":
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;

			case "Figure Joe 2":
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;

			case "Figure Jane":
				FiguresJane.figureScript(taxiDriverRobertDeNiro);
				break;

		}
	}
}
