package br.com.dvpf.dao;

import br.com.dvpf.dao.impl.oracle.OracleCenarioDAO;
import br.com.dvpf.dao.impl.oracle.OraclePersonagemDAO;
import br.com.dvpf.interfaces.CenarioDAO;
import br.com.dvpf.interfaces.PersonagemDAO;

public class OracleDAOFactory extends DAOFactory{
	
	public PersonagemDAO getPersonagemDAO() {
		return new OraclePersonagemDAO();
	}
	public CenarioDAO getCenarioDAO() {
		return new OracleCenarioDAO();
	}

}