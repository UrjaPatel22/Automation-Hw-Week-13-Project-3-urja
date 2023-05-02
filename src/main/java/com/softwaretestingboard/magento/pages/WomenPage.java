package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenPage extends Utility {



    By womenMenu = By.xpath("//a[@class='level-top ui-corner-all'][@id='ui-id-4']");

    By topMenu = By.xpath("//a[@id='ui-id-9']");


    By clickJacket =By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By  productNameElements= By.xpath("//div[@class='product details product-item-details']//strong[@class='product name product-item-name']");

    By priceElements= By.xpath("//div[@class='product details product-item-details']//div[@class='price-box price-final_price']");

    public void clickOnJacket(){
        mouseHoverToElement(womenMenu);
        mouseHoverToElement(topMenu);
        mouseHoverToElementAndClick(clickJacket);


    }



    public void selectSortByFilter() {
        selectByVisibleTextFromDropDown(By.className("sorter-options"), "Product Name");
    }


        public List<WebElement> returnListOfProductNamesElementsLocator() {
            List<WebElement> listOfElements = driver.findElements(productNameElements);
            return listOfElements;
        }






public void selectSortByFilterPrice(){
    selectByVisibleTextFromDropDown(By.className("sorter-options"), "Price");
}

    public List<WebElement> returnListOfPriceElementsLocator(){
        List<WebElement> listOfElements = driver.findElements(priceElements);
        return listOfElements;
    }

}




