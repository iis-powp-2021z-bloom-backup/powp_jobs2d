package edu.kis.powp.jobs2d.features;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.LineManager;
import edu.kis.powp.jobs2d.drivers.SelectLineMenuOptionListener;

public class LineFeature {

    private static LineManager lineManager = new LineManager();
    private static Application app;

    public static LineManager getLineManager() {
        return lineManager;
    }

    public static void setupLinePlugin(Application application) {
        app = application;
        app.addComponentMenu(LineFeature.class, "Lines");
    }

    public static void addLine(String name) {
        SelectLineMenuOptionListener listener = new SelectLineMenuOptionListener(lineManager);
        app.addComponentMenuElement(LineFeature.class, name, listener);
    }


    public static void updateLineInfo() {
        app.updateInfo(lineManager.getCurrentLine().toString());
    }

}
