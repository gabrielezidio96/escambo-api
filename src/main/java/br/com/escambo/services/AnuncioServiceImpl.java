package br.com.escambo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.escambo.models.Anuncio;
import br.com.escambo.models.Produto;

@Service
public class AnuncioServiceImpl implements IAnuncioService{
	
	//@Autowired
	//AnuncioRepository repository;

	public List<Anuncio> buscarTodosAnuncios() {
		return null;
	}
}