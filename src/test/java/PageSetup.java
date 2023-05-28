import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSetup {

    private String projectLocation = System.getProperty("user.dir");
    private ChromeDriver driver;

    @BeforeEach
    public void startSession() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",projectLocation + "/Resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/automation/");
        Thread.sleep(2000);
    }

    @AfterEach
    public void endSession()
    {
        driver.close();
    }
}
