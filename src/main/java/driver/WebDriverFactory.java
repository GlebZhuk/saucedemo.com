package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Listeners;
import utils.Waiter;

import java.time.Duration;

@Listeners(TestListener.class)
public class WebDriverFactory {

    private WebDriverFactory() {
    }

    public static WebDriver getWebDriver() {
        WebDriver driver = null;
        switch (System.getProperty("browser", "chrome")) {
            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            case "opera": {
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            }
            default: {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                chromeOptions.addArguments("--remote-allow-origins=*");
                chromeOptions.setHeadless(true); //Браузер работает скрыто
                driver = new ChromeDriver(chromeOptions);
            }
        }
        Waiter waiter = new Waiter();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Waiter.WAIT_2_SECONDS));
        return driver;
    }
}
