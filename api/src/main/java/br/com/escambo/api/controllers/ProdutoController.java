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
	
	@PostMapping("/produto")
	public ResponseEntity addProduto(@RequestBody Produto produto) {
		return ResponseEntity.ok(produtoService.salvaProduto(produto));
	}
    
    @PutMapping("/produto")
    public ResponseEntity<Produto> atualizaProduto(@RequestBody Produto produto) {
        if (!produtoService.findById(produto.getId()).isPresent()) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(produtoService.salvaProduto(produto));
    }
    
    @DeleteMapping("/produto/{id}")
    public ResponseEntity deletaProduto(@PathVariable("id") long id) {
        if (!produtoService.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }

        produtoService.deletaProduto(id);

        return ResponseEntity.ok().build();
    }
}