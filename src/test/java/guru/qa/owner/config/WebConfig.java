package guru.qa.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "vault:/path/to/file",
        "classpath:local.properties"
})
@Config.LoadPolicy(Config.LoadType.MERGE)
public interface WebConfig extends Config {

    @Key("github.base.url")
    String getBaseUrl();

    @Key("github.username")
    String getUsername();

    @Key("github.password")
    String getPassword();

}
