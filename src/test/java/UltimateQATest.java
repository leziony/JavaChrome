import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

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



}
