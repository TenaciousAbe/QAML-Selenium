import Steps.BaseSteps;
import Steps.GoogleSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
    private WebDriver webDriver = getWebDriver();
    private GoogleSteps googleSteps = new GoogleSteps(webDriver);
    private BaseSteps baseSteps = new BaseSteps(webDriver);

    @Test
    public void openGoogleTest(){
        googleSteps.abrirPaginaGoogle();
        String urlActual = baseSteps.getURLActual();
        System.out.println("La URL actual es: " + urlActual);
        Assert.assertEquals(urlActual, "https://www.google.com/");
        //baseSteps.cerrarVentana();
        baseSteps.finalizarWebDriver();
    }
    @Test
    public void titleGoogleTest(){
        googleSteps.abrirPaginaGoogle();
        String urlActual = baseSteps.getURLActual();
        String tituloActual = baseSteps.getTituloActual();
        //String codigoFuenteActual = baseSteps.getCodigoFuente();
        System.out.println("La URL actual es: " + urlActual);
        System.out.println("La Titulo actual es: " + tituloActual);
        //System.out.println("La Codigo actual es: " + codigoFuenteActual);
        Assert.assertEquals(urlActual, "https://www.google.com/");
        Assert.assertEquals(tituloActual, "Google");
        //baseSteps.cerrarVentana();
        baseSteps.finalizarWebDriver();
    }
//titulo, url, codigo fuente
}
