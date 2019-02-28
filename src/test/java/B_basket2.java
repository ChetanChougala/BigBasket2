import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_basket2 {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 200);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        String base_URL = "https://www.bigbasket.com/";
        driver.get(base_URL);

        WebElement homeLogo = driver.findElement(By.xpath("//a[@title=\"Bigbasket\"]"));
        wait.until(ExpectedConditions.visibilityOf(homeLogo));
        homeLogo.click();




        //        Search bar
        WebElement search_Opt = driver.findElement(By.xpath("//input[@placeholder=\"Search for Products..\"]"));
        search_Opt.sendKeys("tomato cherry");

//        check for dropdown-menu
        WebElement inSearch = driver.findElement(By.xpath("//div[@class=\"search-result\"]/p[text()='Showing results for ']"));
        wait.until(ExpectedConditions.visibilityOf(inSearch));
        Thread.sleep(2000);
        qwert(driver,"low");

//  Started comment here
//        WebElement h_tomato=driver.findElement(By.xpath("//p[text()=' - Hybrid']/b[text()='Tomato']"));

        WebElement search_Opt2 = driver.findElement(By.xpath("//input[@qa=\"searchBar\"]"));
        wait.until(ExpectedConditions.visibilityOf(search_Opt2));
        search_Opt2.sendKeys("Tomato hybrid");

        WebElement inSearch2 = driver.findElement(By.xpath("//div[@class=\"search-result\"]/p[text()='Showing results for ']"));
        wait.until(ExpectedConditions.visibilityOf(inSearch2));

        Thread.sleep(2000);

        System.out.println("call 2 start");
       qwert(driver,"low");
//        List<WebElement> rows2 = driver.findElements(By.xpath("//li[@qa=\"prodListAS\"]//span[@qa=\"priceAS\"]"));


//


////        checking for tomoato option click
//        WebElement c_tomato=driver.findElement(By.xpath("//p[text()='o - Cherry']/b[text()='Tomat']"));
//        wait.until(ExpectedConditions.visibilityOf(c_tomato)).click();
//

        WebElement search_Opt3 = driver.findElement(By.xpath("//input[@qa=\"searchBar\"]"));
        wait.until(ExpectedConditions.visibilityOf(search_Opt3));
        search_Opt3.sendKeys("Tomato local");

        WebElement inSearch3 = driver.findElement(By.xpath("//div[@class=\"search-result\"]/p[text()='Showing results for ']"));
        wait.until(ExpectedConditions.visibilityOf(inSearch3));

        Thread.sleep(2000);

        System.out.println("call 3 start");
        qwert(driver,"low");
//
//

        WebElement search_Opt4 = driver.findElement(By.xpath("//input[@qa=\"searchBar\"]"));
        wait.until(ExpectedConditions.visibilityOf(search_Opt4));
        search_Opt4.sendKeys("raw sona masoori rice");

        WebElement inSearch4 = driver.findElement(By.xpath("//div[@class=\"search-result\"]/p[text()='Showing results for ']"));
        wait.until(ExpectedConditions.visibilityOf(inSearch4));

        Thread.sleep(2000);

        System.out.println("call 4 start");
        qwert(driver,"low");

        WebElement search_Opt5 = driver.findElement(By.xpath("//input[@qa=\"searchBar\"]"));
        wait.until(ExpectedConditions.visibilityOf(search_Opt5));
        search_Opt5.sendKeys("pure ghee");

        WebElement inSearch5 = driver.findElement(By.xpath("//div[@class=\"search-result\"]/p[text()='Showing results for ']"));
        wait.until(ExpectedConditions.visibilityOf(inSearch5));

        Thread.sleep(2000);

        System.out.println("call 5 start");
        qwert(driver,"high");

//        commented till here

        System.out.println("all in basket");





//click on view basket and checkout


    WebElement view_basket=driver.findElement(By.xpath("//i[@class=\"icon svg-basket svg-header svg-basket-dim\"]"));
    wait.until(ExpectedConditions.visibilityOf(view_basket));
    view_basket.click();

    WebElement view_basket2=driver.findElement(By.xpath("//button[@qa=\"viewBasketMB\"]"));
    wait.until(ExpectedConditions.visibilityOf(view_basket2));
    view_basket2.click();

    WebElement logina=driver.findElement(By.xpath("//a[text()='LOGIN']"));
    wait.until(ExpectedConditions.visibilityOf(logina));
    logina.click();

        WebElement email=driver.findElement(By.xpath("//input[@autocomplete=\"email\"]"));
        wait.until(ExpectedConditions.visibilityOf(email));
//        email.click();
        email.sendKeys("vikodixu@digital-message.com");

        WebElement password=driver.findElement(By.xpath("//input[@autocomplete=\"current-password\"]"));
        wait.until(ExpectedConditions.visibilityOf(password));
//        password.click();
        password.sendKeys("Bigb123456*");


        WebElement checkout=driver.findElement(By.xpath("//button[@type=\"submit\"][@class=\"btn btn-default login-btn fixed-btn\"]"));
        wait.until(ExpectedConditions.visibilityOf(checkout));
        checkout.click();

//        WebElement checkout1=driver.findElement(By.xpath("//button[@qa=\"checkoutBtnBSKT\"]"));
//        wait.until(ExpectedConditions.visibilityOf(checkout1));
//        checkout1.click();


//        checkout done

