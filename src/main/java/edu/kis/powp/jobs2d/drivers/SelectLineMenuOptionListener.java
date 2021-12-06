package edu.kis.powp.jobs2d.drivers;

import edu.kis.legacy.drawer.shape.LineFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectLineMenuOptionListener implements ActionListener {
    private LineManager lineManager;

    public SelectLineMenuOptionListener(LineManager lineManager) {
        this.lineManager = lineManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Line dot": {
                lineManager.setCurrentLine(LineFactory.getDottedLine());
                break;
            }
            case "Line special": {
                lineManager.setCurrentLine(LineFactory.getSpecialLine());
                break;
            }
            default: {
                lineManager.setCurrentLine(LineFactory.getBasicLine());
            }
        }
    }
}
