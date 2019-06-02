package br.com.escambo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.escambo.models.Produto;
import br.com.escambo.repositories.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements IProdutoService{
	
	@Autowired
	ProdutoRepository repository;

	@Override
	public Produto salvaProduto(Produto produto) {
		return repository.save(produto);
	}

	@Override
	public Optional<Produto> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deletaProduto(long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Produto> buscarProdutos() {
		return (List<Produto>) repository.findAll();
	}
}
