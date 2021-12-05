package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * driver adapter to drawer with multiple line types.
 */
public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
	private int mStartX = 0;
	private int mStartY = 0;
	private final DrawPanelController mDrawPanelController;
	private final ILine mLine;

	public LineDrawerAdapter(DrawPanelController controller, ILine lineType) {
		super();
		mDrawPanelController = controller;
		mLine = lineType;
	}

	@Override
	public void setPosition(int x, int y) {
		this.mStartX = x;
		this.mStartY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		mLine.setStartCoordinates(this.mStartX, this.mStartY);
		mLine.setEndCoordinates(x, y);
		setPosition(x, y);
		mDrawPanelController.drawLine(mLine);
	}

	@Override
	public String toString() {
		return "LineDrawer";
	}
}
