import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSetup {

    String projectLocation = System.getProperty("user.dir");
    ChromeDriver driver;

    @BeforeEach
    public void startSession() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",projectLocation + "/Resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        Thread.sleep(450);
    }

    @AfterEach
    public void endSession()
    {
        driver.close();
    }
}
