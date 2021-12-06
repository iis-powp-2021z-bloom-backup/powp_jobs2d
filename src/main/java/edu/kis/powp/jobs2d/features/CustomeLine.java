package edu.kis.powp.jobs2d.features;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class CustomeLine extends AbstractLine {
    public CustomeLine(Color color,boolean dotted ,float thickness)
    {
        super();
        this.color = color;
        this.dotted = dotted;
        this.thickness = thickness;
    }
}
