package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Plano;

class TestePlano {

	@Test
	public void test() {
		Plano plano = new Plano(5, 3, 2, 4);
		
		assertEquals(3.1622776985168457, plano.calculaDistancia());
	}

}
