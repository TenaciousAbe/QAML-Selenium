import Steps.PracticeAutomationSteps;
import Steps.DemoQASteps;
import Steps.GoogleSteps;
import Steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAutomationTest extends BaseTest {
    private WebDriver webDriver = getWebDriver();
    private PracticeAutomationSteps practiceAutomationSteps = new PracticeAutomationSteps(webDriver);
    @Test //Practica 3
    public void loginPagina(){
        practiceAutomationSteps.abrirPaginaPractice();
        practiceAutomationSteps.enviarUserName("student");
        practiceAutomationSteps.enviarEmail("Password123");
        practiceAutomationSteps.presionarEnviar();
        String urlActual = practiceAutomationSteps.getURLActual();
        Assert.assertTrue(urlActual.contains("https://practicetestautomation.com/logged-in-successfully/"));
        String contenidoActual = practiceAutomationSteps.getCodigoFuente();
        Assert.assertTrue(contenidoActual.contains("Logged In Successfully"));
    }
}
