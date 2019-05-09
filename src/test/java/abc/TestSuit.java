package abc;

import org.junit.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
ClothingPage clothingPage = new ClothingPage();
    @Test

    public void userSuccessfullyNavigateClothsCatagory() {
        homePage.clickOnClothingLinks();
        clothingPage.verifyUserOnClothingPage();

    }
}



