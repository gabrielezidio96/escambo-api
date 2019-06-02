package br.com.escambo.repositories;

import org.springframework.stereotype.Repository;

import br.com.escambo.models.Produto;
import br.com.escambo.repositories.utils.SoftDeleteCrudRepository;

@Repository
public interface ProdutoRepository extends SoftDeleteCrudRepository<Produto, Long> {
	
}