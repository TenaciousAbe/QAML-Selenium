package Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQASteps extends BaseSteps {
    public DemoQASteps(WebDriver driver) {
        super(driver);
    }
    public void abrirPaginaDemoQA() {
        webDriver.get("https://demoqa.com/text-box/");
        //imprimir("Navegando a pagina Tools QA");
    }
    //Practica 1
    public boolean validarCampoNombre(){
        boolean textboxNombre = webDriver.findElement(By.id("userName")).isDisplayed();
        return textboxNombre;
    }
    public boolean validarCampoEmail(){
        boolean textboxEmail = webDriver.findElement(By.id("userEmail")).isDisplayed();
        return textboxEmail;
    }
    public boolean validarCampoDireccionActual(){
        boolean textboxDireccionActual = webDriver.findElement(By.id("currentAddress")).isDisplayed();
        return textboxDireccionActual;
    }
    public boolean validarCampoDireccionPermanente(){
        boolean textboxDireccionPermanente = webDriver.findElement(By.id("permanentAddress")).isDisplayed();
        return textboxDireccionPermanente;
    }

    //Practica 2
    public void enviarUserName(String UserName){
        webDriver.findElement(By.id("userName")).sendKeys(UserName);
    }
    public void enviarEmail(String Email){
        webDriver.findElement(By.id("userEmail")).sendKeys(Email);
    }
    public void enviarDireccionActual(String DireccionActual){
        webDriver.findElement(By.id("currentAddress")).sendKeys(DireccionActual);
    }
    public void enviarDireccionPermanente(String DireccionPermanente){
        webDriver.findElement(By.id("permanentAddress")).sendKeys(DireccionPermanente);
    }


}
