package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class about {

    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sebas\\OneDrive\\Escritorio\\Fidelitas\\Calidad Automatizacion\\Git\\G8_Simulacion\\CasoSimulado\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();

        try {
            driver.findElement(By.linkText("About us")).click();
            driver.findElement(By.cssSelector(".vjs-big-play-button > .vjs-icon-placeholder")).click();
            driver.findElement(By.cssSelector(".vjs-play-control > .vjs-icon-placeholder")).click();
            driver.findElement(By.cssSelector(".vjs-play-control > .vjs-icon-placeholder")).click();
            driver.findElement(By.cssSelector(".vjs-mute-control > .vjs-icon-placeholder")).click();
            driver.findElement(By.cssSelector(".vjs-mute-control > .vjs-icon-placeholder")).click();
            driver.findElement(By.cssSelector(".vjs-fullscreen-control > .vjs-icon-placeholder")).click();
            driver.findElement(By.cssSelector(".vjs-fullscreen-control > .vjs-icon-placeholder")).click();
            driver.findElement(By.cssSelector("#videoModal .btn")).click();
            driver.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        driver.quit();
    }

}
