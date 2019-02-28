import com.sun.org.apache.xml.internal.res.XMLErrorResources_zh_TW;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Day2_4 {
    public static void main(String[]  args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,200);
        String baseurl="https://www.cleartrip.com/";
        ArrayList<Integer> arr =new ArrayList<Integer>();
        driver.get(baseurl);
        String price ="//ul[@class='listView flights']/li[@data-id='14']//th[@id='BaggageBundlingTemplate']";
        //finds that search box
        driver.findElement(By.xpath("//div[@class='searchForm clearFix']"));
//        delay(driver,"//div[@class='searchForm clearFix']");

//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@tabindex=4]/parent::span"))));

        WebElement from = driver.findElement(By.xpath("//input[@tabindex=4]"));
        from.sendKeys(" Bangalore ");

        WebElement destination = driver.findElement(By.xpath("//input[@tabindex=5]"));
        destination.sendKeys(" Delhi ");

        WebElement date= driver.findElement(By.xpath("//input[@etitle='Depart Date']"));
        date.sendKeys(" 27/02/2019 ");

        WebElement search = driver.findElement(By.xpath("//input[@id='SearchBtn']"));
        search.click();
//

//        delay(driver,"//a[@data-sort='dur']");
        delay(driver,"//button[@ class='booking ']");

//        wait.until(ExpectedConditions.elementToBeClickable(  driver.findElement(By.xpath("//a[@data-sort='dur']"))));
//        driver.findElement(By.xpath("//a[@data-sort='dur']")).click();
////
////        delay(driver,"//a[@data-sort='price']");
////
//        driver.findElement(By.xpath("//a[@data-sort='price']")).click();
//
//        delay(driver,price);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='listView flights']/li//th[@id='BaggageBundlingTemplate']/span"));
        for(WebElement element:elements){

            String attribute = element.getAttribute("data-pr");
            arr.add(Integer.parseInt(attribute));
            System.out.println(arr);
        }

//        int size=driver.findElements(By.xpath("//div[@class='quickLook  row flightDetailsBox']")).size();
//        System.out.println(size);
//
//        for(int j=0;j<size;j++) {
//            String path= "//ul[@class='listView flights']/li[@data-id='"+j+"']//th[@id='BaggageBundlingTemplate']";
//            int val=Integer.parseInt(driver.findElement(By.xpath(path)).getText().replace("Rs.","").replace(",",""));
//            arr.add(val);
//            //System.out.println(val);
//        }
        Collections.sort(arr);


//        for(int k=0;k<size;k++) {
//            //String path= "//ul[@class='listView flights']/li[@data-id='"+j+"']//th[@id='BaggageBundlingTemplate']";
//            String val2[] = arr.get(k).split("\\,");
//            String val3=val2[0]+val2[1];
//            System.out.println(val3);
//            //arr.add(val);
//            //System.out.println(val);
//            Integer.parseInt(val3)
//        }

        System.out.println(arr);
        System.out.println(arr.get(0));
        jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
//        Thread.sleep(3000);

        delay(driver,"//th[@id='BaggageBundlingTemplate']/span[@data-pr='"+arr.get(0)+"']/following::button[1][@class='booking']");

        WebElement pr=driver.findElement(By.xpath("//th[@id='BaggageBundlingTemplate']/span[@data-pr='"+arr.get(0)+"']/following::button[@class='booking']"));
        wait.until(ExpectedConditions.elementToBeClickable(pr));


        pr.click();

        //Integer.parseInt(s);
//        for(int k=0;k<arrs.length;k++){
//            String[] ars= arrs[k].split(".");
//            System.out.println(ars[1]);
//        }

//*[@id="flightForm"]/section[2]/div[4]/div/nav/ul/li[1]/table/tbody[2]/tr[2]/td[3]/button
//        th[@id='BaggageBundlingTemplate']/span[@data-pr='12179']
//th[@id='BaggageBundlingTemplate']/span[@data-pr='12179']/following::button[1][@class='booking']


//      delay(driver,"//button[@ class='booking ']");
//        WebElement book = driver.findElement(By.xpath("//button[@ class='booking ']"));
//        book.click();
//
        delay(driver,"//input[@ id='itineraryBtn']");
        WebElement accept = driver.findElement(By.xpath("//input[@ id='insurance_confirm']"));
        accept.click();

        WebElement continuebooking = driver.findElement(By.xpath("//input[@ id='itineraryBtn']"));
        wait.until(ExpectedConditions.elementToBeClickable(continuebooking));
        continuebooking.click();

        delay(driver,"//input[@id='LoginContinueBtn_1']");

        WebElement email =driver.findElement(By.xpath("//input[@etitle='Your email address']"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys("d2r@gmail.com");

        driver.findElement(By.xpath("//input[@id='LoginContinueBtn_1']")).click();

        delay(driver,"//input[@id='travellerBtn']");

        WebElement title=driver.findElement(By.xpath("//select[@name='AdultTitle1']"));
        wait.until(ExpectedConditions.elementToBeClickable(title));
//        title.click();

//        Select select = new Select(driver.findElement(By.xpath("//select[@name='AdultTitle1']")));
//        select.selectByVisibleText("Mr");

        driver.findElement(By.xpath("//select[@name='AdultTitle1']/option[@value='Mr']")).click();

        WebElement firstname = driver.findElement(By.xpath("//input[@id='AdultFname1']"));
        wait.until(ExpectedConditions.visibilityOf(firstname));
        firstname.sendKeys("chetan ");

        driver.findElement(By.xpath("//input[@name='AdultLname1']")).sendKeys(" chougala");
//
//        WebElement nationality = driver.findElement(By.xpath("//input[@data-name='nationality']"));
//        wait.until(ExpectedConditions.visibilityOf(nationality));
//        nationality.sendKeys("Indian");
//
//        driver.findElement(By.xpath("//select[@id='AdultDobDay1']/option[@value='6']")).click();
//        driver.findElement(By.xpath("//select [@id='AdultDobMonth1']/option[@value='10']")).click();
//        driver.findElement(By.xpath("//select [@id='AdultDobYear1']/option[@value='1997']")).click();

        WebElement number=driver.findElement(By.xpath("//input[@id='mobileNumber']"));
        number.sendKeys("+91 8880001118");

        driver.findElement(By.xpath("//input[@id='travellerBtn']")).click();



        if(driver.findElements(By.xpath("//input[@id=\"paymentSubmit\"]")).size()>0)
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

//        wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//input[@id=\"paymentSubmit\"]"))));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("driver.findElements(By.xpath(\"//input[@id=\\\"paymentSubmit\\\"]\"))"))));


    }
    public static void delay(WebDriver d,String s) throws InterruptedException {
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