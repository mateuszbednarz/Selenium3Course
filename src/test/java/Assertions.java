import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions
{
    private WebDriver driver;

    /* --- LESSON 87 - @BeforeClass --- */
    @BeforeClass
    public void setUp()
    {
        // SOFLAB CONFIG
        System.out.println("MSG: Executed BEFORE class!");
        String driverPath = "C:\\Users\\mateusz.bednarz\\Documents\\IntelliJ-Projects\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("C://Users//mateusz.bednarz//Documents//SelCourseTestWebPage//Test.html");
    }

    @Test
    public void assertionsTest() throws InterruptedException
    {
        driver.get("https://www.google.pl");
        WebElement searchInput = driver.findElement(By.name("q"));
        Thread.sleep(3000, 0);
        searchInput.sendKeys("Selenium WebDriver");
        Thread.sleep(3000, 0);
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        Thread.sleep(3000, 0);
        //searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.className("LC20lb"));
        Thread.sleep(3000, 0);
        seleniumPageLink.click();
        Thread.sleep(3000, 0);

        //String expectedTitle = "Selenium Projects";
        //System.out.println("Website title = " + driver.getTitle());

        /* ASERCJE, są to metody, które umożliwiają nam sprawdzenie (porówanie) pewnych warunków/wartości w danym teście,
           aby sprawdzić czy wyniki, które otrzymaliśmy są prawidłowe */

        /* --- LESSON 85 - Asercje --- */
        //Assert.assertEquals(expectedTitle, driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Selenium Bad Name!"), "ASSERT: website titles are NOT EQUAL!");
    }

    /* --- LESSON 86 - @AfterClass --- */
    @AfterClass
    public void tearDown()
    {
        System.out.println("MSG: Executed AFTER class!");
        driver.quit();
    }
}
