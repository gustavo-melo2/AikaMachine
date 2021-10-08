package br.com.dvpf.dao;

import br.com.dvpf.interfaces.CenarioDAO;
import br.com.dvpf.interfaces.PersonagemDAO;

public abstract class DAOFactory {
	
	public static final int ORACLE = 1;
	
	private static DAOFactory oracleDAOFactory = null;
	
	public static DAOFactory getDAOFactory(int banco) {
		switch (banco) {
			case ORACLE:
				if (oracleDAOFactory == null) {
					oracleDAOFactory =  new OracleDAOFactory();
				}
			
				return oracleDAOFactory;

			default:
				return null;
		}
	}
	
	public abstract PersonagemDAO getPersonagemDAO();
	
	public abstract CenarioDAO getCenarioDAO();
	

}
