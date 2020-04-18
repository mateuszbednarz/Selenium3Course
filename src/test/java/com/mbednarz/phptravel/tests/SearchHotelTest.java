package com.mbednarz.phptravel.tests;

import com.mbednarz.phptravel.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author mbednarz
 * @created 04/03/2020 - 00:03
 * @project Selenium3Course
 */

/* -- LESSON 112: pierwszy Page Object i ustawianie nazwy miasta -- */
/* -- LESSON 113: ustawienie daty przyjazdu i wyjazdu -- */
/* -- LESSON 114: ustawienie ilości osób -- */
/* -- LESSON 115: Wyszukiwanie wyników -- */
/* -- LESSON 116: Pobieramy nazwy hoteli -- */
/* -- LESSON 117: Pobieramy ceny hoteli -- */
/* -- LESSON 118: Sprawdzanie poprawności nazw hoteli -- */
/* -- LESSON 119: Sprawdzanie poprawności cen hoteli -- */
/* -- LESSON 120: Dodanie metod oczekujących na element -- */
/* -- LESSON 121: Zamiana Thread.sleep() na Wait -- */
/* -- LESSON 122: Dodanie Wait() czekającego na WebElement -- */

public class SearchHotelTest extends BaseTestSettings
{
    @Test
    public void searchHotelTest() throws InterruptedException
    {
        //driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");
        HomePage hp = new HomePage(driver);
        hp.setCityHotel("Dubai");
        hp.setDateRange("09/11/2018", "09/13/2018");
        hp.openTravellersModal();
        Thread.sleep(2000);
        hp.addAdultPassenger();
        Thread.sleep(2000);
        hp.addChildPassenger();
        Thread.sleep(2000);
        hp.addChildPassenger();
        Thread.sleep(2000);
        hp.performSearch();
        Thread.sleep(2000);

        List<String> hotelNamesList = hp.getHotelNames();
        Assert.assertEquals("Jumeirah Beach Hotel", hotelNamesList.get(0));
        Assert.assertEquals("Oasis Beach Tower", hotelNamesList.get(1));
        Assert.assertEquals("Rose Rayhaan Rotana", hotelNamesList.get(2));
        Assert.assertEquals("Hyatt Regency Perth", hotelNamesList.get(3));
        Thread.sleep(2000);

        List<String> hotelPricesList = hp.getHotelPrices();
        Assert.assertEquals("$22", hotelPricesList.get(0));
        Assert.assertEquals("$50", hotelPricesList.get(1));
        Assert.assertEquals("$80", hotelPricesList.get(2));
        Assert.assertEquals("$150", hotelPricesList.get(3));
        Thread.sleep(2000);
    }
}
