package aula7;

public class ValidaBoleto {

//	idBoleto não pode ter valores negativos
//	saldo não pode ter valores negativos
//	sacado não pode estar em branco ou nulo.
	
	public boolean validar(Boleto boleto) {
		boolean ret = true;
		
		if(boleto.idBoleto < 0) {
			ret = false;
		}else if(boleto.valor < 0) {
			ret = false;
		}else if(boleto.sacado.equals("")) {
			return false;
		}
		
		
		return ret;
		
	}

	
}
