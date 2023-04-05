package TEST;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class login {

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
        String user="electro";
        String pass="electro";


        try {
            //SELECCION DE INPUTS DE INCIO DE SESION
            WebElement loginBTN = driver.findElement(By.id("login2"));
            WebElement userInput = driver.findElement(By.id("loginusername"));
            WebElement passInput = driver.findElement(By.id("loginpassword"));

            //loca por clase
            WebElement loginBTN2 = driver.findElement(By.className("btn-primary"));
            Thread.sleep(1000);

            //loca por name
            //WebElement loginBTN2 = driver.findElement(By.name("btn-primary"));
            WebElement l = driver.findElement(By.xpath("//*[@id=\"login2\"]"));
            Thread.sleep(1000);
            WebElement log = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
            Thread.sleep(1000);
            //loca css
            //WebElement l2 = driver.findElement(By.cssSelector("a.nav-link"));

            //--LOGIN--
            l.click();

            Thread.sleep(1000);



            wait.until(ExpectedConditions.visibilityOf(userInput));
            userInput.sendKeys(user);
            passInput.sendKeys(pass);
            Thread.sleep(1000);
            log.click();
            Thread.sleep(1000);
            System.out.println("SESION INCIADA CON EXITO");

        }catch (Exception e){
            System.out.println(e);
        }




        driver.close();
    }
}
