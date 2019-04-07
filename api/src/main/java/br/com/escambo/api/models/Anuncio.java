package br.com.escambo.api.models;

public class Anuncio {
	private int Id;
	private String titulo;
	private String descricao;
	private Pessoa pessoa;
	private Produto produto;
	
	public Anuncio(int id, String titulo, String descricao, Pessoa pessoa, Produto produto) {
		super();
		Id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.pessoa = pessoa;
		this.produto = produto;
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
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getId() {
		return Id;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
}