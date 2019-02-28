import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day2 {

    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, 200);
        String baseURL = "https://www.cleartrip.com/?dxid=CjwKCAiAwJTjBRBhEiwA56V7q8LwAFKNgqPY6HpOanzvEwOOTnvTu8kL_wneDIZYfWkweWS3SPx0vRoCaboQAvD_BwE&gclid=CjwKCAiAwJTjBRBhEiwA56V7q8LwAFKNgqPY6HpOanzvEwOOTnvTu8kL_wneDIZYfWkweWS3SPx0vRoCaboQAvD_BwE";
//        String emailId="//div[@class='login__input-container']";
//        String continueButton="//button";
//        String passWord="//div[@class=\'login__input-container has-error\']";
//        String login="//button[@ng-click=\"login(loginForm)\"]";

        driver.get(baseURL);

        for(int i=0;i<10;i++)
        {
            Thread.sleep(2000);
            if(driver.findElements(By.xpath("//input[@id='MarketingEmail']")).size()>0)
            {
                break;
            }
        }

        WebElement from = driver.findElement(By.xpath("//input[@type='text'][@tabindex='4']/parent::span"));
//
//        email.sendKeys("cookie-auto-tenant40@onetrust.com");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//        wait.until(ExpectedConditions.invisibilityOf(email));
//
//        WebElement passWord = driver.findElement(By.xpath("//input[@id=\"MarketingPassword\"]"));
//
//        passWord.sendKeys("Qwerty123");
//        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//
////        Thread.sleep(30000);
//
//
//
//        for(int i=0;i<10;i++)
//        {
//            Thread.sleep(2000);
//            if(driver.findElements(By.xpath("//button[@ot-auto-id=\"GlobalHeaderBtnLaunch\"]")).size()>0)
//            {
//                break;
//            }
//        }
//
//
//        WebElement menuButton = driver.findElement(By.xpath("//button[@ot-auto-id=\"GlobalHeaderBtnLaunch\"]"));
//        menuButton.click();
////        Thread.sleep(5000);
//
//        for(int i=0;i<10;i++)
//        {
//            Thread.sleep(2000);
//            if(driver.findElements(By.xpath("//a [@ot-auto-id='LauncherDataSubjectRequestsMenuItem']")).size()>0)
//            {
//                break;
//            }
//        }
//        WebElement dsar = driver.findElement(By.xpath("//a [@ot-auto-id='LauncherDataSubjectRequestsMenuItem']"));
//        dsar.click();
//
//
//
////        Thread.sleep(5000);
//
//
//        for(int i=0;i<10;i++)
//        {
//            Thread.sleep(2000);
//            if(driver.findElements(By.xpath("/html/body/app-root/div/div/ui-view/ui-view/ui-view/div/div/one-global-sidebar/ot-sidebar/div/div/div[1]/ul/li[2]/a")).size()>0)
//            {
//                break;
//            }
//        }
//        WebElement webForm=driver.findElement(By.xpath("/html/body/app-root/div/div/ui-view/ui-view/ui-view/div/div/one-global-sidebar/ot-sidebar/div/div/div[1]/ul/li[2]/a"));
//        webForm.click();
////        Thread.sleep(5000);
//
//        for(int i=0;i<10;i++)
//        {
//            Thread.sleep(2000);
//            if(driver.findElements(By.xpath("//button[@ot-auto-id=\"DSARWebformAddNewButton\"]")).size()>0)
//            {
//                break;
//            }
//        }
//
//        WebElement addNew = driver.findElement(By.xpath("//button[@ot-auto-id=\"DSARWebformAddNewButton\"]"));
//
//        addNew.click();
////        Thread.sleep(5000);
//
//        for(int i=0;i<10;i++)
//        {
//            Thread.sleep(2000);
//            if(driver.findElements(By.xpath("//input[@ot-auto-id=\"SettingsWebFormName\"]")).size()>0)
//            {
//                break;
//            }
//        }
//        WebElement inBox1 = driver.findElement(By.xpath("//input[@ot-auto-id=\"SettingsWebFormName\"]"));
//
//        inBox1.sendKeys("Dell");
////        Thread.sleep(5000);
//
//        for(int i=0;i<10;i++)
//        {
//            Thread.sleep(2000);
//            if(driver.findElements(By.xpath("//*[@id=\"ot-page-wrapper\"]/dsar-wrapper/div/div/section/ui-view/ui-view/downgrade-dsar-add-new-webform/section/div/div/button[2]")).size()>0)
//            {
//                break;
//            }
//        }
//        WebElement saveOption = driver.findElement(By.xpath("//*[@id=\"ot-page-wrapper\"]/dsar-wrapper/div/div/section/ui-view/ui-view/downgrade-dsar-add-new-webform/section/div/div/button[2]"));
//        saveOption.click();
//
//        Thread.sleep(2000);
//        driver.close();
//        driver.quit();
//
//
//

    }
}
