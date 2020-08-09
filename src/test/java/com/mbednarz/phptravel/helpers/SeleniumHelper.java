package com.mbednarz.phptravel.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

/**
 * @author mbednarz
 * @created 13/04/2020 - 22:02
 * @project Selenium3Course
 */

/* -- LESSON 132: Robienie screenshotów -- */
/* -- LESSON 133: Robienie screenshotów, gdy test failuje + Driver Factory -- */

public class SeleniumHelper
{
    private WebDriver driver;

    public SeleniumHelper(WebDriver driver)
    {
        this.driver = driver;
    }

    public void waitForElementToBeDisplayed(WebElement locator)
    {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        FluentWait<WebDriver> ignoring = wait.withTimeout(Duration.ofSeconds(40)).pollingEvery(Duration.ofMillis(4000)).ignoring(NoSuchElementException.class);
        //wait.until(ExpectedConditions.visibilityOfElementLocated((locator));
    }

    /*
    public void waitForElementToBeDisplayed(WebElement element)
    {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofMillis(2000)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    */

    public void waitForListOfWebElements(List<WebElement> elementList)
    {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(40)).pollingEvery(Duration.ofMillis(4000)).ignoring(NoSuchElementException.class);
        wait.until(driver1 -> elementList.size() > 0);
    }

    public static void takeScreenshot(WebDriver driver) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src/main/resources/" + LocalTime.now().getNano() + ".jpg");
        Files.copy(screenshotFile.toPath(), destinationFile.toPath());
    }

}
