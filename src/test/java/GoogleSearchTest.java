import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author mbednarz-job
 * @created 06/02/2020 - 11:07
 * @last_modified 06/02/2020 - 11:07 [mbednarz-job]
 * @project kurs-selenium
 */

public class GoogleSearchTest extends BaseSeleniumTest
{
    /* -- LESSON 88: Tworzenie nadrzędnej klasy testowej -- */
    @Test
    public void googleSearch() throws InterruptedException
    {
        driver.get("https://www.google.pl");
        WebElement searchInput = driver.findElement(By.name("q"));
        Thread.sleep(3000, 0);

        searchInput.sendKeys("Selenium WebDriver");
        Thread.sleep(3000, 0);

        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000, 0);

        driver.findElement(By.className("LC20lb")).click();
        Thread.sleep(3000, 0);

        driver.quit();
    }
}
