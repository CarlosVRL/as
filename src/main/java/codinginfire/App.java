package codinginfire;

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
                new AsciidocSwingDemo(asciidocSwingDemoCtrl).setVisible(true);
            }
        });
    }
}
