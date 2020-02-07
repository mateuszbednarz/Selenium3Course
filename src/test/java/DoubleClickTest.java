import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author mbednarz-job
 * @created 07/02/2020 - 16:39
 * @last_modified 07/02/2020 - 16:54 [mbednarz-job]
 * @project kurs-selenium
 */

public class DoubleClickTest extends BaseSeleniumTest
{
    @Test
    private void doubleClickTest() throws InterruptedException
    {
        driver.get("file:///C:/Users/mateusz.bednarz/Documents/SelCourseTestWebPage/DoubleClick.html");
        WebElement button = driver.findElement(By.id("bottom"));

        Actions action = new Actions(driver);

        Assert.assertTrue(driver.getWindowHandles().size() > 1);

        driver.quit();
    }
}
