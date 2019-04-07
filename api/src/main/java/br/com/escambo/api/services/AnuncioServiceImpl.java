package br.com.escambo.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.escambo.api.models.Anuncio;
import br.com.escambo.api.models.Pessoa;
import br.com.escambo.api.models.Produto;

@Service
public class AnuncioServiceImpl implements IAnuncioService{

	public List<Anuncio> buscarTodosAnuncios() {
		List<Anuncio> anuncios = new ArrayList<Anuncio>();
		anuncios.add(new Anuncio(0,"Furadeira por Parafusadeira", "Preciso de uma furadeira", null, null));
		return anuncios;
	}
}