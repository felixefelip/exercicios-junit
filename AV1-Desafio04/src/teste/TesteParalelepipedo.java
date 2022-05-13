package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dominio.Paralelepipedo;

class TesteParalelepipedo {

	@Test
	public void testCalculaDiagonall() {
		Paralelepipedo paralelepipedo = new Paralelepipedo(5, 3, 2);
		assertEquals(6.164413928985596, paralelepipedo.calculaDiagonal());
	}

}
