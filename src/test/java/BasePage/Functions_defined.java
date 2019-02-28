package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Functions_defined extends HomePage {

    public     ArrayList<Integer> arr =new ArrayList<Integer>();

    public void fromAddress(String address_path,String sendingKeys){
        WebElement fromAddressPath=driver.findElement(By.xpath(address_path));
        fromAddressPath.sendKeys(sendingKeys);
    }
    public void ToAddress(String address_path,String sendingKeys){
        WebElement toAddressPath=driver.findElement(By.xpath(address_path));
        toAddressPath.sendKeys(sendingKeys);
    }
    public void date(String address_path,String sendingKeys){
        WebElement dateAddressPath=driver.findElement(By.xpath(address_path));
        dateAddressPath.sendKeys(sendingKeys);
    }
    public void search(String address_path) {
        WebElement search_AddressPath = driver.findElement(By.xpath(address_path));
        search_AddressPath.click();
    }
    public void dropDown()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='listView flights']/li//th[@id='BaggageBundlingTemplate']/span"));
        for(WebElement element:elements){

            String attribute = element.getAttribute("data-pr");
            arr.add(Integer.parseInt(attribute));
            System.out.println(arr);
            Collections.sort(arr);

            System.out.println(arr);
            System.out.println(arr.get(0));
            jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
            jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        }

    }
    public void unknown(String address_path){
        WebElement pr=driver.findElement(By.xpath(address_path));
        wait.until(ExpectedConditions.elementToBeClickable(pr));
        pr.click();
    }
    public void accept_key(String address_path)
    {
        WebElement accept = driver.findElement(By.xpath(address_path));
        accept.click();
    }
    public void continueBooking(String address_path)
    {
        WebElement continuebooking = driver.findElement(By.xpath(address_path));
        wait.until(ExpectedConditions.elementToBeClickable(continuebooking));
        continuebooking.click();
    }
    public void email(String address_path,String sendingKeys,String submit_button){
        WebElement email =driver.findElement(By.xpath(address_path));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(sendingKeys);
        driver.findElement(By.xpath(submit_button)).click();
    }
    public void title(String address_path,String submit_button){
        WebElement title=driver.findElement(By.xpath(address_path));
        wait.until(ExpectedConditions.elementToBeClickable(title));
        driver.findElement(By.xpath(submit_button)).click();
    }
    public void first_last_name(String address_path_fname,String sending_keys,String addressPath_lname) {
        WebElement firstname = driver.findElement(By.xpath(address_path_fname));
        wait.until(ExpectedConditions.visibilityOf(firstname));
        firstname.sendKeys(sending_keys);

        driver.findElement(By.xpath(addressPath_lname)).sendKeys(" chougala");
    }
    public void mobile_no(String address_path,String sending_keys,String travelling_btn){
        WebElement number=driver.findElement(By.xpath(address_path));
        number.sendKeys(sending_keys);
        driver.findElement(By.xpath(travelling_btn)).click();
    }
    public void payment(String PaymentAdressPath){
        if(driver.findElements(By.xpath(PaymentAdressPath)).size()>0)
        {
            System.out.println("At payment page");
        }

        String S[]={"Credit Card","Debit Card","Net Banking","On EMI","Wallets","UPI"};

        for(int i=0;i<6;i++)
        {
            System.out.println("Hi");
            if(driver.findElements(By.xpath("//a[contains(text(),'Credit Card')]")).size()>0)
            {

                System.out.println(S[0]);
                System.out.println("Hello");

            }

        }
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Credit Card')]"))));
        System.out.println("Hey");
    }

















        public void delay(WebDriver d,String s) throws InterruptedException {
            for(int i=0;i<3000;i++){
                Thread.sleep(1);
                if(d.findElements(By.xpath(s)).size()>0){
                    System.out.println(i);
                    break;
                }
                else{
                    continue;
                }
            }
        }


}
