package br.com.escambo.models;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.escambo.models.Pessoa;
import br.com.escambo.models.Produto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProduto {
	
	@Test
	public void PessoaTemUmProduto() {
				
		ArrayList<Produto> prod = new ArrayList<Produto>();
		prod.add(new Produto("Furadeira", "Cerrote"));
		prod.add(new Produto("Batedeira", "Fazer bolo"));
		Pessoa p1 = new Pessoa("Pedro", "Rua x");
		p1.setProdutos(prod);
		assertEquals(2, p1.getProdutos().size());
		assertEquals("Pedro", p1.getNome());
	}
	
	@Test
	public void IdFuradeira() {
		ArrayList<Produto> prod = new ArrayList<Produto>();
		prod.add(new Produto("Furadeira", "Cerrote"));
		
		assertEquals(1, prod.size());
	}
}
