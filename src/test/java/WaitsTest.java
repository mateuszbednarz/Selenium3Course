import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author mbednarz
 * @created 21/02/2020 - 15:34
 * @project Selenium3Course
 */

/* -- LESSON 99: Oczekiwanie na element - Thread().sleep -- */
/* -- LESSON 100: Oczekiwanie na element - Implicit Wait -- */
/* -- LESSON 101: Oczekiwanie na element - WebDriver Wait -- */
public class WaitsTest extends BaseSeleniumTest
{
    @Test
    // pierwotnie użyty został Thread.sleep()
    public void waitTest()
    {
        driver.get("file:///E:/mav-temp-iji/pliki-dolaczone-do-kursu/Waits.html");
        driver.findElement(By.tagName("button")).click();

        fluentWaitTest(By.tagName("p"));
        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println("Paragraph contains text: " + paragraph.getText());

        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
    }

    /*
    @Test
    // użyty został Implicit Wait
    public void waitTestWithImplicitWait()
    {
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.get("file:///E:/mav-temp-iji/pliki-dolaczone-do-kursu/Waits2.html");
        driver.findElement(By.tagName("button")).click();

        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println("Paragraph contains text: " + paragraph.getText());

        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
    }
    */

    /*
    @Test
    // użyty został WebDriver Wait (Explicit Wait)
    private void waitForWebElement(By locator)
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, 10L);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    */


    // użyty został Fluent Wait
    public void fluentWaitTest(By locator)
    {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.pollingEvery(Duration.ofMillis(500));
        wait.withTimeout(Duration.ofSeconds(10L));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
