/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author Akbar Chaudhary
 */
class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(48, 144, 216));
        setBackground(new Color(30,30,30));
    }
    
}
