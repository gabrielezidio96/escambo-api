package br.com.escambo.api.repositories;

import org.springframework.stereotype.Repository;

import br.com.escambo.api.models.Produto;
import br.com.escambo.api.repositories.utils.SoftDeleteCrudRepository;

@Repository
public interface ProdutoRepository extends SoftDeleteCrudRepository<Produto, Long> {
	
}