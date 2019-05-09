package CaptureScreenshoot;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerceScreenshoot {

  @Test

    public  void CaptureScreenshoot (){

      System.setProperty( "webdriver.chrome.driver","src\\test\\java\\abc\\WebDriver\\chromedriver.exe" );
      WebDriver driver = new ChromeDriver(  );

//implicit wait apply
      driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS );
      //to get url
      driver.get( "https://demo.nopcommerce.com/" );

    }
}
