package test.java.test;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class myTestCase {

    @Test
    public  void baseTest() throws MalformedURLException {
        System.out.print("hello");
        //WebDriverSingleton.getDriver();
    }
}