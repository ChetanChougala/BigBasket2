import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day2_1 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 200);

        String base_URL = "https://www.cleartrip.com/";

        driver.get(base_URL);
        WebElement from = driver.findElement(By.xpath(" //input[@type=\"text\"][@tabindex=\"4\"]"));
        from.sendKeys(" bangalore ");

        WebElement to = driver.findElement(By.xpath("  //input[@type=\"text\"][@tabindex='5']"));
        to.sendKeys(" delhi ");

        WebElement calendar = driver.findElement(By.xpath(" //input[@id=\"DepartDate\"]"));
        calendar.sendKeys(" 21/02/2019 ");
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.xpath(" //input[@id=\"SearchBtn\"]"));
        search.click();

//        Delay(driver,"//ul[@class='listView flights']");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            if (driver.findElements(By.xpath("//ul[@class=\"listView flights\"]")).size() > 0) {
                break;
            }
        }
        Delay(driver,"//li[@class=\"listItem showTabs nonBundled \"]");
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(2000);
//            if (driver.findElements(By.xpath("//li[@class=\"listItem showTabs nonBundled \"]")).size() > 0) {
//                break;
//            }
//        }
//                WebElement Asc_Sort = driver.findElement(By.xpath("//a[@class=\"current sortAsc\"]"));
//
//
//                Asc_Sort.click();
//                Thread.sleep(5000);
//                WebElement des_Sort = driver.findElement(By.xpath("//a[@class=\"current sortDes\"]"));
//                des_Sort.click();
//
//                Thread.sleep(5000);
//                Asc_Sort.click();
//                Thread.sleep(5000);
//                des_Sort.click();
//
//
//
//
//                for(int i=0;i<10;i++)
//                {
//                    Thread.sleep(2000);
//                    if(driver.findElements(By.xpath("//li[@class=\"listItem showTabs nonBundled \"]")).size()>0)
//                    {
//                        break;
//                    }
//                }
        Thread.sleep(5000);
        WebElement Select;
        Select = driver.findElement(By.xpath("//button[@class='booking']"));
        Select.click();

        WebElement select2 = driver.findElement(By.xpath("//input[@type=\"checkbox\"][@name=\"insuranceConfirm\"]"));
        select2.click();
        WebElement booking = driver.findElement(By.xpath("//input[@class=\"booking\"]"));
        booking.click();
//        Delay(driver,"//input[@type=\"email\"]");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            if (driver.findElements(By.xpath("//input[@type=\"email\"]")).size() > 0) {
                break;
            }
        }
//        Thread.sleep(2000);
        WebElement mail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        mail.sendKeys("world28@gmail.com");

        WebElement continues = driver.findElement(By.xpath("//input[@class=\"booking hotelButton\"]"));
        continues.click();

        Delay(driver,"//dd[@ id=\"addAD1\"]");
//        for (int i = 0; i < 1000; i++) {
//            Thread.sleep(2);
//            if (driver.findElements(By.xpath("//dd[@ id=\"addAD1\"]")).size() > 0) {
//                break;
//            }
//        }

        Thread.sleep(5000);
        WebElement titles=driver.findElement(By.xpath("//select[@name=\"AdultTitle1\"]"));
        titles.click();

        Delay(driver,"//input[@class=\"booking\"][@id=\"itineraryBtn\" ]");
//        for (int i = 0; i < 1000; i++) {
//            Thread.sleep(2);
//            if (driver.findElements(By.xpath("//input[@class=\"booking\"][@id=\"itineraryBtn\" ]")).size() > 0) {
//                break;
//            }
//        }
        WebElement titles2=driver.findElement(By.xpath("//select[@name=\"AdultTitle1\"]/option[@value='Mr']"));
        titles2.click();
//        Thread.sleep(5000);
        WebElement fname=driver.findElement(By.xpath("//input[@data-name=\"firstName\"]"));
        fname.sendKeys("qwert");

        WebElement lname=driver.findElement(By.xpath("//input[@data-name=\"lastName\"]"));
        lname.sendKeys("poiuy");

        WebElement m_no=driver.findElement(By.xpath("//input[@data-name=\"mobileNumber\"]"));
        m_no.sendKeys("8945239078");


        WebElement continues3 =driver.findElement(By.xpath("//input[@class=\"booking\"][@id=\"travellerBtn\"]"));
        continues3.click();



    }

    public static void Delay(WebDriver d,String s) throws  InterruptedException {
        for (int i = 0; i < 200000; i++)
        {
            Thread.sleep(20);
            if (d.findElements(By.xpath(s)).size()>0)
            {
            break;
            }
        }
    }
    }
