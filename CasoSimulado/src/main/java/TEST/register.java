package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class register {
    public static void main(String[] args){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Derek\\Documents\\REPOSITORIOS\\G8_Simulacion\\CasoSimulado\\src\\main\\resources\\drivers\\chromedriver.exe");
        //initialize web driver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        //abrir pagina
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();

        //varibles de sesion
        String user="electro1";
        String pass="electro";


        try {
            //SELECCION DE INPUTS DE INCIO DE SESION
            WebElement signupBTN = driver.findElement(By.id("signin2"));
            WebElement userInput = driver.findElement(By.id("sign-username"));
            WebElement passInput = driver.findElement(By.id("sign-password"));

            //loca por clase
            WebElement loginBTN2 = driver.findElement(By.className("btn-primary"));

            //loca por name
            //WebElement loginBTN2 = driver.findElement(By.name("btn-primary"));

            WebElement sigup = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[2]"));
            //loca css
            //WebElement l2 = driver.findElement(By.cssSelector("a.nav-link"));

            //--LOGIN--
            signupBTN.click();
            wait.until(ExpectedConditions.visibilityOf(userInput));
            userInput.sendKeys(user);
            passInput.sendKeys(pass);
            sigup.click();
            System.out.println("REGISTRO EXITO");

        }catch (Exception e){
            System.out.println(e);
        }

        driver.close();
    }
}
