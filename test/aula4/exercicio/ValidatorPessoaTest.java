/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.exercicio;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoaTest {
    
   
    @Test
    public void testvalidaNomeOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoaOk();        
        Assert.assertTrue(validator.validar(pessoa));
    }
    
    @Test
    public void testvalidaNomeError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoaOk();
        pessoa.setNome("");
        Assert.assertFalse(validator.validar(pessoa));
    }
    
    @Test
    public void testValidaNomeComMais30Caracteres(){
    	ValidatorPessoa validator = new ValidatorPessoa();
    	Pessoa pessoa = criaPessoaOk();
        pessoa.setNome("0123456789012345678901234567890");
        boolean ret = validator.validar(pessoa);
        Assert.assertFalse(ret);
    }
    
    @Test
    public void testValidaEnderecoComMais50Caracteres(){
    	ValidatorPessoa validator = new ValidatorPessoa();
    	Pessoa pessoa = criaPessoaOk();        
        pessoa.setEndereco("01234567890123456789012345678900123456789012345678901234567890");
        boolean ret = validator.validar(pessoa);
        Assert.assertFalse(ret);
    }
    
    @Test
    public void testvalidaEnderecoEmBranco(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoaOk();
        pessoa.setEndereco("");
        Assert.assertFalse(validator.validar(pessoa));
    }
    
    
    private Pessoa criaPessoaOk(){
    	Pessoa pessoa = new Pessoa();
    	pessoa.setDataNascimentoAno("2000");
    	pessoa.setDataNascimentoDia("26");
    	pessoa.setDataNascimentoMes("06");
    	pessoa.setDddTelefone("51");
    	pessoa.setEndereco("porto alegre");
    	pessoa.setNome("maria");
    	pessoa.setNumeroEndereco("500");
    	pessoa.setSexo("m");
    	pessoa.setTelefone("915564564");
    	return pessoa;
    }
    
}
