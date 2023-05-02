package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class WomenTest extends BaseTest {


    WomenPage womenPage= new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
            womenPage.clickOnJacket();
           womenPage.selectSortByFilter();

        ArrayList <String>actualList = getArrayListOfStringsFromWebElements(womenPage.returnListOfProductNamesElementsLocator());
        ArrayList<String>expectedList= getArrayListOfStringsFromWebElements(womenPage.returnListOfProductNamesElementsLocator());
        Assert.assertEquals(actualList,expectedList,"Error Message");
        Collections.sort(expectedList);
    }
@Test
public void verifyTheSortByPriceFilter(){
   womenPage.clickOnJacket();
   womenPage.selectSortByFilterPrice();
   ArrayList<String>actualList=getArrayListOfStringsFromWebElements(womenPage.returnListOfPriceElementsLocator());
   ArrayList<String>expectedList=getArrayListOfStringsFromWebElements(womenPage.returnListOfPriceElementsLocator());
   Assert.assertEquals(actualList,expectedList,"Error Message");
   Collections.sort(expectedList);
}

}
