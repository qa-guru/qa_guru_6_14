package guru.qa.owner.config;

public class ProductionWebConfig implements WebConfig {

    public String getBaseUrl() {
        return "https://github.com";
    }

    public String getUsername() {
        return "testuser";
    }

    public String getPassword() {
        return "testpassword";
    }

}
