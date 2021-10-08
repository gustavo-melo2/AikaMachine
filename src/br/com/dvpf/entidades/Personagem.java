package br.com.dvpf.entidades;

import java.io.Serializable;

public class Personagem implements Serializable{

	private int id;
	private String nome;
	private String descricao;
	private String imagem;
	private Relacionamento relacionamento;
	
	
	public Personagem(int id, String nome, String descricao, String imagem, Relacionamento relacionamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
		this.relacionamento = relacionamento;
	}
	
	public Personagem(String nome, String descricao, String imagem, Relacionamento relacionamento) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
		this.relacionamento = relacionamento;
	}
	
	public Personagem() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Relacionamento getRelacionamento() {
		return relacionamento;
	}

	public void setRelacionamento(Relacionamento relacionamento) {
		this.relacionamento = relacionamento;
	}
	

	
}
