package inspecao;

//import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class MainTest {

//	 * l: 0,1  
//	 * l: 5000,5001
//	 * l: 10000,10001
	@Test
	public void testCalculaDescontoComValoresAbaixoZero() {
		Main main = new Main();
		float saidaExp = 0f;
		float entrada = 0;
		float resultado = main.calculaDesconto(entrada);
		Assert.assertEquals(saidaExp, resultado);
	}
	
	@Test
	public void testCalculaDescontoComValoresLimiteUM() {
		Main main = new Main();
		float saidaExp = 0.02f;
		float entrada = 1;
		float resultado = main.calculaDesconto(entrada);
		Assert.assertEquals(saidaExp, resultado);
	}
	
	@Test
	public void testCalculaDescontoComValoresLimiteCincoMil() {
		Main main = new Main();
		float saidaExp = 100f;
		float entrada = 5000;
		float resultado = main.calculaDesconto(entrada);
		Assert.assertEquals(saidaExp, resultado);
	}
	
	@Test
	public void testCalculaDescontoComValoresLimiteCincoMilEUm() {
		Main main = new Main();
		float saidaExp = 250.05f;
		float entrada = 5001;
		float resultado = main.calculaDesconto(entrada);
		Assert.assertEquals(saidaExp, resultado);
	}
	
	@Test
	public void testCalculaDescontoComValoresLimiteDezMil() {
		Main main = new Main();
		float saidaExp = 500f;
		float entrada = 10000f;
		float resultado = main.calculaDesconto(entrada);
		Assert.assertEquals(saidaExp, resultado);
	}
	
	@Test
	public void testCalculaDescontoComValoresAcimaDezMil() {
		Main main = new Main();
		float saidaExp = 0f;
		float entrada = 10001f;
		float resultado = main.calculaDesconto(entrada);
		Assert.assertEquals(saidaExp, resultado);
	}
	
	

}
