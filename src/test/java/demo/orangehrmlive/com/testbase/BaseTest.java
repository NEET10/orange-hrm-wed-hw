package demo.orangehrmlive.com.testbase;

import demo.orangehrmlive.com.utilities.Utility;
import demo.orangehrmlive.com.propertyreader.PropertyReader;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeTest

    public void setUp(){
        selectBrowser(browser);

    }
    @AfterTest
    public void tearDown(){
        closeBrowser();

    }
}
