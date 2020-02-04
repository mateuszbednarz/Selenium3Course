
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() throws InterruptedException
    {
        // HOME LENOVO CONFIG
        String driverPath = "E:\\mav-temp-iji\\Selenium3Course\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("E://mav-temp-iji//pliki-dolaczone-do-kursu//Test.html");

        // SOFLAB DELL CONFIG
        //String driverPath = "C:\\Users\\mateusz.bednarz\\Documents\\IntelliJ-Projects\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        //System.setProperty("webdriver.chrome.driver", driverPath);
        //ChromeDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.get("C://Users//mateusz.bednarz//Documents//SelCourseTestWebPage//Test.html");

        WebElement newPageButton = driver.findElement(By.id("newPage"));
        String currentWindowName = driver.getWindowHandle();

        Thread.sleep(3000, 0);
        newPageButton.click();
        Thread.sleep(3000, 0);

        switchToNewWindow(driver, currentWindowName);

        System.out.println("Opened website title = " + driver.getTitle());
        System.out.println("Obecny URL to = " + driver.getCurrentUrl());
        Thread.sleep(3000, 0);
        driver.switchTo().window(currentWindowName);
        Thread.sleep(3000, 0);
        driver.findElement(By.name("username")).sendKeys(" Mouse");
    }

    private void switchToNewWindow(ChromeDriver driver, String currentWindowName)
    {
        System.out.println("Current window (start point) = " + currentWindowName);
        Set<String> windows = driver.getWindowHandles();

        System.out.println("Browser windows count = " + windows.size());

        for (String window : windows)
        {
            if (!window.equals(currentWindowName))
            {
                driver.switchTo().window(window);
            }
        }
    }


        /*
        checkIfElementExists(By.tagName("a"), driver);
        checkIfElementExists(By.tagName("assdamm"), driver);

        checkIfElementExists(driver, By.tagName("a"));
        checkIfElementExists(driver, By.tagName("assdamm"));
         */

    /* SIXTH PART OF KNOWLEDGE
    public boolean checkIfElementExists(By locator, WebDriver driver)
    {
        System.out.println("Method NO 1 results: ");

        if (driver.findElements(locator).size() > 0)
        {
            System.out.println("1] Element EXISTS on the website!");
            return true;
        }
        System.out.println("2] Element DOESN'T EXISTS on the website!");
        return false;
    }

    // METHOD OVERLOADING
    public void checkIfElementExists(WebDriver driver, By locator)
    {
        System.out.println("Method NO 2 results: ");

        try
        {
            driver.findElement(locator);
            System.out.println("Element EXISTS on the website!");
        } catch (NoSuchElementException ex)
            {
                System.out.println("Element DOESN'T EXISTS on the website!");
            }
    }
    */

        /* FIFTH PART OF KNOWLEDGE
        WebElement tsElement = driver.findElement(By.className("topSecret"));
        Thread.sleep(3000, 0);

        if (tsElement.isDisplayed())
        {
            System.out.println("Element is VISIBLE!");
            System.out.println("Paragraph description = " + tsElement.getText());
        }
        else
        {
            System.out.println("Element is NOT VISIBLE!");
            System.out.println(tsElement.getAttribute("textContent"));
        }

        WebElement chckb = driver.findElement(By.xpath("//input[@type='checkbox']"));

        if (chckb.isSelected())
        {
            System.out.println("Checkbox was SELECTED already!");
            Thread.sleep(3000,0);
            chckb.click();
            System.out.println("Now checkbox is UNSELECTED!");
        }
        else
        {
            System.out.println("Checkbox was UNSELECTED already!");
        }


        WebElement fnameInput = driver.findElement(By.name("fname"));

        if (fnameInput.isEnabled())
        {
            System.out.println("Element is NOT BLOCKED!");
            fnameInput.sendKeys("Thomas Brian");
        }
        else
        {
            System.out.println("Element IS BLOCKED, you can't provide input data!");
        }

        WebElement smileImg = driver.findElement(By.id("smileImage"));
        System.out.println(smileImg.getSize().getHeight());
        System.out.println(smileImg.getAttribute("naturalHeight"));

        WebElement hp = driver.findElement(By.className("topSecret"));
        System.out.println("This is my hidden text: " + hp.getText());
        System.out.println("This is my hidden text: " + hp.getAttribute("value"));
        System.out.println("This is my hidden text: " + hp.getAttribute("textContent"));

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        Thread.sleep(3000,0);
        checkbox.click();

        WebElement rb = driver.findElement(By.xpath("//input[@value='male']"));
        Thread.sleep(3000, 0);
        rb.click();

        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println("Wartość dla pobranego elementu 'label' to: " + label.getText());
        Dimension dimension = new Dimension(1300, 700); // web-browser window dimension parameters
        driver.manage().window().setSize(dimension);
        */


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