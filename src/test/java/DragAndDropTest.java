import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * @author mbednarz-job
 * @created 07/02/2020 - 14:33
 * @last_modified 07/02/2020 - 23:23 [mbednarz-home]
 * @project kurs-selenium
 */

public class DragAndDropTest extends BaseSeleniumTest
{
    /* -- LESSON 93: Drag & Drop - symulacja przeciągania i upuszczania elementu -- */

    @Test
    public void dragAndDropTest() throws InterruptedException
    {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptCookies = driver.findElement(By.xpath("//button[@title = 'Accept Cookies']"));
        acceptCookies.click();

        Thread.sleep(5000, 0);

        WebElement elementToDrag = driver.findElement(By.id("draggable"));
        WebElement dropZone = driver.findElement(By.id("droptarget"));
        Thread.sleep(5000, 0);

        Actions action = new Actions(driver);
        action.dragAndDrop(elementToDrag, dropZone).build().perform();
        Thread.sleep(5000, 0);
    }
}
