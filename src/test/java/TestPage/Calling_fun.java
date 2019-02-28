package TestPage;

import BasePage.Functions_defined;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Calling_fun extends Functions_defined {


    @Test
    public void fn() throws InterruptedException{
        fromAddress("//input[@tabindex=4]"," Bangalore ");
        ToAddress("//input[@tabindex=5]"," Delhi ");
        date("//input[@etitle='Depart Date']"," 28/02/2019 ");
        search("//input[@id='SearchBtn']");
        delay(driver,"//button[@ class='booking ']");
        dropDown();
        unknown("//th[@id='BaggageBundlingTemplate']/span[@data-pr='"+arr.get(0)+"']/following::button[@class='booking']");
        delay(driver,"//input[@ id='itineraryBtn']");
        accept_key("//input[@ id='insurance_confirm']");
        continueBooking("//input[@ id='itineraryBtn']");
        delay(driver,"//input[@id='LoginContinueBtn_1']");
        email("//input[@etitle='Your email address']","d2r@gmail.com","//input[@id='LoginContinueBtn_1']");
        delay(driver,"//input[@id='travellerBtn']");
        title("//select[@name='AdultTitle1']","//select[@name='AdultTitle1']/option[@value='Mr']");
        first_last_name("//input[@id='AdultFname1']","chetan ","//input[@name='AdultLname1']");
        mobile_no("//input[@id='mobileNumber']","+91 8880001118","//input[@id='travellerBtn']");
        payment("//input[@id=\"paymentSubmit\"]");
    }

}

