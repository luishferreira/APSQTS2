/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author marcelo.soares
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BancoDados banco = new BancoDados();
       
       // crio pessoa para salvar
       Pessoa pessoa = new Pessoa();
       pessoa.setNome("marcelo soares");
       pessoa.setIdade(90);
       // insere no banco, e retorna o id da pessoa
       int idPessoa = banco.insertPessoa(pessoa);
       System.out.println("id pessoa: " + idPessoa); 
       
      // banco.deletePessoa(idPessoa);
      
      // atualizo a idade da pessoa que foi foi inserida
      pessoa.setIdade(90);
      // atualizo no banco
      banco.updatePessoa(pessoa);
      // busco a pessoa novamente, pelo seu id
      Pessoa pessoaBuscada = banco.buscaPessoa(pessoa.getId());
      System.out.println("Pessoa buscada no banco " + pessoaBuscada.getNome() + " idade: " + pessoa.getIdade());
        
      // lista todas as pessoas no banco
        for(Pessoa p : banco.listPessoa()){
            System.out.println("Pessoa id " + p.getId());
            System.out.println("Pessoa nome " + p.getNome());
            System.out.println("Pessoa idade " + p.getIdade());
        }
       
       
       
    }
    
}
