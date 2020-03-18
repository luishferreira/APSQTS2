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
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("teste");
        Assert.assertTrue(validator.validar(pessoa));
    }
    
    @Test
    public void testvalidaNomeError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("");
        Assert.assertFalse(validator.validar(pessoa));
    }
    
    @Test
    public void testValidaNomeComMais30Caracteres(){
    	ValidatorPessoa validator = new ValidatorPessoa();
    	Pessoa pessoa = new Pessoa();
        pessoa.setNome("0123456789012345678901234567890");
        boolean ret = validator.validar(pessoa);
        Assert.assertFalse(ret);
    }
    
}
