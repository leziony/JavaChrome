import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import java.util.ArrayList;
import java.util.List;

public class UltimateQATest extends PageSetup{

    @Test
    public void testButton() throws InterruptedException {
        WebElement tester = driver.findElementById("idExample");
        tester.click();
        Thread.sleep(500);
        WebElement success = driver.findElementByClassName("entry-title");
        Thread.sleep(500);
        Assertions.assertEquals("Button success",success.getText());
    }

    @Test
    public void writeIn() throws InterruptedException {
        WebElement tester1 = driver.findElementByName("et_pb_contact_name_0");
        WebElement tester2 = driver.findElementByName("et_pb_contact_email_0");
        WebElement tester3 = driver.findElementByName("et_builder_submit_button");
        tester1.sendKeys("Mati");
        Thread.sleep(600);
        tester2.sendKeys("matmat@example.com");
        Thread.sleep(600);
        tester3.click();
        Thread.sleep(2250);
        WebElement success = driver.findElementByClassName("et-pb-contact-message");
        Assertions.assertEquals("Thanks for contacting us",success.getText());

    }

    @Test
    public void colorCheck(){
        WebElement testcolor = driver.findElementByXPath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div[3]/div/div[1]/div[2]");
        Assertions.assertEquals("rgba(46, 163, 242, 1)",testcolor.getCssValue("background-color"));

    }
    @Test
    public void dropdownCheck() throws InterruptedException {
        List<String> cars= new ArrayList<>();
        cars.add("volvo");
        cars.add("saab");
        cars.add("opel");
        cars.add("audi");
        WebElement dropdown;
        for (String i:cars
             ) {
            Thread.sleep(600);
            dropdown = driver.findElementByXPath("//*[@value='" + i.toLowerCase() +"']");
            dropdown.click();
            Assertions.assertTrue(dropdown.isSelected());

        }


    }
}