////        Thread.sleep(5000);
//        WebElement signup_b = driver.findElement(By.xpath("//button[@class=\"btn btn-default signup-btn\"]"));
//        wait.until(ExpectedConditions.visibilityOf(signup_b));
//
//        WebElement f_name = driver.findElement(By.xpath("//label[@for=\"fname\"]"));
//        f_name.sendKeys("chetan");
//
//        WebElement l_name = driver.findElement(By.xpath("//label[@for=\"lname\"]"));
//        f_name.sendKeys("champ");
//
//        WebElement email = driver.findElement(By.xpath("//label[@for=\"email\"]"));
//        f_name.sendKeys("");







    }



        public static void qwert(WebDriver driver,String rate)throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, 200);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        WebElement view_all=driver.findElement(By.xpath("//a[@qa=\"viewAllAS\"]"));
        wait.until(ExpectedConditions.visibilityOf(view_all));
        List<WebElement> rows = driver.findElements(By.xpath("//li[@qa=\"prodListAS\"]//span[@qa=\"priceAS\"]"));

        System.out.println(rows.size());
        for(
    WebElement elementa :rows)

    {
        String tamount = elementa.getText().replace(".", "");

        System.out.println(tamount);

        arr.add(Integer.parseInt(tamount));
    }
        System.out.println("Hi");
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);
        int lowest=0;
        if(rate=="low"){
     lowest = arr.get(0);}
        else if (rate=="high"){
            lowest=arr.get((rows.size()-1));
        }

        System.out.println(lowest);


    double lowest1 = lowest / 100.00;
        System.out.println(lowest1);
    double roundOff = Math.round(lowest1 * 100.00) / 100.00;
    System.out.println("roundoff value");
        System.out.println(roundOff);
    ////        checking for tomoato option click
    WebElement l_tomato = driver.findElement(By.xpath("//li[@qa=\"prodListAS\"]//span[@qa=\"priceAS\"][contains(text(),'" + roundOff + "')]/ancestor::li//p[@class=\"name ng-binding\"]"));

    WebElement check_quantity = driver.findElement(By.xpath("//li[@qa=\"prodListAS\"]//span[contains(text(),'" + roundOff + "')]/ancestor::div[@class=\"form-inline\"]/div[@class=\"form-group unit ng-binding\"]"));
    String quantityText = check_quantity.getText();
    String[] quantityText2 = quantityText.split(" ");
        System.out.println(quantityText2[0]);
//        System.out.println(quantityText2[1]);

        l_tomato.click();


        String quantity = quantityText2[0];
        int quantity1 = Integer.parseInt(quantity);

        WebElement waiting1=driver.findElement(By.xpath("//div[@class=\"sc-bxivhb lDYkc\"]"));
        wait.until(ExpectedConditions.visibilityOf(waiting1));



        WebElement waiting2=driver.findElement(By.xpath("//div[@class=\"sc-daURTG gBGtap\"]"));
        wait.until(ExpectedConditions.visibilityOf(waiting2));


        WebElement waiting3=driver.findElement(By.xpath("//div[@class=\"fade sc-dNLxif eozviY\"]"));
        wait.until(ExpectedConditions.visibilityOf(waiting3));

        WebElement add_button = driver.findElement(By.xpath("//button[@type=\"button\"]/span[text()='ADD']"));
        wait.until(ExpectedConditions.visibilityOf(add_button));

        add_button.click();
        System.out.println("inside add button is clicked");

        if(quantityText2[1].equals("gm"))

    {
        System.out.println("heyhey");

        if (quantity1 < 1000) {
            System.out.println("hey");

            int add_value = 1000 / quantity1;
            System.out.println(add_value);

//         WebElement quantity_add = driver.findElement(By.xpath("//div[@class=\"fade\"]//button[@class=\"fade sc-bbmXgH cEBnvi\"]//span[text()='ADD']"));
//         wait.until(ExpectedConditions.visibilityOf(quantity_add));
//         quantity_add.click();

//            System.out.println("once inside add was clicked");

            WebElement increment=driver.findElement(By.xpath("//button[text()='+']"));
            wait.until(ExpectedConditions.visibilityOf(increment));
//            WebElement increment_text=driver.findElement(By.xpath("//input[@type=\"text\"]/parent::div[@class=\"fade sc-gGBfsJ fpiaDy\"]//button[text()='+']"));

            for (int i = 0; i < (add_value-1 +1); i++) {
                System.out.println("i'm in loop"+i);
                Thread.sleep(5000);
//                wait.until(ExpectedConditions.visibilityOf(increment_text));
                increment.click();
            }
        }
    }

//        only for ghee for 500ml

        if(quantityText2[1].equals("ml"))

        {
            System.out.println("heyhey");

            if (quantity1!=500) {
                System.out.println("hey");
                WebElement quantity_add = driver.findElement(By.xpath("//button[@class=\"sc-fYxtnH cPQhrz\"]"));
                int add_value = 500 / quantity1;
                wait.until(ExpectedConditions.visibilityOf(quantity_add));
                for (int i = 0; i < add_value; i++) {
                    wait.until(ExpectedConditions.visibilityOf(quantity_add));
                    quantity_add.click();
                }
            }
        }

//        if(quantityText2[1].equals("ltr"))
//
//        {
//            System.out.println("heyhey");
////
////            if (quantity1!=500) {
////                System.out.println("hey");
////                WebElement quantity_add = driver.findElement(By.xpath("//button[@class=\"sc-fYxtnH cPQhrz\"]"));
////                int add_value = 500 / quantity1;
////                wait.until(ExpectedConditions.visibilityOf(quantity_add));
////                for (int i = 0; i < add_value; i++) {
////                    quantity_add.click();
//                }




        //            logo click for homePage
    WebElement logo = driver.findElement(By.xpath("//a[@class=\"sc-gzVnrw fDiOwC\"][text()='HOME']"));
        wait.until(ExpectedConditions.visibilityOf(logo));
        logo.click();
}



    public static void delay(WebDriver d,String s) throws InterruptedException
    {
        for (int i = 0; i < 3000; i++)
        {
            Thread.sleep(1);
            if (d.findElements(By.xpath(s)).size() > 0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
