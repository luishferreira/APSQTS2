
package aula4.exercicio;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoa {
    
// retorna true se estiver ok, ou false se ouve algo errado
    public boolean validar(Pessoa pessoa){
        // FAZER AS VALIDACOES AQUI DENTRO 
         boolean ret = true;
         
        // EXEMPLO, validacao de uma parte do campo NOME
        if(pessoa.getNome().equals("")){
            return  false;
        }
        if(pessoa.getNome().length() > 30){
        	return false;
        }
        
        if(pessoa.getEndereco().equals("")){
        	return false;
        }
        if(pessoa.getEndereco().length() > 50){
        	return false;
        }
        
        return ret;
    }
    
    
}
