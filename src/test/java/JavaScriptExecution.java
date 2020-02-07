import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * @author mbednarz-job
 * @created 07/02/2020 - 13:10
 * @last_modified 07/02/2020 - 13:10 [mbednarz-job]
 * @project kurs-selenium
 */

public class JavaScriptExecution extends BaseSeleniumTest
{
    /* -- LESSON 90: JavascriptExecutor zamiast sendkeys() i click() -- */
    /* -- LESSON 91: Symulacja kliknięcia prawym przyciskiem myszy -- */

    @Test
    public void javascriptExecutorTest() throws InterruptedException {
        driver.get("https://www.google.pl");
        WebElement searchInput = driver.findElement(By.name("q"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        Actions action = new Actions(driver);
        action.contextClick().build().perform();

        executor.executeScript("arguments[0].setAttribute('value', 'Selenium');", searchInput);
        Thread.sleep(3000, 0);

        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(3000, 0);

        WebElement seleniumDevLink = driver.findElement(By.className("LC20lb"));
        executor.executeScript("arguments[0].click();", seleniumDevLink);
        Thread.sleep(3000, 0);

        driver.quit();
    }
}