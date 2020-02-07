import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * @author mbednarz-job
 * @created 07/02/2020 - 14:33
 * @last_modified 07/02/2020 - 16:39 [mbednarz-job]
 * @project kurs-selenium
 */

public class DragAndDropTest extends BaseSeleniumTest
{
    /* -- LESSON 93: Drag & Drop - symulacja przeciągania i upuszczania elementu -- */

    @Test
    public void dragAndDropTest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement elementToDrag = driver.findElement(By.id("draggable"));
        WebElement dropZone = driver.findElement(By.id("droptarget"));
        Thread.sleep(3000, 0);

        Actions action = new Actions(driver);
        action.dragAndDrop(elementToDrag, dropZone).build().perform();
        Thread.sleep(3000, 0);

        driver.quit();
    }
}
