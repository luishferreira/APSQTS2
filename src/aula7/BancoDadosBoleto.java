package aula7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class BancoDadosBoleto {

    private Connection connection = null;  
    
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
	}
	
	
	public boolean deleteBoleto(int id){
        String sql = "delete from  boleto where id = "+ id;
        System.out.println("sql delete " + sql);
        
        try{
            connection.createStatement().execute(sql);
        }catch(Exception e){
            System.out.println("Error na remocao boleto " + e);
            return false;
        }
        
        return true;
    }
	
	public void adicionaBoleto(Boleto boleto){
		// IMPLEMENTAR
	}
	
	public Boleto buscaBoleto(int idBoleto) {
		// IMPLEMENTAR
		return null;
	}
	
	
	
	
}
