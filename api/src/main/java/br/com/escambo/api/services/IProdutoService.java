package br.com.escambo.api.services;

import java.util.List;
import java.util.Optional;

import br.com.escambo.api.models.Produto;

public interface IProdutoService {
	public Produto salvaProduto(Produto produto);
	public Optional<Produto> findById(Long id);
	public void deletaProduto(long id);
	public List<Produto> buscarProdutos();
}
