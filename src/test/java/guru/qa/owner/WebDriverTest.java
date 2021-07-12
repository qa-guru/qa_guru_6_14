package guru.qa.owner;

import guru.qa.owner.config.SeleniumConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverTest {

    private SeleniumConfig config = ConfigFactory
            .create(SeleniumConfig.class, System.getProperties());

    @Test
    public void testWebDriver() throws Exception {
        final WebDriver driver = createWebDriver();
        driver.get("https://github.com");
        Thread.sleep(5000);
        driver.quit();
    }

    private WebDriver createWebDriver() {
        if (config.isRemote()) {
            return new RemoteWebDriver(
                    config.getRemoteUrl(),
                    DesiredCapabilities.chrome()
            );
        } else {
            return new ChromeDriver();
        }
    }
}
