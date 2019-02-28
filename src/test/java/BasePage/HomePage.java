package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class HomePage {
    public WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
        public void driverInitialse()
        {
             driver = new ChromeDriver();
             wait = new WebDriverWait(driver, 200);

            String base_URL = "https://www.cleartrip.com/";
            driver.get(base_URL);
        }
     @AfterTest
    public void driverClose() throws InterruptedException {
         Thread.sleep(2000);
         driver.close();
     }
}
