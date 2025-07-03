package main;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Font;


public class PayrollSystem {
    public static void main(String[] args) {
        try {
            // Install Roboto font
            FlatRobotoFont.install();
            UIManager.put("Component.arc", 15);
            UIManager.put("Button.arc", 10);
            UIManager.put("ProgressBar.arc", 15);
            UIManager.put("TextComponent.arc", 10);
            UIManager.put("ScrollBar.thumbArc", 15);
            UIManager.put("TabbedPane.tabArc", 15);
            
            // Set Roboto as default font for UI
            UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
            
            
            // Use FlatLaf Mac Light theme
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Open Login Frame
        new com.motorph.gui.LoginFrame().setVisible(true);
    }
}