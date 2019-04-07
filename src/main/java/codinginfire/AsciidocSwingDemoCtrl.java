package codinginfire;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AsciidocSwingDemoCtrl {
    
    private StringFetcher nameFetcher;
    
    private final static String DEFAULT_NAME = "Mysterious Stranger";

    /**
     * Controller Methods.
     */
    
    /**
     * Show the greeting.
     */
    public String sayHello() {
        return "Hello, " + getName() + "!";
    }
    
    /**
     * Show the help message.
     */
    public String showHelp() {
        return "I Help Those who Help Themselves!";
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
