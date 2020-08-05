import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author mbednarz-job
 * @created 07/02/2020 - 16:39
 * @last_modified 18/02/2020 - 21:59 [mbednarz-home]
 * @project kurs-selenium
 */

public class DoubleClickTest extends BaseSeleniumTest
{
    /* -- LESSON 94: Symulacja podwójnego kliknięcia -- */
    /* -- LESSON 95: Tworzenie zrzutów okna przeglądarki -- */
    @Test
    private void doubleClickTest() throws InterruptedException
    {
        SeleniumHelper seleniumHelper = new SeleniumHelper(driver);

        driver.get("file:///E:/IT Knowledge Base/DEV & QA/Testing/MB_Testing_Projects/sel3-course-files/DoubleClick.html");
        WebElement button = driver.findElement(By.id("bottom"));
        Thread.sleep(3000, 0);

        Actions action = new Actions(driver);
        action.moveToElement(button).doubleClick().build().perform();
        Thread.sleep(3000, 0);

        seleniumHelper.takeScreenshot();
        Thread.sleep(3000, 0);

        Assert.assertTrue(driver.getWindowHandles().size() > 1);
        Thread.sleep(3000, 0);
    }
}
