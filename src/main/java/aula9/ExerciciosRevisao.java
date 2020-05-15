package aula9;

public class ExerciciosRevisao {

	boolean validaMes(int mes){
	   if(mes <=0 || mes > 30){
			return false;
	     }else{
		return true;
	    }
	}
	
	boolean validaIdadePessoa(int idade){
	     if(idade < 0 || idade  > 130){
			return false;
	     }else{
	    	 return true;
	     }
	}
	

	public String retornaDadosPessoa(){
		// 	realiza algum processamento
		String texto = "pedro da silva;44;porto alegre";
		return texto;
	}



	
}
