package br.com.escambo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "tbl_pessoa")
@Where(clause="ativo=1")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "endereco")
	private String endereco;
	@OneToMany(mappedBy="pessoa")
	private List<Produto> produtos;
	@Column(name = "ativo")
	private boolean ativo;
	
	public Pessoa() {}
	
    public Pessoa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.produtos = new ArrayList<Produto>();
		this.ativo = false;
	}

	public void addProduto(Produto produto) {
        this.produtos.add(produto);
        produto.setPessoa(this);
    }
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", produtos=" + produtos + ", ativo="
				+ ativo + "]";
	}	
}