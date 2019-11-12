import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest
{
    @Test
    public void googleSearch() throws InterruptedException
    {
        // SOFLAB CONFIG
        String driverPath = "C:\\Users\\mateusz.bednarz\\Documents\\IntelliJ-Projects\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C://Users//mateusz.bednarz//Documents//SelCourseTestWebPage//Test.html");


    }
}
