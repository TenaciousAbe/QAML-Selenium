package Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeAutomationSteps extends BaseSteps{
    public PracticeAutomationSteps(WebDriver driver) {
        super(driver);
    }
    //Practica 3
    public void abrirPaginaPractice() {
        webDriver.get("https://practicetestautomation.com/practice-test-login/");
        //imprimir("Navegando a pagina Practice Test Automation");
    }
    public void enviarUserName(String User){
        webDriver.findElement(By.id("username")).sendKeys(User);
    }
    public void enviarEmail(String Pwd){
        webDriver.findElement(By.id("password")).sendKeys(Pwd);
    }
    public void presionarEnviar(){
        webDriver.findElement(By.id("submit")).click();
    }
}
