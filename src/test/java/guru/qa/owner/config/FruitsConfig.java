package guru.qa.owner.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Separator(";")
    @Key("github.fruits")
    List<String> getFruits();

    @Separator(",")
    @Key("github.fruits")
    List<String> getFruitsWithDash();

    @Separator(",")
    @Key("github.fruits")
    @DefaultValue("Apple,Orange,Banana")
    List<String> getFruitsWithDefaultValue();
}
