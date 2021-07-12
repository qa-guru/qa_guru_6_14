package guru.qa.owner.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface ProxiesConfig extends Config {

    @Key("github.proxy")
    @DefaultValue("127.0.0.1:4444")
    @ConverterClass(ProxyConverter.class)
    Proxy getProxy();

    @Key("github.proxies")
    @Separator(",")
    @DefaultValue("127.0.0.1:4444,127.0.0.1:4445")
    @ConverterClass(ProxyConverter.class)
    List<Proxy> getProxies();
}
