import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author mbednarz-job
 * @created 06/02/2020 - 11:07
 * @last_modified 18/02/2020 - 22:44 [mbednarz-home]
 * @project kurs-selenium
 */

public class GoogleSearchTest extends BaseSeleniumTest
{
    /* -- LESSON 88: Tworzenie nadrzędnej klasy testowej -- */
    /* -- LESSON 96: Ustawianie unikalnej nazwy dla zrzutu ekranu -- */
    @Test
    public void googleSearch() throws InterruptedException
    {
        SeleniumHelper helper = new SeleniumHelper(driver);

        driver.get("https://www.google.pl");
        WebElement searchInput = driver.findElement(By.name("q"));
        Thread.sleep(3000, 0);

        searchInput.sendKeys("Selenium WebDriver");
        Thread.sleep(3000, 0);
        helper.takeScreenshot(); // screenshot taken here!
        Thread.sleep(3000, 0);

        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000, 0);

        driver.findElement(By.className("LC20lb")).click();
        Thread.sleep(3000, 0);
        helper.takeScreenshot(); // screenshot taken here!
        Thread.sleep(3000, 0);
    }
}
