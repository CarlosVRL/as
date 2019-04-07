package codinginfire;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AsciidocSwingDemoCtrl {
    
    private JFrame parent;

    public void setParent(JFrame parent) {
        this.parent = parent;
    }
    
    public void sayHello() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //JOptionPane.showMessageDialog(this, "Hello, " + getNameFromText() + "!");
    }
    
    public void showHelp() {
        JOptionPane.showMessageDialog(parent, "I Help Those who Help Themselves");
    }
    
//    private String getNameFromText() {
//        String name = this.nameTxt.getText();
//        if (name == null || "".equals(name)) { return "Mysterious Stranger"; }
//        return name;
//    }
}
