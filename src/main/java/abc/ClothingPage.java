package abc;

import org.openqa.selenium.By;

public class ClothingPage extends Utils {


        public void verifyUserOnClothingPage() {

                assertURL( "https://demo.nopcommerce.com/clothing" );
        }
        public  void selectValueLawToHigh() {
                selectValueFromDropDown( By.id( "products-orderby" ),"https://demo.nopcommerce.com/clothing?orderby=10");

        }


public  void selectValueHighToLaw() {
        selectValueFromDropDown( By.id( "products-orderby" ),"https://demo.nopcommerce.com/clothing?orderby=11");

}



}