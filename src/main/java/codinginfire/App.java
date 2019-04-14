package codinginfire;

import javax.swing.*;
import java.awt.*;

/**
 * Main Application.
 */
public class App {
    /**
     * The main application runner.
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        final AsciidocSwingDemoCtrl asciidocSwingDemoCtrl = new AsciidocSwingDemoCtrl();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                JFrame frame = new AsciidocSwingDemo(asciidocSwingDemoCtrl);
                int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
                int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
                frame.setLocation(x, y);
                frame.setVisible(true);
            }
        });
    }
}
