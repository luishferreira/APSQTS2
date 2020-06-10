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

public class APSQTS {
     static WebDriver driver = null;
     private static String namePaginaPrincipal ;
     public APSQTS() {
    }
    
    @BeforeClass
    public static void setUp() {
         System.setProperty("webdriver.chrome.driver", 
	                "C:\\Users\\Keita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");        
         driver = new ChromeDriver();
        driver.get("C:\\Users\\Keita\\Downloads\\trabalho2-1.html");
        namePaginaPrincipal = driver.getWindowHandle();
    }
    
    @Test
    public void testTituloPagina(){
      driver.get("C:\\Users\\Keita\\Downloads\\trabalho2-1.html");
      Assert.assertEquals("Trabalho 2-1",driver.getTitle());
    }
    
    @Test
    public void testNomeValido() {
    	driver.get("C:\\Users\\Keita\\Downloads\\trabalho2-1.html");
    	WebElement input1 = driver.findElement(By.id("nome"));
    	WebElement input2 = driver.findElement(By.id("endereco"));
    	WebElement input3 = driver.findElement(By.id("sexo"));
    	WebElement input4 = driver.findElement(By.id("idade"));
    	WebElement botaoEnviar = driver.findElement(By.id("botao_somar"));
    	WebElement resultado = driver.findElement(By.id("resultado"));
    	input1.sendKeys("Luis Henrique");
    	input2.sendKeys("Avenida Assis Brasil");
    	input3.sendKeys("m");
    	input4.sendKeys("18");
    	botaoEnviar.click();
    	Alert alert = driver.switchTo().alert();
    	Assert.assertEquals(alert.getText(), "Cadastro realizado com sucesso");
    	alert.accept();
    }
    
    @Test
    public void testNomeInvalido() {
    	driver.get("C:\\Users\\Keita\\Downloads\\trabalho2-1.html");
    	WebElement input1 = driver.findElement(By.id("nome"));
    	WebElement input2 = driver.findElement(By.id("endereco"));
    	WebElement input3 = driver.findElement(By.id("sexo"));
    	WebElement input4 = driver.findElement(By.id("idade"));
    	WebElement botaoEnviar = driver.findElement(By.id("botao_somar"));
    	WebElement resultado = driver.findElement(By.id("resultado"));
    	input1.sendKeys("");
    	input2.sendKeys("Avenida Assis Brasil");
    	input3.sendKeys("m");
    	input4.sendKeys("18");
    	botaoEnviar.click();
    	Assert.assertEquals(resultado.getText(), "Preencha o campo nome");
    }
    @Test
    public void testEnderecoValido() {
    	driver.get("C:\\Users\\Keita\\Downloads\\trabalho2-1.html");
    	WebElement input1 = driver.findElement(By.id("nome"));
    	WebElement input2 = driver.findElement(By.id("endereco"));
    	WebElement input3 = driver.findElement(By.id("sexo"));
    	WebElement input4 = driver.findElement(By.id("idade"));
    	WebElement botaoEnviar = driver.findElement(By.id("botao_somar"));
    	input1.sendKeys("Luis Henrique");
    	input2.sendKeys("Avenida Assis Brasil");
    	input3.sendKeys("m");
    	input4.sendKeys("18");
    	botaoEnviar.click();
    	Alert alert = driver.switchTo().alert();
    	Assert.assertEquals(alert.getText(), "Cadastro realizado com sucesso");
    	alert.accept();
    }
    
    @Test
    public void testEnderecoInvalido() {
    	driver.get("C:\\Users\\Keita\\Downloads\\trabalho2-1.html");
    	WebElement input1 = driver.findElement(By.id("nome"));
    	WebElement input2 = driver.findElement(By.id("endereco"));
    	WebElement input3 = driver.findElement(By.id("sexo"));
    	WebElement input4 = driver.findElement(By.id("idade"));
    	WebElement botaoEnviar = driver.findElement(By.id("botao_somar"));
    	WebElement resultado = driver.findElement(By.id("resultado"));
    	input1.sendKeys("Luis Henrique");
    	input2.sendKeys("");
    	input3.sendKeys("m");
    	input4.sendKeys("18");
    	botaoEnviar.click();
    	Assert.assertEquals(resultado.getText(), "Preencha o campo endereco");
    }
    
