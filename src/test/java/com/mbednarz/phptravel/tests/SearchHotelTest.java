package com.mbednarz.phptravel.tests;

import com.mbednarz.phptravel.pages.HomePage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author mbednarz
 * @created 04/03/2020 - 00:03
 * @project Selenium3Course
 */

/* -- LESSON 112: pierwszy Page Object i ustawianie nazwy miasta -- */
public class SearchHotelTest extends BaseTestSettings
{
    @Test
    public void searchHotelTest() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");
        HomePage hp = new HomePage(driver);
        hp.sendKeysToCityInput("Dubai");
    }
}
