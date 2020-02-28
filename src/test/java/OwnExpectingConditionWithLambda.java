import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.function.Function;

/**
 * @author mbednarz
 * @created 25/02/2020 - 22:20
 * @project Selenium3Course
 */

/* -- LESSON 104: Oczekiwanie na element - własna implementacja warunku za pomocą lambdy -- */
public class OwnExpectingConditionWithLambda extends BaseSeleniumTest
{
    @Test
    public void waitTest()
    {
        driver.get("file:///E:/mav-temp-iji/pliki-dolaczone-do-kursu/Waits.html");
        driver.findElement(By.tagName("button")).click();

        myOwnWaitForWebElement(By.tagName("p"));
        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println("Paragraf zawiera tekst: " + paragraph.getText());

        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
    }

    private void myOwnWaitForWebElement(By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(driver1 ->
            {
                System.out.println("Sprawdzam czy element jest wyświetlany...");
                if(driver1.findElement(locator).isDisplayed())
                {
                    System.out.println("Element jest wyświetlony!");
                    return true;
                } else
                {
                    System.out.println("Element nie jest wyświetlony na stronie!");
                    return false;
                }
            }
        );
    }
}
