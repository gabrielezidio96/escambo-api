package br.com.escambo.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.escambo.api.models.Produto;
import br.com.escambo.api.services.IProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProdutoController {
	
	@Autowired
	IProdutoService produtoService;
	
    @GetMapping()
    public ResponseEntity<List<Produto>> listaProdutos() {
    	return ResponseEntity.ok(produtoService.buscarProdutos());
    }
	
	@PostMapping()
	public Produto adicionaProduto(@RequestBody Produto produto) {
		return produtoService.salvaProduto(produto);
	}
    
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizaProduto(@PathVariable("id") long id, @RequestBody Produto produto) {
        if (!produtoService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        produto.setId(id);
        return ResponseEntity.ok().body(produtoService.salvaProduto(produto));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletaProduto(@PathVariable("id") long id) {
        if (!produtoService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        produtoService.deletaProduto(id);
        return ResponseEntity.ok().build();
    }
}