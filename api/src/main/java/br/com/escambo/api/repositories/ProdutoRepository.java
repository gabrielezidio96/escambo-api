package br.com.escambo.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.escambo.api.models.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
	
}