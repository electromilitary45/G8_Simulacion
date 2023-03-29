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
        String user="electro2";
        String pass="electro";


        try {
            //SELECCION DE INPUTS DE INCIO DE SESION
            WebElement signupBTN = driver.findElement(By.id("signin2"));
            Thread.sleep(2000);
            WebElement userInput = driver.findElement(By.id("sign-username"));
            Thread.sleep(2000);
            WebElement passInput = driver.findElement(By.id("sign-password"));
            Thread.sleep(2000);

            //loca por clase
            WebElement loginBTN2 = driver.findElement(By.className("btn-primary"));
            Thread.sleep(2000);
            //loca por name
            //WebElement loginBTN2 = driver.findElement(By.name("btn-primary"));

            WebElement sigup = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[2]"));
            Thread.sleep(2000);
            //loca css
            //WebElement l2 = driver.findElement(By.cssSelector("a.nav-link"));

            //--LOGIN--
            signupBTN.click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOf(userInput));
            Thread.sleep(2000);
            userInput.sendKeys(user);
            Thread.sleep(2000);
            passInput.sendKeys(pass);
            Thread.sleep(2000);
            sigup.click();
            Thread.sleep(2000);
            System.out.println("REGISTRO EXITO");

        }catch (Exception e){
            System.out.println(e);
        }

        driver.close();
    }
}
