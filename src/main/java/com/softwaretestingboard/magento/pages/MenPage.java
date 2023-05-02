package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {


By menMenu =  By.xpath("//a[@id='ui-id-5']//span[contains(text(),'Men')]");

By bottomsMenu = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");

By pantsMenu= By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

By cronusPant= By.xpath("//a[@href='https://magento.softwaretestingboard.com/cronus-yoga-pant.html']//span[@class='product-image-container']");

By cronusPantSize = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");

By cronusPantColor= By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");

By addToCart = By.xpath("//span[contains(text(),'Add to Cart')][1]");

By cronusYogaPantTextVerify = By.xpath("//div[@class='message-success success message']");

By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

By shoppingCartText= By.xpath("//span[@class='base']");

By productNameVerifyTextCronus= By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

By productSize = By.xpath("//dd[contains(text(),'32')]");

By productColor = By.xpath("//dd[contains(text(),'Black')]");

    public void clickOnPants(){
mouseHoverToElement(menMenu);
mouseHoverToElement(bottomsMenu);
clickOnElement(pantsMenu);
    }

    public void clickOnCronusYogaPant(){
mouseHoverToElement(cronusPant);
clickOnElement(cronusPantSize);
    }

    public void clickOnBlackColorCronusPant(){
        mouseHoverToElement(cronusPant);
       clickOnElement(cronusPantColor);
    }

    public void clickOnAddToCart(){
        mouseHoverToElement(cronusPant);
        clickOnElement(addToCart);
    }

public String cronusVerifyText(){
        return getTextFromElement(cronusYogaPantTextVerify);
}

public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
}

public String shoppingCartVerifyText(){
        return getTextFromElement(shoppingCartText);
}

public String cronusNameVerifyText(){
        return  getTextFromElement(productNameVerifyTextCronus);
}

public String  productSizeVerify(){
return getTextFromElement(productSize);
}


public String verifyProductColor(){
       return getTextFromElement(productColor);
}

}
