import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * @author mbednarz-job
 * @created 05/02/2020 - 17:41
 * @last_modified 18/02/2020 - 19:17 [mbednarz-home]
 * @project kurs-selenium
 */

public abstract class BaseSeleniumTest
{
    protected WebDriver driver;

    /* -- LESSON 88: Tworzenie nadrzędnej klasy testowej -- */
    @BeforeTest
    public void setUp()
    {
        System.out.println("Executed BEFORE test!");

        // DRIVER CONFIG
        String driverPath = "E:\\IT Knowledge Base\\DEV & QA\\Testing\\MB_Testing_Projects\\Selenium3Course\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown()
    {
        System.out.println("Executed AFTER test!");
        driver.quit();
    }
}
