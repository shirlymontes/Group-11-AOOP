/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PayrollSystem {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf()); 
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    
        new com.motorph.gui.LoginFrame().setVisible(true);
    }
}
