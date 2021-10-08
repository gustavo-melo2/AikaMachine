package br.com.dvpf.bo;

import br.com.dvpf.interfaces.PersonagemDAO;

import java.util.ArrayList;

import br.com.dvpf.dao.DAOFactory;
import br.com.dvpf.entidades.Personagem;


public class PersonagemBO {
	
	public PersonagemDAO personagemDAO = null;
	
	public PersonagemBO() {
		personagemDAO = DAOFactory.getDAOFactory(DAOFactory.ORACLE).getPersonagemDAO();
	}
	
	public ArrayList<Personagem> buscarPersonagensCenario(int idCenario){
		
		return personagemDAO.buscarPersonagensCenario(idCenario);
	}
	
	public Personagem buscarPersonagemPorId(int idPersonagem) {
		
		return personagemDAO.buscarPersonagemPorId(idPersonagem);
	}
	
}
