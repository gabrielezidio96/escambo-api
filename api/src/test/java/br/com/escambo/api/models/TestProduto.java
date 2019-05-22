package br.com.escambo.api.models;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
public class TestProduto {
	
	@Test
	public void PessoaTemUmProduto() {
				
		ArrayList<Produto> prod = new ArrayList<Produto>();
		prod.add(new Produto("Furadeira", "Cerrote"));
		prod.add(new Produto("Batedeira", "Fazer bolo"));
		
		//Pessoa p1 = new Pessoa("Pedro", "Rua x", prod);
		//Assertions.assertEquals(2, p1.getProdutos().size());
		//Assertions.assertEquals("Pedro", p1.getNome());
	}
	
	@Test
	public void IdFuradeira() {
		
		ArrayList<Produto> prod = new ArrayList<Produto>();
		prod.add(new Produto("Furadeira", "Cerrote"));
		
		Assertions.assertEquals(1, prod.get(0).getId());
	}
}
