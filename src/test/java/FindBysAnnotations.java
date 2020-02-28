import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author mbednarz
 * @created 25/02/2020 - 22:36
 * @project Selenium3Course
 */

/* -- LESSON 108: adnotacja @FindBys -- */
/* -- LESSON 109: adnotacja @FindAll -- */
public class FindBysAnnotations extends BaseSeleniumTest
{
    /*
    @FindBys
            ({
                @FindBy(tagName = "table"),
                @FindBy(className = "tableHeader")
            })
    private List<WebElement> elements;
     */

    @FindAll
            ({
                @FindBy(xpath = "//input"),
                @FindBy(xpath = "//button")
            })
    private List<WebElement> inputsAndButtons;

    @FindBy(xpath = "//input")
    private List<WebElement> inputs;

    @FindBy(xpath = "//button")
    private List<WebElement> buttons;

    @Test
    void googleSearchTest() throws InterruptedException
    {
        PageFactory.initElements(driver, this);
        driver.get("file:///E:/mav-temp-iji/pliki-dolaczone-do-kursu/Test.html");
        Thread.sleep(3000, 0);

        //System.out.println("Table headers count = " + elements.size());
        System.out.println("Inputs count = " + inputs.size());
        System.out.println("Buttons count = " + buttons.size());
        System.out.println("Inputs & buttons count sum = " + inputsAndButtons.size());
    }
}
