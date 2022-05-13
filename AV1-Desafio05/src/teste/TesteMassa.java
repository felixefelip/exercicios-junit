package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dominio.Massa;

class TesteMassa {

	@Test
	public void testGetMassaFinal() {
		Massa massa = new Massa(5);
		massa.calculaTempo();
		assertEquals(0.3125f, massa.getMassaFinal());
	}
	
	@Test
	public void testGetTempo() {
		Massa massa = new Massa(5);
		massa.calculaTempo();
		assertEquals(200, massa.getTempo());
	}

}
