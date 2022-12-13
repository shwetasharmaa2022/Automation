package api.cucumber.hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {
    @Before
    public void setup(){
        System.out.println("....before hook....");
    }
    @After
    public void teardown(){
        System.out.println("....after hook...");
    }
}
