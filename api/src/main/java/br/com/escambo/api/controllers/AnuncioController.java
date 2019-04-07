package br.com.escambo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.escambo.api.models.Anuncio;
import br.com.escambo.api.services.IAnuncioService;

@RestController
public class AnuncioController {
	
	@Autowired
	IAnuncioService anuncioService;
	
    @RequestMapping(value = "/anuncios")
    public List<Anuncio> getAnuncios() {
    	return anuncioService.buscarTodosAnuncios();
    }
}
