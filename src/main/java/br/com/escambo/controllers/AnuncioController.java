package br.com.escambo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.escambo.models.Anuncio;
import br.com.escambo.services.IAnuncioService;

@RestController
public class AnuncioController {
	
	@Autowired
	IAnuncioService anuncioService;
	
    @GetMapping(value = "/anuncios")
    public List<Anuncio> listaAnuncios() {
    	return anuncioService.buscarTodosAnuncios();
    }
}
