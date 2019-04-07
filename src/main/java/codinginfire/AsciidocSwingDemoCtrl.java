package codinginfire;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AsciidocSwingDemoCtrl {
    
    private JFrame parent;
    private StringListener nameListener;
    
    private final static String DEFAULT_NAME = "Mysterious Stranger";

    public void setParent(JFrame parent) {
        this.parent = parent;
    }
    
    public void sayHello() {
        JOptionPane.showMessageDialog(parent, "Hello, " + getName() + "!");
    }
    
    public void showHelp() {
        JOptionPane.showMessageDialog(parent, "I Help Those who Help Themselves");
    }
    
    void setNameListener(StringListener nameListener) {
        this.nameListener = nameListener;
    }
    
    private String getName() {
        String name = nameListener.stringEmitted();
        if (name == null || "".equals(name)) { return DEFAULT_NAME; }
        return name.trim();
    }
}
