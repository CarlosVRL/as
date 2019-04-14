package codinginfire;

import java.awt.*;
import java.io.File;

public class AsciidocSwingDemoCtrl {
    
    private StringFetcher nameFetcher;
    
    private final static String DEFAULT_NAME = "Mysterious Stranger";
    private final static String HELP_URL = "/hello.pdf";

    /**
     * Controller Methods.
     */
    
    /**
     * Say a greeting.
     * 
     * @return the greeting
     */
    public String sayHello() {
        return "Hello, " + getName() + "!";
    }
    
    /**
     * Show a help message.
     * 
     * @return the help message
     */
    public void showHelp() {
        openDocument(HELP_URL);
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
        if (name == null || "".equals(name.trim())) { return DEFAULT_NAME; }
        return name.trim();
    }

    /**
     * Open a document from resources.
     *
     * @param document the document name
     */
    private void openDocument(String document) {
        try {
            Desktop.getDesktop().open(new File(getClass().getResource(document).getFile()));
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("Unable to open document " + e.getMessage());
        }
    }
}
