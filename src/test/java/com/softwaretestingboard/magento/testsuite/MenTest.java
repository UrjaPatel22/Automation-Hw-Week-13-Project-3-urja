package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

MenPage menPage= new MenPage();
@Test
    public void userShouldAddProductSuccessFullyTShoppingCart(){
menPage.clickOnPants();
menPage.clickOnCronusYogaPant();
menPage.clickOnBlackColorCronusPant();
menPage.clickOnAddToCart();
String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
String actualMessage = menPage.cronusVerifyText();
Assert.assertEquals(actualMessage,expectedMessage,"Error Message");
menPage.clickOnShoppingCart();
    String expectedShoppingCartMsg = "Shopping Cart";
    String actualShoppingCartMsg = menPage.shoppingCartVerifyText();
    Assert.assertEquals(actualShoppingCartMsg,expectedShoppingCartMsg,"Error Message");
    String expectedProductName = "Cronus Yoga Pant";
    String ActualName = menPage.cronusNameVerifyText();
    Assert.assertEquals(ActualName,expectedProductName,"Error Message");
    String expectedSize = "32";
    String actualSize = menPage.productSizeVerify();
    Assert.assertEquals(actualSize,expectedSize,"Error Message");
    String expectedColor = "Black";
    String actualColor = menPage.verifyProductColor();
    Assert.assertEquals(actualColor,expectedColor,"Error Message");

    }
}
