package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Forma;

class TesteForma {

	@Test
	public void testTrianguloEscaleno() {
		Forma forma = new Forma(12, 6, 9);
		assertEquals("triangulo escaleno", forma.verificaForma());
	}
	
	@Test
	public void testTrianguloEquilatero() {
		Forma forma = new Forma(6, 6, 6);
		assertEquals("triangulo equilatero", forma.verificaForma());
	}
	
	@Test
	public void testTrianguloIsosceles() {
		Forma forma = new Forma(9, 15, 15);
		assertEquals("triangulo isosceles", forma.verificaForma());
	}
	
	@Test
	public void testNaoETriangulo() {
		Forma forma = new Forma(12, 5, 6);
		assertEquals("não eh um triangulo", forma.verificaForma());
	}

}
