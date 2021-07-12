package guru.qa.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface SeleniumConfig extends Config {

    @DefaultValue("http://selenoid:4444/wd/hub")
    @Key("webdriver.remote.url")
    URL getRemoteUrl();

    @DefaultValue("false")
    @Key("webdriver.remote")
    boolean isRemote();

}
