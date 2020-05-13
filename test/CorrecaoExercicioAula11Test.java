/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author marcelo.soares
 */
public class CorrecaoExercicioAula11Test {
    
      static WebDriver driver = null;
      
      private static String namePaginaPrincipal ;
    
     public CorrecaoExercicioAula11Test() {
    }
    
    @BeforeClass
    public static void setUp() {
         System.setProperty("webdriver.chrome.driver", 
	                "C:\\chromedriver_win32\\chromedriver.exe");
	        
        
         driver = new ChromeDriver();

        driver.get("C:\\Users\\marcelo.soares\\eclipse-workspace\\senai_2020_qts\\src\\correcao_exercicio_aula11.html");
    
        namePaginaPrincipal = driver.getWindowHandle();
    }
    
    
    
    @Test
    public void testTituloPagina(){
      driver.get("C:\\Users\\marcelo.soares\\eclipse-workspace\\senai_2020_qts\\src\\correcao_exercicio_aula11.html");
      String tituloExperado ="Exercicio"; 
        
      Assert.assertEquals(tituloExperado,driver.getTitle());
    }
    
    
    @Test
    public void testCorpoPagina() {
    	driver.get("C:\\Users\\marcelo.soares\\eclipse-workspace\\senai_2020_qts\\src\\correcao_exercicio_aula11.html");
    	String corpoSaidaExperada = "Este é um exercicio de Selenium";
    	Assert.assertTrue(driver.getPageSource().contains(corpoSaidaExperada));
    }
    
    @Test
    public void testLabelBotao() {
    	driver.get("C:\\Users\\marcelo.soares\\eclipse-workspace\\senai_2020_qts\\src\\correcao_exercicio_aula11.html");
    	String saidaExperada = "botao teste";
    	 WebElement botao = driver.findElement(By.id("botao"));

    	 Assert.assertEquals(saidaExperada,botao.getAttribute("value"));    	 
    }
    

    
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
    
}
