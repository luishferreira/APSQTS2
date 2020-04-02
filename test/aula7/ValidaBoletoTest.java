package aula7;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

// TESTES UNITARIOS
public class ValidaBoletoTest {

	// 1 caso de teste
	@Test
	public void validaIdBoleto() {
		Boleto boleto = new Boleto();
		boleto.idBoleto= 1;
		boleto.sacado ="teste";
		boleto.valor = 10;
		ValidaBoleto valida= new ValidaBoleto();
		boolean ret =  valida.validar(boleto);
		Assert.assertTrue(ret);
	}
	
	// FALTA OUTROS TU AQUI.

}
