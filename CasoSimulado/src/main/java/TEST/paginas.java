package TEST;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author sebas
 */
public class paginas {

    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sebas\\OneDrive\\Escritorio\\Fidelitas\\Calidad Automatizacion\\Git\\G8_Simulacion\\CasoSimulado\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();

        try {
            {
                WebElement element = driver.findElement(By.linkText("Next"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            {
                WebElement element = driver.findElement(By.tagName("body"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element, 0, 0).perform();
            }
            driver.findElement(By.id("next2")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.findElement(By.id("prev2")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.findElement(By.id("prev2")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            driver.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        driver.quit();
    }
}