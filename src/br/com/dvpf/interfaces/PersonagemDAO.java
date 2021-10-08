package br.com.dvpf.interfaces;


import java.util.ArrayList;

import br.com.dvpf.entidades.Personagem;

public interface PersonagemDAO {
	
	public ArrayList<Personagem> buscarPersonagensCenario(int idCenario);

	public Personagem buscarPersonagemPorId(int idPersonagem);
	
}