package br.com.dvpf.bo;


import br.com.dvpf.entidades.Cenario;
import br.com.dvpf.interfaces.CenarioDAO;



import br.com.dvpf.dao.DAOFactory;


public class CenarioBO {
	
	public CenarioDAO cenarioDAO = null;
	
	public CenarioBO() {
		cenarioDAO = DAOFactory.getDAOFactory(DAOFactory.ORACLE).getCenarioDAO();
	}
	
	public Cenario buscarEventosCenario(int idCenario){
			
		return cenarioDAO.buscarEventosCenario(idCenario);
	}
	
}
