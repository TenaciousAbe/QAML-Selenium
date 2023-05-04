import Steps.DemoQASteps;
import Steps.GoogleSteps;
import Steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQATest extends BaseTest {
    private WebDriver webDriver = getWebDriver();
    private DemoQASteps demoQASteps = new DemoQASteps(webDriver);
    @Test //Practica 1
    public void validarCampos(){
        demoQASteps.abrirPaginaDemoQA();
        Assert.assertEquals(demoQASteps.validarCampoNombre(), true);
        Assert.assertEquals(demoQASteps.validarCampoEmail(), true);
        Assert.assertEquals(demoQASteps.validarCampoDireccionActual(), true);
        Assert.assertEquals(demoQASteps.validarCampoDireccionPermanente(), true);
    }
    @Test //Practica 2
    public void llenarFormularioTest (){
        demoQASteps.abrirPaginaDemoQA();
        demoQASteps.enviarUserName("Abe Miranda");
        demoQASteps.enviarEmail("abe@bitcentral.com");
        demoQASteps.enviarDireccionActual("Direccion Actual");
        demoQASteps.enviarDireccionPermanente("Direccion Permanente");
    }
}
