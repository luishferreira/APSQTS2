package aula9;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ExerciciosRevisaoTest {

	@Test
	public void testValidaMesOK() {
		ExerciciosRevisao exercicio = new ExerciciosRevisao();
		boolean ret = exercicio.validaMes(5);
		boolean experado = true;
		Assert.assertEquals(experado, ret);
	}
	
	@Test
	public void testValidaMesError() {
		ExerciciosRevisao exercicio = new ExerciciosRevisao();
		boolean ret = exercicio.validaMes(50);
		boolean experado = false;
		Assert.assertEquals(experado, ret);
		
	}
	
	@Test
	public void testValidaIdadePessoaOK() {
		ExerciciosRevisao exercicio = new ExerciciosRevisao();
		boolean ret = exercicio.validaIdadePessoa(100);
		boolean experado = true;
		Assert.assertEquals(experado, ret);
		
		ret = exercicio.validaIdadePessoa(50);
		experado = true;
		Assert.assertEquals(experado, ret);
	}
	
	@Test
	public void testValidaIdadePessoaError() {
		ExerciciosRevisao exercicio = new ExerciciosRevisao();
		boolean ret = exercicio.validaIdadePessoa(-1);
		boolean experado = false;
		Assert.assertEquals(experado, ret);
		
		ret = exercicio.validaIdadePessoa(131);
		experado = false;
		Assert.assertEquals(experado, ret);
	}
	
	@Test
	public void testRetornaDadosPessoaParteOk() {
		ExerciciosRevisao exercicio = new ExerciciosRevisao();
		/// nome da pessao, idade, cidade
		String resultado = exercicio.retornaDadosPessoa();
		String[] vetor = resultado.split(";");
		int tamanhoVetor = vetor.length;
		int experado = 3;
		Assert.assertEquals(experado,tamanhoVetor);
				
	}
	
	@Test
	public void testRetornaDadosPessoaParteIdadeOK() {
		ExerciciosRevisao exercicio = new ExerciciosRevisao();
		/// nome da pessao(0), 12(1), cidade(2)
		String resultado = exercicio.retornaDadosPessoa();
		String[] vetor = resultado.split(";");
		String idade = vetor[1]; // pego a idade
		
		try {
			Integer.parseInt(idade);
		}catch(Exception e) {
			Assert.fail("Error, idade invalida");
		}
		
				
	}

}
