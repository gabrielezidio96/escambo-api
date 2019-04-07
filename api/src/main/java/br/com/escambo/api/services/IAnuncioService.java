package br.com.escambo.api.services;

import java.util.List;

import br.com.escambo.api.models.Anuncio;

public interface IAnuncioService {
	public List<Anuncio> buscarTodosAnuncios();
}
