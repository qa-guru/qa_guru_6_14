package guru.qa.owner;

import guru.qa.owner.config.FruitsConfig;
import guru.qa.owner.config.SeleniumConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTest {

    @Test
    public void testSystemFruits() {
        System.setProperty("github.fruits", "Apple;Orange");

        FruitsConfig config = ConfigFactory
                .create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruits())
                .containsExactly("Apple", "Orange");
    }

    @Test
    public void testSystemFruitsWithDash() {
        System.setProperty("github.fruits", "Apple,Orange");

        FruitsConfig config = ConfigFactory
                .create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsWithDash())
                .containsExactly("Apple", "Orange");
    }


    @Test
    public void testSystemFruitsWithDefaultValue() {
        FruitsConfig config = ConfigFactory
                .create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsWithDefaultValue())
                .containsExactly("Apple", "Orange", "Banana");
    }
}
