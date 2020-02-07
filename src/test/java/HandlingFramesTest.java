import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author mbednarz-job
 * @created 05/02/2020 - 17:48
 * @last_modified 06/02/2020 - 15:08 [mbednarz-job]
 * @project kurs-selenium
 */

public class HandlingFramesTest extends BaseSeleniumTest
{
    /* -- LESSON 88: Tworzenie nadrzędnej klasy testowej -- */
    /* -- LESSON 89: Obsługa iFrame -- */
    @Test
    public void handlingFramesTest()
    {
        driver.get("file:///C:/Users/mateusz.bednarz/Documents/SelCourseTestWebPage/iFrameTest.html");
        driver.switchTo().frame(0);
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        List<WebElement> headers = driver.findElements(By.tagName("h1"));
        System.out.println("Found headers count = " + headers.size());
        headers.forEach(webElement -> System.out.println(webElement.getText()));

        driver.quit();
    }
}