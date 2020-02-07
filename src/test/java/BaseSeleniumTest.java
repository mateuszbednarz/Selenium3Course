import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * @author mbednarz-job
 * @created 05/02/2020 - 17:41
 * @last_modified 06/02/2020 - 14:05 [mbednarz-job]
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

    @AfterTest
    public void tearDown()
    {
        System.out.println("Executed AFTER test!");
        driver.quit();
    }
}
