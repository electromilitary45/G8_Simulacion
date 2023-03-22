/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.simulacion.TEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author Derek
 */
public class registro {
    
    public static void main(String[] args){
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Derek\\Documents\\REPOSITORIOS\\G8_Simulacion\\CasoSimulacion\\src\\main\\resources\\drivers\\chromedriver.exe");
        
        //inicializacion del browser
        WebDriver driver = new ChromeDriver();
        
        //abrir pagina prueba
        driver.get("https://outlook.live.com/owa/");
        
        
        driver.manage().window().maximize();
        
    }//fin main
    
}//fin class
