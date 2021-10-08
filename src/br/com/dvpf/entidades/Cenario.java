package br.com.dvpf.entidades;

import java.io.Serializable;
import java.util.ArrayList;

public class Cenario implements Serializable{

	
	private int id;
	private ArrayList<Personagem> personagens;
	private ArrayList<Evento> eventos;
	private String nome;
	
	
	public Cenario() {
		super();
	}


	public Cenario(int id, ArrayList<Personagem> personagens, ArrayList<Evento> eventos, String nome) {
		super();
		this.id = id;
		this.personagens = personagens;
		this.eventos = eventos;
		this.nome = nome;
	}


	public Cenario(ArrayList<Personagem> personagens, ArrayList<Evento> eventos, String nome) {
		super();
		this.personagens = personagens;
		this.eventos = eventos;
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ArrayList<Personagem> getPersonagens() {
		return personagens;
	}


	public void setPersonagens(ArrayList<Personagem> personagens) {
		this.personagens = personagens;
	}


	public ArrayList<Evento> getEventos() {
		return eventos;
	}


	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
