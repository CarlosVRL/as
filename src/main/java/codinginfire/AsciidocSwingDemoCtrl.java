package codinginfire;

public class AsciidocSwingDemoCtrl {
    
    private StringFetcher nameFetcher;
    
    private final static String DEFAULT_NAME = "Mysterious Stranger";

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
     * Say a help message.
     * 
     * @return the help message
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
        if (name == null || "".equals(name.trim())) { return DEFAULT_NAME; }
        return name.trim();
    }
}
