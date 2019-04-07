package br.com.escambo.api.models;

import java.util.List;

public class Pessoa {
	
	private int Id;
	private String nome;
	private String endereco;
	private List<Produto> produto;
	
	public Pessoa(String nome, String endereco, List<Produto> produto) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.produto = produto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	public int getId() {
		return Id;
	}
}