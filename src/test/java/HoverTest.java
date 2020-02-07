import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * @author mbednarz-job
 * @created 07/02/2020 - 13:09
 * @last_modified 07/02/2020 - 14:27 [mbednarz-job]
 * @project kurs-selenium
 */

public class HoverTest extends BaseSeleniumTest
{
    /* -- LESSON 92: Hover - symulacja najechania na element -- */
    @Test
    public void hoverTest() throws InterruptedException {
        driver.get("https://www.w3schools.com/");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("navbtn_tutorials"))).build().perform();
        Thread.sleep(3000, 0);
    }
}
