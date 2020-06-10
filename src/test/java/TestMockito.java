import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.Assert;
import senai_2020_qts.CorreioService;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestMockito {

	private CorreioService correioMock;
	
	@Before
	public void init() {
		CorreioService casaMock = Mockito.mock(CorreioService.class);
	}
	
	
	@Test
	public void test() {
		CorreioService correio = Mockito.mock(CorreioService.class);
		when(correio.buscarEndereco("9000000")).thenReturn("Porto Alegre");
		when(correio.buscarEndereco("8000000")).thenReturn("Av. Assis Brasil");
		Assert.assertEquals("Porto Alegre", correio.buscarEndereco("9000000"));
		Assert.assertEquals("Av. Assis Brasil", correio.buscarEndereco("8000000"));
	
	}
	
	
}
