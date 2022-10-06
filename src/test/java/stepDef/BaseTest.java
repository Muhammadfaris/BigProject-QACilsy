package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverUtils;

public class BaseTest {


    @Before
    public static void setUp(){
        System.out.println("initial");
        DriverUtils.getDriver();
    }

    @After
    public static void  tearDownBrowser(){
        DriverUtils.tearDown();
    }
}
