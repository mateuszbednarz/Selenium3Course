import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions
{
    @Test
    public void assertionsTest() throws InterruptedException
    {
        // HOME LENOVO CONFIG
        String driverPath = "E:\\mav-temp-iji\\Selenium3Course\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("E://mav-temp-iji//pliki-dolaczone-do-kursu//Test.html");

        // SOFLAB DELL CONFIG
        //String driverPath = "C:\\Users\\mateusz.bednarz\\Documents\\IntelliJ-Projects\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        //System.setProperty("webdriver.chrome.driver", driverPath);
        //ChromeDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.get("C://Users//mateusz.bednarz//Documents//SelCourseTestWebPage//Test.html");

        driver.get("https://www.google.pl");
        WebElement searchInput = driver.findElement(By.name("q"));
        Thread.sleep(3000, 0);
        searchInput.sendKeys("seleniumhq");
        Thread.sleep(3000, 0);
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        Thread.sleep(3000, 0);
        //searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.className("S3Uucc"));
        Thread.sleep(3000, 0);
        seleniumPageLink.click();
        Thread.sleep(3000, 0);

        String expectedTitle = "SeleniumHQ Browser Automation";
        System.out.println("Website title = " + driver.getTitle());

        // ASERCJE, są to metody, które umożliwiają nam sprawdzenie pewnych warunków
        Assert.assertEquals(expectedTitle, driver.getTitle());


        driver.quit();
    }
}
