package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Naza
 */
public class carrito {
    public static void main(String[] args) {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sebas\\OneDrive\\Escritorio\\Fidelitas\\Calidad Automatizacion\\Git\\G8_Simulacion\\CasoSimulado\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();

        try {
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)", "");

            driver.findElement(By.linkText("Samsung galaxy s6")).click();
            Thread.sleep(2000);

            if (driver.findElement(By.id("more-information")).isDisplayed()) {
                driver.findElement(By.linkText("Add to cart")).click();
                Thread.sleep(2000);
            } else {
                System.out.println("Error");
            }
            
            driver.switchTo().alert().accept();
            Thread.sleep(2000);

            driver.findElement(By.linkText("Cart")).click();
            Thread.sleep(2000);
            
        }catch(InterruptedException e){
            System.out.println(e);
        }
        driver.quit();
    }
}
