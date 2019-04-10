package br.com.escambo.api.models;

import java.util.List;

public class Pessoa {
	
	private int Id;
	private String nome;
	private String endereco;
	private List<Produto> produtos;
	
	public Pessoa(String nome, String endereco, List<Produto> produtos) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.produtos = produtos;
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
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produto) {
		this.produtos = produto;
	}
	public int getId() {
		return Id;
	}
}