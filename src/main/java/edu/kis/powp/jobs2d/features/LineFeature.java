package edu.kis.powp.jobs2d.features;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.LineManager;
import edu.kis.powp.jobs2d.drivers.SelectDriverMenuOptionListener;
import edu.kis.powp.jobs2d.drivers.SelectLineMenuOptionListener;

public class LineFeature {

	private static LineManager lineManager = new LineManager();
	private static Application app;

	public static LineManager getLineManager() {
		return lineManager;
	}

	/**
	 * Setup jobs2d drivers Plugin and add to application.
	 * 
	 * @param application Application context.
	 */
	public static void setupLinePlugin(Application application) {
		app = application;
		app.addComponentMenu(LineFeature.class, "Lines");
	}

	/**
	 * Add driver to context, create button in driver menu.
	 * 
	 * @param name   Button name.
	 * @param driver Job2dDriver object.
	 */
	public static void addLine(String name) {
		SelectLineMenuOptionListener listener = new SelectLineMenuOptionListener(lineManager);
		app.addComponentMenuElement(LineFeature.class, name, listener);
	}

	/**
	 * Update driver info.
	 */
	public static void updateLineInfo() {
		app.updateInfo(lineManager.getCurrentLine().toString());
	}

}
