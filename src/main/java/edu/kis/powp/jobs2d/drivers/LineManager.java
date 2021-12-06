package edu.kis.powp.jobs2d.drivers;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

public class LineManager {

    private ILine currentLine = LineFactory.getBasicLine();

    public synchronized void setCurrentLine(ILine line) {
        currentLine = line;
    }

    public synchronized ILine getCurrentLine() {
        return currentLine;
    }
}
