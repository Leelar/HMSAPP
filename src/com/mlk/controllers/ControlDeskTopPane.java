
package com.mlk.controllers;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class ControlDeskTopPane {
    public void controljInternalFrame(JDesktopPane dtp, JInternalFrame frm, String name) {
        JInternalFrame[] frames = dtp.getAllFrames();
        String title1 = "";
        if (frames.length == 0) {
            dtp.add(frm);
            frm.setVisible(true);
        } else {
            for (JInternalFrame frame : frames) {
                String title = frame.getTitle();
                if (name.equals(title)) {
                    return;
                } else {
                    for (JInternalFrame frame1 : frames) {
                        title1 = frame1.getTitle();
                    }
                    if (name.equals(title1)) {
                        return;
                    } else {
                        dtp.add(frm);
                        frm.setVisible(true);
                    }
                }
            }
            
        }
    }
}
