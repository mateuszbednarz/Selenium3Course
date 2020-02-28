import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author mbednarz
 * @created 25/02/2020 - 22:36
 * @project Selenium3Course
 */

/* -- LESSON 106: Wyszukiwanie elementu za pomocą @FindBy i PageFactory -- */
/* -- LESSON 107: Wyszukiwanie listy elementów za pomocą @FindBy -- */
public class FindByAnnotations extends BaseSeleniumTest
{
    @FindBy(name = "q")
    //private WebElement searchInput;
    private List<WebElement> searchInput;

    @Test
    void googleSearchTest() throws InterruptedException
    {
        PageFactory.initElements(driver, this);
        driver.get("https://www.google.pl");
        Thread.sleep(3000, 0);

        searchInput.get(0).sendKeys("Selenium WebDriver");
        Thread.sleep(3000, 0);

        searchInput.get(0).sendKeys(Keys.ENTER);
        Thread.sleep(3000, 0);

        driver.findElement(By.className("LC20lb")).click();
        Thread.sleep(3000, 0);
    }
}
