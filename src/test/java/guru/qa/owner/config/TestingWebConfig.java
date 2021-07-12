package guru.qa.owner.config;

public class TestingWebConfig implements WebConfig {

    public String getBaseUrl() {
        return "https://testing.github.com";
    }

    public String getUsername() {
        return "testing-testuser";
    }

    public String getPassword() {
        return "testing-testpassword";
    }

}
