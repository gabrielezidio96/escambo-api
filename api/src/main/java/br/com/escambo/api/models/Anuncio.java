package br.com.escambo.api.models;
/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Where;
*/
//@Entity
//@Table(name = "tbl_anuncio")
//@Where(clause="ativo=1")
public class Anuncio {
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	//@Column(name = "titulo")
	private String titulo;
	//@Column(name = "descricao")
	private String descricao;
	//@Column(name = "pessoa")
	private Pessoa pessoa;
	//@Column(name = "produto_oferecido")
	private Produto produto_oferecido;	
	//@Column(name = "produto_desejado")
	private Produto produto_desejado;	
	//@Column(name = "ativo")
	private boolean ativo;
	
	public Anuncio(String titulo, String descricao, Pessoa pessoa, Produto produto_oferecido,
			Produto produto_desejado) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.pessoa = pessoa;
		this.produto_oferecido = produto_oferecido;
		this.produto_desejado = produto_desejado;
		this.ativo = false;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Produto getProduto_oferecido() {
		return produto_oferecido;
	}

	public void setProduto_oferecido(Produto produto_oferecido) {
		this.produto_oferecido = produto_oferecido;
	}

	public Produto getProduto_desejado() {
		return produto_desejado;
	}

	public void setProduto_desejado(Produto produto_desejado) {
		this.produto_desejado = produto_desejado;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}	
}