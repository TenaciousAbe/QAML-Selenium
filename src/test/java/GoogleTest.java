import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
    private WebDriver webDriver = getWebDriver();

    @Test
    public void openGoogleTest(){
        webDriver.get("https://www.google.com/");
        String urlActual = webDriver.getCurrentUrl();
        System.out.println("La URL actual es: ");

    }
}
