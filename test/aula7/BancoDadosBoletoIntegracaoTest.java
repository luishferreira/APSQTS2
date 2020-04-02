package aula7;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

// CLASSE DE TESTES DE INTEGRACAO
public class BancoDadosBoletoIntegracaoTest {

	@Test
	public void testDeleteBoleto() {
		Boleto boleto = new Boleto();
		boleto.idBoleto = 1;
		boleto.sacado = "teste";
		boleto.valor = 150;
		
		BancoDadosBoleto bancoDadosBoleto = new BancoDadosBoleto();
		bancoDadosBoleto.adicionaBoleto(boleto);
		int idBoleto = boleto.idBoleto;
		bancoDadosBoleto.deleteBoleto(idBoleto);
		Assert.assertNull(bancoDadosBoleto.buscaBoleto(idBoleto));
	}
	
	@Test
	public void testAdicionaBoleto() {
		// IMPLMEMENTAR TI
	}
	
	@Test
	public void testBuscaBoleto() {
		// IMPLMEMENTAR TI
	}
	
	

}
