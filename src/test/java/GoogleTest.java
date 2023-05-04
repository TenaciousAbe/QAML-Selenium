import Steps.GoogleSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
    private WebDriver webDriver = getWebDriver();
    private GoogleSteps googleSteps = new GoogleSteps(webDriver);
    //private BaseSteps baseSteps = new BaseSteps(webDriver);

    @Test
    public void openGoogleTest(){
        googleSteps.abrirPaginaGoogle();
        String urlActual = googleSteps.getURLActual();
        System.out.println("La URL actual es: " + urlActual);
        Assert.assertEquals(urlActual, "https://www.google.com/");
        //baseSteps.cerrarVentana();
        googleSteps.finalizarWebDriver();
    }
    @Test //Ejercicio 2 - Tarea 3
    //titulo, url, codigo fuente
    public void titleGoogleTest(){
        googleSteps.abrirPaginaGoogle();
        String urlActual = googleSteps.getURLActual();
        String tituloActual = googleSteps.getTituloActual();
        //String codigoFuenteActual = baseSteps.getCodigoFuente();
        System.out.println("La URL actual es: " + urlActual);
        System.out.println("La Titulo actual es: " + tituloActual);
        //System.out.println("La Codigo actual es: " + codigoFuenteActual);
        Assert.assertEquals(urlActual, "https://www.google.com/");
        Assert.assertEquals(tituloActual, "Google");
        //baseSteps.cerrarVentana();
        googleSteps.finalizarWebDriver();
    }
    @Test //Trabajo clase 03/05/23
    public void moveGoogleTest(){
        //Google
        String urlExpected = "https://www.google.com/";
        googleSteps.abrirPaginaGoogle();
        String urlActual = googleSteps.getURLActual();
        googleSteps.imprimir(urlActual);
        Assert.assertEquals(urlActual, urlExpected);

        //Facebook
        String getTituloFacebookExpected = "Facebook - log in or sign up";
        googleSteps.navegarPaginaFacebook();
        String getTituloFacebookActual = googleSteps.getTituloActual();
        googleSteps.imprimir(getTituloFacebookActual);
        Assert.assertEquals(getTituloFacebookActual, getTituloFacebookExpected);

        //ESPN
        String urlExpectedESPNExpected = "https://www.espn.com.mx/";
        googleSteps.navegarPaginaESPN();
        String urlActualESPNActual = googleSteps.getURLActual();
        googleSteps.imprimir(urlActualESPNActual);
        Assert.assertEquals(urlActualESPNActual, urlExpectedESPNExpected);

        //Facebook
        webDriver.navigate().back();
        googleSteps.imprimir(googleSteps.getTituloActual());
        Assert.assertEquals(googleSteps.getTituloActual(), getTituloFacebookExpected);

        //Google
        webDriver.navigate().back();
        googleSteps.imprimir(googleSteps.getURLActual());
        Assert.assertEquals(googleSteps.getURLActual(), urlExpected);

        googleSteps.finalizarWebDriver();
    }
}
