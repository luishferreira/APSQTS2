package aula3;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class ExercicioE1Test {

	// 1 .. 12
	// 0,1,12,13
	@Test
	public void testValidaMesValido() {
		ExercicioE1 exer = new ExercicioE1();
		int entrada = 10;
		boolean saidaExp = true;
		Assert.assertEquals(saidaExp,exer.validaMes(entrada));
	}
	
	@Test
	public void testValidaMesInValido() {
		ExercicioE1 exer = new ExercicioE1();
		int entrada = 13;
		boolean saidaExp = false;
		Assert.assertEquals(saidaExp,exer.validaMes(entrada));
	}

}
