package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.figures.FiguresFactory;
import edu.kis.powp.jobs2d.figures.FiguresType;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import static edu.kis.powp.jobs2d.collection.TestNames.*;

public class TestJobs2dPatterns {

	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {
		SelectTestFigureOptionListener selectTestFigureOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager());

		application.addTest(FIGURE_JOE_1.getLabel(), selectTestFigureOptionListener);
		application.addTest(FIGURE_JOE_2.getLabel(), selectTestFigureOptionListener);
		application.addTest(FIGURE_JANE_1.getLabel(), selectTestFigureOptionListener);
		application.addTest(TRIANGLE.getLabel(), selectTestFigureOptionListener);
		application.addTest(SQUARE.getLabel(), selectTestFigureOptionListener);
		application.addTest(CUSTOM_SCRIPT.getLabel(), selectTestFigureOptionListener);
	}

	/**
	 * Setup driver manager, and set default driver for application.
	 * 
	 * @param application Application context.
	 */
	private static void setupDrivers(Application application) {
		Job2dDriver loggerDriver = new LoggerDriver();
		DriverFeature.addDriver("Logger Driver", loggerDriver);
		DriverFeature.getDriverManager().setCurrentDriver(loggerDriver);

		Job2dDriver defaultLineDriver = new DrawerAdapter();
		DriverFeature.addDriver("Buggy Simulator", defaultLineDriver);

		Job2dDriver dottedLineDriver = new DrawerAdapter(LineFactory.getDottedLine());
		DriverFeature.addDriver("Dotted line", dottedLineDriver);

		Job2dDriver specialLineDriver = new DrawerAdapter(LineFactory.getSpecialLine());
		DriverFeature.addDriver("Special line", specialLineDriver);

		DriverFeature.updateDriverInfo();
	}

	/**
	 * Auxiliary routines to enable using Buggy Simulator.
	 * 
	 * @param application Application context.
	 */
	private static void setupDefaultDrawerVisibilityManagement(Application application) {
		DefaultDrawerFrame defaultDrawerWindow = DefaultDrawerFrame.getDefaultDrawerFrame();
		application.addComponentMenuElementWithCheckBox(DrawPanelController.class, "Default Drawer Visibility",
				new SelectChangeVisibleOptionListener(defaultDrawerWindow), true);
		defaultDrawerWindow.setVisible(false);
	}

	/**
	 * Setup menu for adjusting logging settings.
	 * 
	 * @param application Application context.
	 */
	private static void setupLogger(Application application) {
		application.addComponentMenu(Logger.class, "Logger", 0);
		application.addComponentMenuElement(Logger.class, "Clear log",
				(ActionEvent e) -> application.flushLoggerOutput());
		application.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> logger.setLevel(Level.FINE));
		application.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> logger.setLevel(Level.INFO));
		application.addComponentMenuElement(Logger.class, "Warning level",
				(ActionEvent e) -> logger.setLevel(Level.WARNING));
		application.addComponentMenuElement(Logger.class, "Severe level",
				(ActionEvent e) -> logger.setLevel(Level.SEVERE));
		application.addComponentMenuElement(Logger.class, "OFF logging", (ActionEvent e) -> logger.setLevel(Level.OFF));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Application app = new Application("2d jobs Visio");
			DrawerFeature.setupDrawerPlugin(app);
			setupDefaultDrawerVisibilityManagement(app);

			DriverFeature.setupDriverPlugin(app);
			setupDrivers(app);
			setupPresetTests(app);
			setupLogger(app);

			app.setVisibility(true);
		});
	}

}
