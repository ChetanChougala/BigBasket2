import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_basket {
    public static void main(String args[]) throws InterruptedException

    {

        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,200);
        ArrayList<Integer> arr=new ArrayList<Integer>();

        String base_URL="https://www.bigbasket.com/";
        driver.get(base_URL);

        WebElement homeLogo=driver.findElement(By.xpath("//a[@title=\"Bigbasket\"]"));
        wait.until(ExpectedConditions.visibilityOf(homeLogo));
        homeLogo.click();


//        Search bar

        WebElement search_Opt=driver.findElement(By.xpath("//input[@placeholder=\"Search for Products..\"]"));
        search_Opt.sendKeys("Tomato local");

//        check for dropdown-menu
        WebElement inSearch=driver.findElement(By.xpath("//div[@class=\"search-result\"]/p[text()='Showing results for ']"));
        wait.until(ExpectedConditions.visibilityOf(inSearch));

        Thread.sleep(2000);

            List<WebElement> rows = driver.findElements(By.xpath("//li[@qa=\"prodListAS\"]//span[@qa=\"priceAS\"]"));

            System.out.println(rows.size());
            for (WebElement elementa : rows) {
                String tamount = elementa.getText().replace(".", "");

                System.out.println(tamount);

                arr.add(Integer.parseInt(tamount));
            }
            System.out.println("Hi");
            System.out.println(arr);

            Collections.sort(arr);
            System.out.println(arr);
            int lowest = arr.get(0);
            System.out.println(lowest);


            int lowest1 = lowest / 100;
            System.out.println(lowest1);
            double roundOff = Math.round(lowest1 * 100.0) / 100.0;
            System.out.println(roundOff);
////        checking for tomoato option click
            WebElement l_tomato = driver.findElement(By.xpath("//li[@qa=\"prodListAS\"]//span[@qa=\"priceAS\"][contains(text(),'" + roundOff + "')]/ancestor::li//p[@class=\"name ng-binding\"]"));

            WebElement check_quantity = driver.findElement(By.xpath("//li[@qa=\"prodListAS\"]//span[contains(text(),'" + roundOff + "')]/ancestor::div[@class=\"form-inline\"]/div[@class=\"form-group unit ng-binding\"]"));
            String quantityText = check_quantity.getText();
            String[] quantityText2 = quantityText.split(" ");
            System.out.println(quantityText2[0]);
            System.out.println(quantityText2[1]);

            l_tomato.click();

            WebElement add_button = driver.findElement(By.xpath("//button[@type=\"button\"]/span[text()='ADD']"));
            wait.until(ExpectedConditions.visibilityOf(add_button));


            String quantity = quantityText2[0];
            int quantity1 = Integer.parseInt(quantity);

//            click once addToCart
            add_button.click();

            if (quantityText2[1].equals("gm")) {
                System.out.println("heyhey");

                if (quantity1 < 1000) {
                    System.out.println("hey");
                    WebElement quantity_add = driver.findElement(By.xpath("//button[@class=\"sc-fYxtnH cPQhrz\"]"));
                    int add_value = 1000 / quantity1;
                    wait.until(ExpectedConditions.visibilityOf(quantity_add));
                    for (int i = 0; i < add_value; i++) {
                        quantity_add.click();
                    }
                }
            }


//            logo click for homePage
            WebElement logo = driver.findElement(By.xpath("//a[@class=\"sc-gzVnrw fDiOwC\"][text()='HOME']"));
            wait.until(ExpectedConditions.visibilityOf(logo));
            logo.click();

//
//
////
//
//
//
//
//
//
//
//
//
// checking for tomoato option click
//        WebElement h_tomato=driver.findElement(By.xpath("//p[text()=' - Hybrid']/b[text()='Tomato']"));
//        wait.until(ExpectedConditions.visibilityOf(h_tomato)).click();

//        Thread.sleep(5000);
        WebElement search_Opt2=driver.findElement(By.xpath("//input[@qa=\"searchBar\"]"));
        wait.until(ExpectedConditions.visibilityOf(search_Opt2));
        search_Opt2.sendKeys("Tomato hybrid");

        WebElement inSearch2=driver.findElement(By.xpath("//div[@class=\"search-result\"]/p[text()='Showing results for ']"));
        wait.until(ExpectedConditions.visibilityOf(inSearch2));

        Thread.sleep(2000);

        List<WebElement> rows2 = driver.findElements(By.xpath("//li[@qa=\"prodListAS\"]//span[@qa=\"priceAS\"]"));






























//
////        checking for tomoato option click
//        WebElement c_tomato=driver.findElement(By.xpath("//p[text()='o - Cherry']/b[text()='Tomat']"));
//        wait.until(ExpectedConditions.visibilityOf(c_tomato)).click();
//
//
//
//
//        Thread.sleep(5000);
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
