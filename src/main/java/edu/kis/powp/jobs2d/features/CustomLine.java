package edu.kis.powp.jobs2d.features;

import edu.kis.legacy.drawer.shape.line.AbstractLine;
import java.awt.*;


public class CustomLine extends AbstractLine {
    public CustomLine(Color aColor, float aThickness, boolean aDotted) {
        this.color = aColor;
        this.thickness = aThickness;
        this.dotted = aDotted;
    }
}
