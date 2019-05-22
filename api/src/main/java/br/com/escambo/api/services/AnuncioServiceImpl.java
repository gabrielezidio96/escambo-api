package br.com.escambo.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.escambo.api.models.Anuncio;
import br.com.escambo.api.models.Produto;

@Service
public class AnuncioServiceImpl implements IAnuncioService{
	
	//@Autowired
	//AnuncioRepository repository;

	public List<Anuncio> buscarTodosAnuncios() {
		return null;
	}
}