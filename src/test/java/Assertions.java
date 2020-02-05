import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

/**
 * @author mbednarz-home
 * @created 04/02/2020 - 21:48
 * @last_modified 05/02/2020 - 17:42 [mbednarz-job]
 * @project Selenium3Course
 */

public class Assertions {

    private WebDriver driver;

    /* -- LESSON 87: @BeforeClass -- */
    @BeforeTest
    public void setUp()
    {
        System.out.println("Executed BEFORE test!");

        // HOME CONFIG
        //String driverPath = "E:\\mav-temp-iji\\Selenium3Course\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        //System.setProperty("webdriver.chrome.driver", driverPath);
        //ChromeDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.get("E://mav-temp-iji//pliki-dolaczone-do-kursu//Test.html");

        // SOFLAB CONFIG
        String driverPath = "C:\\Users\\mateusz.bednarz\\Documents\\IntelliJ-Projects\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("C://Users//mateusz.bednarz//Documents//SelCourseTestWebPage//Test.html");
    }


    @Test
    public void googleFindingsAssertionTest() throws InterruptedException
    {
        /* -- LESSON 85: Asercje -- */
        driver.get("https://www.google.pl");
        WebElement searchInput = driver.findElement(By.name("q"));
        Thread.sleep(3000, 0);

        searchInput.sendKeys("Selenium WebDriver");
        Thread.sleep(3000, 0);

        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000, 0);

        driver.findElement(By.className("LC20lb")).click();
        Thread.sleep(3000, 0);

        //String expectedWebsiteTitle = "Selenium Projects";
        //System.out.println("Original title from website: " + driver.getTitle());

        //Assert.assertEquals(driver.getTitle(), expectedWebsiteTitle);
        //assertTrue(expectedWebsiteTitle.equals(driver.getTitle()));
        assertTrue(driver.getTitle().equals("Selenium Projects"), "ASSERT MSG: Titles are NOT EQUAL!");
    }

    @Test
    public void googleFindingsAssertionTestTwo() throws InterruptedException
    {
        /* -- LESSON 85: Asercje -- */
        driver.get("https://www.google.pl");
        WebElement searchInput = driver.findElement(By.name("q"));
        Thread.sleep(3000, 0);

        searchInput.sendKeys("Selenium WebDriver");
        Thread.sleep(3000, 0);

        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000, 0);

        driver.findElement(By.className("LC20lb")).click();
        Thread.sleep(3000, 0);

        //String expectedWebsiteTitle = "Selenium Projects";
        //System.out.println("Original title from website: " + driver.getTitle());

        //Assert.assertEquals(driver.getTitle(), expectedWebsiteTitle);
        //assertTrue(expectedWebsiteTitle.equals(driver.getTitle()));
        assertTrue(driver.getTitle().equals("Selenium Projects"), "ASSERT MSG: Titles are NOT EQUAL!");
    }

    /* -- LESSON 86: @AfterClass -- */
    @AfterTest
    public void tearDown()
    {
        System.out.println("Executed AFTER test!");
        driver.quit();
    }
}
