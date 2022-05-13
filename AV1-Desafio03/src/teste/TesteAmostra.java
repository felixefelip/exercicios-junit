package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Amostra;

class TesteAmostra {

	@Test
	public void test1() {
		Amostra amostra = new Amostra(8, 7, 6, 5);
		assertEquals(7, amostra.informaGrau());
	}
	
	@Test
	public void test2() {
		Amostra amostra = new Amostra(8, 5, 6, 5);
		assertEquals(8, amostra.informaGrau());
	}
	
	@Test
	public void test3() {
		Amostra amostra = new Amostra(8, 5, 51, 5);
		assertEquals(9, amostra.informaGrau());
	}
	
	@Test
	public void test4() {
		Amostra amostra = new Amostra(8, 5, 51, 80001);
		assertEquals(10, amostra.informaGrau());
	}

}
