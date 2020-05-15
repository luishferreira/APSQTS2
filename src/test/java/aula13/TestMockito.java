package aula13;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestMockito {

	
	@Test
	public void test() {
		Casa casa = Mockito.mock(Casa.class);
		when(casa.getEndereco()).thenReturn("cachoeirinha");
		System.out.println(casa.getEndereco());
	}
}
