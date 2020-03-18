package com.mbednarz.phptravel.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author mbednarz
 * @created 03/03/2020 - 23:38
 * @project Selenium3Course
 */

/* -- LESSON 112: pierwszy Page Object i ustawianie nazwy miasta -- */
public class HomePage
{
    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
    private WebElement searchSpan;

    @FindBy(xpath = "//div[@id='select2-drop']//input")
    private WebElement searchCityInput;

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToCityInput(String cityName) throws InterruptedException
    {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        Thread.sleep(5000);
        searchCityInput.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }
}
