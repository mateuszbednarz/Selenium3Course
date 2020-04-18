package com.mbednarz.phptravel.pages;

import com.mbednarz.phptravel.helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mbednarz
 * @created 03/03/2020 - 23:38
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

public class HomePage
{
    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
    private WebElement searchSpan;

    @FindBy(xpath = "//div[@id='select2-drop']//input")
    private WebElement searchCityInput;

    @FindBy(name = "checkin")
    private WebElement checkinInput;

    @FindBy(name = "checkout")
    private WebElement checkoutInput;

    @FindBy(id = "travellersInput")
    private WebElement travellersInput;

    @FindBy(id = "childPlusBtn")
    private WebElement childPlusBtn;

    @FindBy(id = "adultPlusBtn")
    private WebElement adultPlusBtn;

    @FindBy(xpath = "//button[text()=' Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//table[@class='bgwhite table table-striped']")
    private WebElement resultsTable;

    private SeleniumHelper helper;

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.helper = new SeleniumHelper(driver);
    }

    public void setCityHotel(String cityName)
    {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        By locationLabel = By.xpath("//div[@class='select2-result-label']");
        helper.waitForElementToBeDisplayed(locationLabel);
        searchCityInput.sendKeys(Keys.ENTER);
    }

    public void setDateRange(String checkinDate, String checkoutDate) throws InterruptedException
    {
        checkinInput.sendKeys(checkinDate);
        checkoutInput.sendKeys(checkoutDate);
        checkoutInput.click();
    }

    public void openTravellersModal()
    {
        travellersInput.click();
    }

    public void addAdultPassenger()
    {
        adultPlusBtn.click();
    }

    public void addChildPassenger()
    {
        childPlusBtn.click();
    }

    public void performSearch()
    {
        searchButton.click();
    }

    public List<String> getHotelNames()
    {
        List<String> hotelNamesList = new ArrayList<>();
        List<WebElement> hotelNamesWebElements = resultsTable.findElements(By.xpath("//h4//b"));

        for(WebElement hotelNameElement : hotelNamesWebElements)
        {
            System.out.println(hotelNameElement.getText());
            hotelNamesList.add(hotelNameElement.getText());
        }

        return hotelNamesList;
    }

    public List<String> getHotelPrices()
    {
        List<WebElement> hotelPrices = resultsTable.findElements(By.xpath("//div[contains(@class, 'price_tab')]//b"));
        List<String> prices = hotelPrices.stream().map(element -> element.getText()).collect(Collectors.toList());

        return prices;
    }
}
