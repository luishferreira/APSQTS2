/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.util.List;
import java.util.Properties;

/**
 *
 * @author marcelo.soares
 */
 
import java.sql.Connection;
 
import java.sql.DriverManager;
import java.sql.ResultSet;
 
import java.sql.SQLException;
import java.util.ArrayList;
 
public class BancoDados {
    private Connection connection = null;  
    
public BancoDados(){
    conectaBanco();
}
    
 
// funciona somente no banco de dados postgress
// deve ser inserido o driver.
// deve ser criado a tabela no banco

 
private void conectaBanco() { 
           
	
	try {
		String url = "jdbc:postgresql://localhost/qts";
		Properties props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","123456");
		connection = DriverManager.getConnection(url, props);
		if (connection != null) {
	        System.out.println("STATUS--->Conectado com sucesso!");
	    } else {
	        System.out.println("STATUS--->Não foi possivel realizar conexão");
	    }
		
	}catch(Exception e) {
		 	System.out.println("Error ao conectar o banco de dados");
	        e.printStackTrace();
	}

	// VERS�O ABAIXO MYSQL
	
//    try {
//    String driverName = "com.mysql.jdbc.Driver";
//    Class.forName(driverName); 
//    String serverName = "localhost";   
//    String mydatabase ="senai"; 
//    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
//    String username = "root";  
//    String password = "123456";   
//    connection = DriverManager.getConnection(url, username, password); 
//    if (connection != null) {
//        System.out.println("STATUS--->Conectado com sucesso!");
//    } else {
//        System.out.println("STATUS--->Não foi possivel realizar conexão");
//    }
//    } catch (Exception e) {  
//        System.out.println("Error ao conectar o banco de dados");
//        e.printStackTrace();
//    } 
// 
//  
 
    }
    
    public int insertPessoa(Pessoa p){
        String sql = "insert into pessoa (nome,idade) values('"+
                p.getNome() + "',"+ p.getIdade() + ") RETURNING id";
     
        System.out.println("sql insert " + sql);
        
        try{
        	ResultSet rs = connection.createStatement().executeQuery(sql);
        	rs.next();
            int id =  rs.getInt(1);
            p.setId(id);
            return id;
           
        }catch(Exception e){
            System.out.println("Error na insercao pessoa " + e);
            return -1;
        }
                
    }
    
    public boolean deletePessoa(int id){
        String sql = "delete from  pessoa where id = "+ id;
        System.out.println("sql delete " + sql);
        
        try{
            connection.createStatement().execute(sql);
        }catch(Exception e){
            System.out.println("Error na remocao pessoa " + e);
            return false;
        }
        
        return true;
    }
    
    public boolean updatePessoa(Pessoa p){
        String sql = "update  pessoa set nome = '" + p.getNome() 
                + "', idade = " + p.getIdade() + " where id = " + p.getId() ;
              
        System.out.println("sql update " + sql);
        
        try{
            connection.createStatement().execute(sql);
        }catch(Exception e){
            System.out.println("Error na update pessoa " + e);
            return false;
        }
        
        return true;
    }
    
    public List<Pessoa> listPessoa(){
        List<Pessoa> lista = new ArrayList<>();
        String sql = "select * from pessoa";
        System.out.println("sql select " + sql);
        try{
        connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery(sql);
          
         while(resultSet.next()){
            Pessoa pessoa = new Pessoa();
            pessoa.setId(resultSet.getInt("id"));
            pessoa.setNome(resultSet.getString("nome"));
            pessoa.setIdade(resultSet.getInt("idade"));
            lista.add(pessoa);
         }    
             
        }catch(Exception e){
            
        }
        
        return lista;
    }
    
     public Pessoa  buscaPessoa(int idPessoa){
       
        String sql = "select * from pessoa where id =" + idPessoa;             ;
        System.out.println("sql select " + sql);
         Pessoa pessoa = null;
        try{
        connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery(sql);
          
         while(resultSet.next()){
             pessoa = new Pessoa();
            pessoa.setId(resultSet.getInt("id"));
            pessoa.setNome(resultSet.getString("nome"));
            pessoa.setIdade(resultSet.getInt("idade"));
            
         }    
             
        }catch(Exception e){
            
        }
        
        return pessoa;
    }
}
