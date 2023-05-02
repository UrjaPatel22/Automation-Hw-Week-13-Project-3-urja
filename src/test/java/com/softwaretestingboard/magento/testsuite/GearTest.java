package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

GearPage gearPage = new GearPage();


@Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
gearPage.clickOnOvernightDuffle();
    String expectedMessage = "Overnight Duffle";
    String actualMessage = gearPage.verifyOverNightDuffleText();
    Assert.assertEquals(actualMessage,expectedMessage,"Error Message");
   gearPage.changeQty();
   gearPage.clickOnAddToCart();
    String expectedText = "You added Overnight Duffle to your shopping cart.";
    String actualText = gearPage.verifyOverNightDuffleTextShoppingCart();
    Assert.assertEquals(actualText,expectedText,"Error Message");
gearPage.clickOnShoppingCart();
    String expectedName = "Overnight Duffle";
    String actualName = gearPage.verifyProductName();
    Assert.assertEquals(actualName,expectedName,"Error Message");
    //WebElement element12 = driver.findElement(By.cssSelector(".input-text.qty"));
    String actualQty=  gearPage.getTextFromTheEnteredQuantity();
    String expectedQty= "3";
    Assert.assertEquals(actualQty,expectedQty,"Error Msg");
    String expectedPrice = "$135.00";
    String actualPrice = gearPage.verifyProductPrice();
    Assert.assertEquals(actualPrice,expectedPrice,"Error Message");
gearPage.chgQtyProduct();
gearPage.clickOnUpdateShoppingCart();
    String expectedUpdatedPrice = "$225.00";
    String actualUpdatedPrice = gearPage.verifyUpdatedProductPrice();
    Assert.assertEquals(actualUpdatedPrice,expectedUpdatedPrice,"Error Message");
}


}
