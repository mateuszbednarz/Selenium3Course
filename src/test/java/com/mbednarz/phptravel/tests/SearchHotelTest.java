package com.mbednarz.phptravel.tests;

import com.mbednarz.phptravel.helpers.TestListener;
import com.mbednarz.phptravel.helpers.SeleniumHelper;
import com.mbednarz.phptravel.pages.HomePage;
import com.mbednarz.phptravel.pages.ResultPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.mbednarz.phptravel.helpers.ExcelHelper.readExcelFile;

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
/* -- LESSON 142: @DataProvider z pliku Excel (część 2) -- */
/* -- LESSON 143: Resetowanie driver'a po każdym teście -- */

@Listeners(TestListener.class)
public class SearchHotelTest extends BaseTestSettings
{
    @Test(dataProvider = "getData")
    public void searchHotelTest(String city, String checkInDate, String checkOutDate,
                                String fHotelName, String fPrice,
                                String sHotelName, String sPrice,
                                String tHotelName, String tPrice) throws IOException
    {
        //driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");
        //driver.get("http://www.phptravels.net/home/");
        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = homePage
           .setCityHotel(city)
           .setDateRange(checkInDate, checkOutDate)
           .openTravellersModal()
           .addAdultPassenger()
           .addChildPassenger()
           .addChildPassenger()
           .performSearch();

        List<String> hotelNamesList = resultPage.getHotelNames();

        SeleniumHelper.takeScreenshot(driver);

        Assert.assertEquals(fHotelName, hotelNamesList.get(0));
        Assert.assertEquals(sHotelName, hotelNamesList.get(1));
        Assert.assertEquals(tHotelName, hotelNamesList.get(2));

        List<String> hotelPricesList = resultPage.getHotelPrices();
        Assert.assertEquals(hotelPricesList.get(0),fPrice);
        Assert.assertEquals(hotelPricesList.get(1),sPrice);
        Assert.assertEquals(hotelPricesList.get(2),tPrice);
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = null;
        try {
            data = readExcelFile(new File("src//main//resources//files//Dane.xlsx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
