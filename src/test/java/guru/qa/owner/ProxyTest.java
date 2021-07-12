package guru.qa.owner;

import guru.qa.owner.config.FruitsConfig;
import guru.qa.owner.config.ProxiesConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProxyTest {

    @Test
    public void testProxy() {
        ProxiesConfig config = ConfigFactory
                .create(ProxiesConfig.class, System.getProperties());

        assertThat(config.getProxy().host)
                .isEqualTo("127.0.0.1");
        assertThat(config.getProxy().port)
                .isEqualTo(4444);
    }

    @Test
    public void testProxyList() {
        ProxiesConfig config = ConfigFactory
                .create(ProxiesConfig.class, System.getProperties());

        assertThat(config.getProxies())
                .hasSize(2);
    }
}
