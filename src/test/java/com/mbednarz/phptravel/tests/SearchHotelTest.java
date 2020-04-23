package com.mbednarz.phptravel.tests;

import com.mbednarz.phptravel.pages.HomePage;
import com.mbednarz.phptravel.pages.ResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
/* -- LESSON 123: Naprawa Wait() czekającego na WebElement -- */
/* -- LESSONS: 124; 125; 126; 127 -- */
/* -- LESSON 130: TestNG - Data Provider -- */

public class SearchHotelTest extends BaseTestSettings
{
    @Test
    public void searchHotelTest() throws InterruptedException
    {
        //driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");
        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = homePage
           .setCityHotel("Dubai")
           .setDateRange("09/11/2018", "09/13/2018")
           .openTravellersModal()
           .addAdultPassenger()
           .addChildPassenger()
           .addChildPassenger()
           .performSearch();

        List<String> hotelNamesList = resultPage.getHotelNames();
        Assert.assertEquals("Jumeirah Beach Hotel", hotelNamesList.get(0));
        Assert.assertEquals("Oasis Beach Tower", hotelNamesList.get(1));
        Assert.assertEquals("Rose Rayhaan Rotana", hotelNamesList.get(2));
        Assert.assertEquals("Hyatt Regency Perth", hotelNamesList.get(3));

        List<String> hotelPricesList = resultPage.getHotelPrices();
        Assert.assertEquals("$22", hotelPricesList.get(0));
        Assert.assertEquals("$50", hotelPricesList.get(1));
        Assert.assertEquals("$80", hotelPricesList.get(2));
        Assert.assertEquals("$150", hotelPricesList.get(3));
    }
}