    @Test
    public void testSexoValido() {
    	driver.get("C:\\Users\\Keita\\Downloads\\trabalho2-1.html");
    	WebElement input1 = driver.findElement(By.id("nome"));
    	WebElement input2 = driver.findElement(By.id("endereco"));
    	WebElement input3 = driver.findElement(By.id("sexo"));
    	WebElement input4 = driver.findElement(By.id("idade"));
    	WebElement botaoEnviar = driver.findElement(By.id("botao_somar"));
    	input1.sendKeys("Luis Henrique");
    	input2.sendKeys("Avenida Assis Brasil");
    	input3.sendKeys("m");
    	input4.sendKeys("18");
    	botaoEnviar.click();
    	Alert alert = driver.switchTo().alert();
    	Assert.assertEquals(alert.getText(), "Cadastro realizado com sucesso");
    	alert.accept();
    	
    }
    
    @Test
    public void testSexoInvalido() {
    	driver.get("C:\\Users\\Keita\\Downloads\\trabalho2-1.html");
    	WebElement input1 = driver.findElement(By.id("nome"));
    	WebElement input2 = driver.findElement(By.id("endereco"));
    	WebElement input3 = driver.findElement(By.id("sexo"));
    	WebElement input4 = driver.findElement(By.id("idade"));
    	WebElement botaoEnviar = driver.findElement(By.id("botao_somar"));
    	WebElement resultado = driver.findElement(By.id("resultado"));
    	input1.sendKeys("Luis Henrique");
    	input2.sendKeys("Avenida Assis Brasil");
    	input3.sendKeys("...");
    	input4.sendKeys("18");
    	botaoEnviar.click();
    	Assert.assertEquals(resultado.getText(), "Selecione um valor para o campo sexo");
    }
    
    @Test
    public void testIdadeValida() {
    	driver.get("C:\\Users\\Keita\\Downloads\\trabalho2-1.html");
    	WebElement input1 = driver.findElement(By.id("nome"));
    	WebElement input2 = driver.findElement(By.id("endereco"));
    	WebElement input3 = driver.findElement(By.id("sexo"));
    	WebElement input4 = driver.findElement(By.id("idade"));
    	WebElement botaoEnviar = driver.findElement(By.id("botao_somar"));
    	input1.sendKeys("Luis Henrique");
    	input2.sendKeys("Avenida Assis Brasil");
    	input3.sendKeys("m");
    	input4.sendKeys("18");
    	botaoEnviar.click();
    	Alert alert = driver.switchTo().alert();
    	Assert.assertEquals(alert.getText(), "Cadastro realizado com sucesso");
    	alert.accept();
    }
    
    @Test
    public void testIdadeInvalida() {
    	driver.get("C:\\Users\\Keita\\Downloads\\trabalho2-1.html");
    	WebElement input1 = driver.findElement(By.id("nome"));
    	WebElement input2 = driver.findElement(By.id("endereco"));
    	WebElement input3 = driver.findElement(By.id("sexo"));
    	WebElement input4 = driver.findElement(By.id("idade"));
    	WebElement botaoEnviar = driver.findElement(By.id("botao_somar"));
    	WebElement resultado = driver.findElement(By.id("resultado"));
    	input1.sendKeys("Luis Henrique");
    	input2.sendKeys("Avenida Assis Brasil");
    	input3.sendKeys("m");
    	input4.sendKeys("a");
    	botaoEnviar.click();
    	Assert.assertEquals(resultado.getText(), "Preencha o campo idade, somente com numeros");
    }
     
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
    
}
