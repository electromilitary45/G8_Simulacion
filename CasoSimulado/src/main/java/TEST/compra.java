package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author sebas
 */
public class compra {

    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sebas\\OneDrive\\Escritorio\\Fidelitas\\Calidad Automatizacion\\Git\\G8_Simulacion\\CasoSimulado\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();

        try {

            driver.findElement(By.id("cartur")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".btn-success")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("name")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("name")).sendKeys("Sebastian");
            Thread.sleep(2000);
            driver.findElement(By.id("country")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("country")).sendKeys("Costa Rica");
            Thread.sleep(2000);
            driver.findElement(By.id("city")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("city")).sendKeys("Cartago");
            Thread.sleep(2000);
            driver.findElement(By.id("card")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("card")).sendKeys("55555555");
            Thread.sleep(2000);
            driver.findElement(By.id("month")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("month")).sendKeys("03");
            Thread.sleep(2000);
            driver.findElement(By.id("year")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("year")).sendKeys("2023");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#orderModal .btn-primary")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".confirm")).click();

            driver.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        driver.quit();
    }
}
