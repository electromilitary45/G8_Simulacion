package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contacto {

    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sebas\\eclipse-workspace\\TrabajoGrupalCalidad\\src\\test\\resources\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/cart.html");
        driver.manage().window().maximize();

        try {
            driver.findElement(By.linkText("Contact")).click();
            {
                WebElement element = driver.findElement(By.linkText("Contact"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            {
                WebElement element = driver.findElement(By.tagName("body"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element, 0, 0).perform();
            }
            driver.findElement(By.id("recipient-email")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("recipient-email")).sendKeys("avjimenz@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.id("recipient-name")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("recipient-name")).sendKeys("Avril");
            Thread.sleep(2000);
            driver.findElement(By.id("message-text")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("message-text")).sendKeys("Buenas tardes.");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#exampleModal .btn-primary")).click();
            Thread.sleep(2000);
            driver.close();
            System.out.println("Contacto");
        } catch (Exception e) {
            System.out.println(e);
        }
        driver.quit();
    }
}