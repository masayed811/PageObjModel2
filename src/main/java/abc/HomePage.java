package abc;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    //private By _currencyId = By.id( "customerCurrency" );
    //private By _clothingLink = By.linkText( "Clothing" );

        public  void selectCurrencyDoller() {

            selectValueFromDropDown( By.id( "customerCurrency" ),"https://demo.nopcommerce.com/");
        }

    public  void selectCurrencyEuro() {

        selectValueFromDropDown( By.id( "customerCurrency" ),"https://demo.nopcommerce.com/");
    }

            public void clickOnClothingLinks(){
             clickElement( By.linkText( "Clothing" ));
            }

    }


