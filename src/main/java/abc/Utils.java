package abc;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class Utils extends BasePage {

        //Clicking element
        public void clickElement(By by) {

            driver.findElement( by ).click();

        }

        //Clear Text form inout box/area
        public static void clearField(By by) {
            driver.findElement( by ).clear();
        }

        //Enter text in input field
        public static void enterText(By by, String text) {
            driver.findElement( by ).sendKeys( text );
        }

        //Clear and enter text in input field
        public void clearAndEnter(By by, String text) {
            driver.findElement( by ).clear();
            driver.findElement( by ).sendKeys( text );

        }
        //Checking WebElemnt present in DOM

        public boolean isElementPresent(By by) {

            try {
                driver.findElement( by ).isEnabled();
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        //Checking WebElemnt displayed or not
        public boolean isElementDisplayed(By by) {
            try {
                driver.findElement( by ).isDisplayed();
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }
        //Wait for fixed time given in seconds

        public static void waitForWebElementToBeClickable(By by, int seconds) {
            WebDriverWait wait = new WebDriverWait( driver, seconds );
            wait.until( ExpectedConditions.elementToBeClickable( by ) );

        }

//Try to click element three times if not available in first go

        public boolean retryForElement(By by) {
            boolean result = false;
            int attempt = 0;
            while (attempt < 3) {
                try {
                    Thread.sleep( 10 );
                    driver.findElement( by ).click();
                    result = true;
                    break;
                } catch (Exception e) {
                }
                attempt++;
            }
            return result;
        }


        //Wait for locator to be clickable for given time in seconds

        public static void waitForLocatorToBeClickable(By by,int second){
            WebDriverWait wait = new WebDriverWait( driver,second );
            wait.until(ExpectedConditions.elementToBeClickable( by ));

        }


//Wait for element for given time in second

        public static void explicitWaitForElement(By by ,int seconds )
        {
            WebDriverWait wait = new WebDriverWait( driver,seconds );
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy( by ));

        }

        //get selected value from dropdown

        public  void selectValueFromDropDown(By by, String data){
            Select currency = new Select( BasePage.driver.findElement( by ) );
            currency.selectByValue( data );
        }


//assert  urll
    public static void assertURL( ){
            String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "expected" );

    }



public static void assertTextMessege( String expected, By by ){

}
    }

//Scroll to view element

