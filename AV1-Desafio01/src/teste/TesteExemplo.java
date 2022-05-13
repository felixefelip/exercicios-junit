package teste;

import org.junit.Assert;
import org.junit.Test;

import dominio.Produto;

public class TesteExemplo {
	@Test
	public void testeCalculaDesconto(){
		Produto produto = new Produto(5, 5, 5.50, 1);
		Assert.assertEquals(2.75, produto.calculaDesconto(), 0);
	}
}
