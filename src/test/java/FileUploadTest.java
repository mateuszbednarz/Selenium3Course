import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

/**
 * @author mbednarz
 * @created 18/02/2020 - 22:44
 * @last_modified 18/02/2020 - 23:18
 * @project Selenium3Course
 */

/* -- LESSON 97: Upload pliku -- */
public class FileUploadTest extends BaseSeleniumTest
{
    @Test
    public void fileUploadTest()
    {
        driver.get("file:///E:/mav-temp-iji/pliki-dolaczone-do-kursu/FileUpload.html");
        String path = new File("src/main/resources/testsc-127000000.png").getAbsolutePath();
        driver.findElement(By.id("myFile")).sendKeys(path);
    }
}
