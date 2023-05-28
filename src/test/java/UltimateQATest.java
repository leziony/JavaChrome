import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class UltimateQATest extends PageSetup{

    //tester
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

}
