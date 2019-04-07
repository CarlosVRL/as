package codinginfire;

import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class AsciidocSwingDemoCtrlTest {
    
    private AsciidocSwingDemoCtrl ctrl;
    
    final private String DEFAULT_NAME = "AAAAAA";
    final private String DEFAULT_NONE = "Stranger";
    final private String DEFAULT_BLANK = "";
    
    @Before
    public void init() {
        ctrl = new AsciidocSwingDemoCtrl();
        mockName();
    }
    
    @Test
    public void can_instantiateController() {
        Assert.assertNotNull(ctrl);
    }
    
    @Test
    public void can_constructGreetingWithName() {
        Assert.assertTrue(
                ctrl.sayHello().contains(DEFAULT_NAME)
        );
    }
    
    @Test
    public void can_constructDefaultGreeting() {
        mockNone();
        Assert.assertTrue(
                ctrl.sayHello().contains(DEFAULT_NONE)
        );
    }
    
    private void mockName() {
        ctrl.setNameFetcher(new StringFetcher() {
            @Override
            public String fetch() {
                return DEFAULT_NAME;
            }
        });
    }
    
    private void mockNone() {
        ctrl.setNameFetcher(new StringFetcher() {
            @Override
            public String fetch() {
                return DEFAULT_BLANK;
            }
        });
    }
}
