package codinginfire;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AsciidocSwingDemoCtrl {
    
    private JFrame parent;
    private StringFetcher nameFetcher;
    
    private final static String DEFAULT_NAME = "Mysterious Stranger";

    /**
     * Controller Methods.
     */
    /**
     * Set the parent frame element.
     * 
     * @param parent 
     */
    public void setParent(JFrame parent) {
        this.parent = parent;
    }
    
    /**
     * Show the greeting.
     */
    public void sayHello() {
        JOptionPane.showMessageDialog(parent, "Hello, " + getName() + "!");
    }
    
    /**
     * Show the help message.
     */
    public void showHelp() {
        JOptionPane.showMessageDialog(parent, "I Help Those who Help Themselves");
    }
    
    /**
     * Set the name fetcher
     * 
     * @param nameFetcher the element to retrieve the name from
     */
    public void setNameFetcher(StringFetcher nameFetcher) {
        this.nameFetcher = nameFetcher;
    }
    
    /**
     * Get name from the nameFetcher
     * 
     * @return the name
     */
    private String getName() {
        String name = nameFetcher.fetch();
        if (name == null || "".equals(name)) { return DEFAULT_NAME; }
        return name.trim();
    }
}
