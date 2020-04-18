package com.mbednarz.phptravel.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

/**
 * @author mbednarz
 * @created 13/04/2020 - 22:02
 * @project Selenium3Course
 */
public class SeleniumHelper
{
    private WebDriver driver;

    public SeleniumHelper(WebDriver driver)
    {
        this.driver = driver;
    }

    public void waitForElementToBeDisplayed(By locator)
    {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofMillis(2000)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
