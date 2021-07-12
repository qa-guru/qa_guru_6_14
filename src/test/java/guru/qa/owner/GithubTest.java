package guru.qa.owner;

import com.codeborne.selenide.Configuration;
import guru.qa.owner.config.TestingWebConfig;
import guru.qa.owner.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class GithubTest {

    WebConfig config = ConfigFactory
            .create(WebConfig.class, System.getProperties());

    @Test
    public void authByUsernameAndPassword() throws Exception {
        Configuration.baseUrl = config.getBaseUrl();

        open("/login");
        $("#login_field").sendKeys(config.getUsername());
        $("#password").sendKeys(config.getPassword());

        sleep(3000);
    }

}
