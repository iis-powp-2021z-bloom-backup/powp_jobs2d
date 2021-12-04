package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.Color;
public class LineParameters extends AbstractLine{
    public LineParameters(Color color, float size, boolean isDotted){
        super();
        this.color = color;
        this.thickness = size;
        this.dotted = isDotted;

    }

}
