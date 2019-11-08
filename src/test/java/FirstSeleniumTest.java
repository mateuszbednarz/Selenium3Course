import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest()
    {
        // SOFLAB CONFIG
        String driverPath = "C:\\Users\\mateusz.bednarz\\Documents\\IntelliJ-Projects\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Dimension dimension = new Dimension(1300, 700); // web-browser window dimension parameters
        //driver.manage().window().setSize(dimension);

        // SOFLAB CONFIG
        driver.get("C://Users//mateusz.bednarz//Documents//SelCourseTestWebPage//Test.html");



        /* FOURTH PART OF KNOWLEDGE
        Select carSelect = new Select(driver.findElement(By.tagName("select")));
        carSelect.selectByValue("audi");

        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Deborah");

        System.out.println("=====================================================================");
        System.out.println("'First name' field value = " + firstNameInput.getAttribute("value"));

        WebElement label = driver.findElement(By.xpath("/html/body/label[2]"));
        System.out.println("Label value = " + label.getText());

        driver.quit();

        driver.findElement(By.id("newPage")).click();
        driver.close(); // zamyka okno na którym jest focus (obecnie znajduje się driver)
        driver.quit(); // zamyka wszystkie otwarte okna przeglądarki

        WebElement firstnameInput = driver.findElement(By.name("fname"));
         */


        /* FIRST PART OF KNOWLEDGE
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Matthew");
        firstNameInput.clear();
        firstNameInput.sendKeys("Danielle");

        WebElement clickOnMeButton2 = driver.findElementById("clickOnMe");
        */


        /* SECOND PART OF KNOWLEDGE
        WebElement w3schoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement googleLink = driver.findElement(By.partialLinkText("IamWeirdLink"));
        WebElement topSecretParagraph = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));

        WebElement clickOnMeCssButton = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement links = driver.findElement(By.cssSelector("a"));
        WebElement topSecretCss = driver.findElement(By.cssSelector(".topSecret"));
        WebElement tdFirstChild = driver.findElement(By.cssSelector("td:first-child"));

        WebElement clickOnMeXpathButton = driver.findElement(By.xpath("/html/body/button"));
        WebElement clickOnMeXpathButtonTwo = driver.findElement(By.xpath("//button"));
        WebElement linkXpath = driver.findElement(By.xpath("//a"));
        WebElement topSecretXpath = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement topSecretXpathTwo = driver.findElement(By.xpath("//*[@class='topSecret']"));
        WebElement linkText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
         */

        /* THIRD PART OF KNOWLEDGE
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        System.out.println("Znaleziono: " + linksList.size() + " elementów typu 'a' na stronie testowej");

        if (linksList.size() > 0)
        {
            System.out.println("HREF links exist!");
        }
        else
        {
            System.out.println("HREF links don't exist!");
        }

        WebElement clickOnMeFFDevCssSel = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement clickOnMeFFDevXPath = driver.findElement(By.xpath("//*[@id=\"clickOnMe\"]"));
         */
    }
}