package com.mbednarz.phptravel.pages;

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


    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void setCityHotel(String cityName) throws InterruptedException
    {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        Thread.sleep(5000);
        searchCityInput.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

    public void setDateRange(String checkinDate, String checkoutDate) throws InterruptedException
    {
        checkinInput.sendKeys(checkinDate);
        Thread.sleep(3000);
        checkoutInput.sendKeys(checkoutDate);
        Thread.sleep(3000);
        checkoutInput.click();
        Thread.sleep(3000);
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
}
