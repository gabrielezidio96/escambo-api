package br.com.escambo.api.models;

public class Anuncio {
	private int Id;
	private String titulo;
	private String descricao;
	private Pessoa pessoa;
	private Produto produto_oferecido;
	private Produto produto_desejado;
	
	public Anuncio(int id, String titulo, String descricao, Pessoa pessoa, Produto produto_oferecido,
			Produto produto_desejado) {
		super();
		Id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.pessoa = pessoa;
		this.produto_oferecido = produto_oferecido;
		this.produto_desejado = produto_desejado;
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
	public int getId() {
		return Id;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
}