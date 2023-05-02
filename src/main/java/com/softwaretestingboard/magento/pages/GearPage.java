package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {

By gearMenu = By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");

By bagsMenu = By.xpath("//span[normalize-space()='Bags']");

By productOvernightDuffle = By.xpath("//img[@alt='Overnight Duffle']");

By overnightDuffleText= By.xpath("//span[contains(text(),'Overnight Duffle')]");

By changeQtyProduct = By.xpath("//input[@id='qty']");


By addToCart = By.xpath("//span[normalize-space()='Add to Cart']");


By duffleShoppingCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

By productName= By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
By  actualQtyText = By.cssSelector(".input-text.qty");


    By productPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");



    By chgQtyProduct = By.cssSelector(".input-text.qty");


    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    By updatedProductPrice= By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");
    public void clickOnOvernightDuffle(){
mouseHoverToElement(gearMenu);
clickOnElement(bagsMenu);
clickOnElement(productOvernightDuffle);
    }

    public String verifyOverNightDuffleText(){
        return getTextFromElement(overnightDuffleText);
    }

    public void changeQty(){
        clearValueFromTextBox(changeQtyProduct);
        sendTextToElement(changeQtyProduct, "3");

    }


    public void clickOnAddToCart(){
clickOnElement(addToCart);
    }

    public String verifyOverNightDuffleTextShoppingCart(){
        return getTextFromElement(duffleShoppingCartText);
    }


    public void clickOnShoppingCart(){
clickOnElement(shoppingCart);
    }

    public String  verifyProductName(){
return getTextFromElement(productName);
    }


    public String getTextFromTheEnteredQuantity(){
        return driver.findElement(actualQtyText).getAttribute("value");
    }


    public String verifyProductPrice(){
        return getTextFromElement(productPrice);
    }

    public void chgQtyProduct(){
        clearValueFromTextBox(chgQtyProduct);
        sendTextToElement(chgQtyProduct, "5");

    }

    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }

    public String verifyUpdatedProductPrice(){
        return getTextFromElement(updatedProductPrice);
    }

}
