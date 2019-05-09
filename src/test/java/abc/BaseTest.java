package abc;

import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
BrowserSelector browserSelector = new BrowserSelector();
@Before
    public  void  openBrowser() {
    //driver.manage().timeouts().implicitlyWait( 29, TimeUnit.SECONDS );
    //driver.manage().window().fullscreen();

    browserSelector.setUpBrowser();
    driver.get( "http://demo.nopcommerce.com/" );
}
@After
public  void closeBrowser(){
    driver.quit();
}

}
