import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
public class BaseTest {
    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        File ruta = new File("/Users/abe/Documents/geckodriver-v0.33.0-macos-aarch64/geckodriver");
        System.setProperty("webdriver.gecko.driver", ruta.getPath());
        webDriver = new FirefoxDriver();
        return webDriver;
    }


}
