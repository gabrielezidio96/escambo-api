package br.com.escambo.services;

import java.util.List;

import br.com.escambo.models.Anuncio;

public interface IAnuncioService {
	public List<Anuncio> buscarTodosAnuncios();
}
