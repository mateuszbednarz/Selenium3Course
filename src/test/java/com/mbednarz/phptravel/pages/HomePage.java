package com.mbednarz.phptravel.pages;

import com.mbednarz.phptravel.helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
/* -- LESSON 123: Naprawa Wait() czekającego na WebElement -- */
/* -- LESSONS: 124; 125; 126; 127-- */

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

    @FindBy(xpath = "//div[@class='select2-result-label']")
    private WebElement selectResult;

    private SeleniumHelper helper;

    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.helper = new SeleniumHelper(driver);
        this.driver = driver;
    }

    public HomePage setCityHotel(String cityName)
    {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        /* By locationLabel = By.xpath("//div[@class='select2-result-label']");
        helper.waitForElementToBeDisplayed(locationLabel); */
        // WebElement element = driver.findElement(By.xpath("//div[@class='select2-result-label']"));
        helper.waitForElementToBeDisplayed(selectResult);
        searchCityInput.sendKeys(Keys.ENTER);
        return this;
    }

    public HomePage setDateRange(String checkinDate, String checkoutDate) throws InterruptedException
    {
        checkinInput.sendKeys(checkinDate);
        checkoutInput.sendKeys(checkoutDate);
        checkoutInput.click();
        return this;
    }

    public HomePage openTravellersModal()
    {
        travellersInput.click();
        helper.waitForElementToBeDisplayed(adultPlusBtn);
        return this;
    }

    public HomePage addAdultPassenger()
    {
        adultPlusBtn.click();
        return this;
    }

    public HomePage addChildPassenger()
    {
        childPlusBtn.click();
        return this;
    }

    public ResultPage performSearch()
    {
        searchButton.click();
        return new ResultPage(driver);
    }
}
