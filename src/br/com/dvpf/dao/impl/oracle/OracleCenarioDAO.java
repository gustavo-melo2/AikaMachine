package br.com.dvpf.dao.impl.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.dvpf.entidades.Cenario;
import br.com.dvpf.entidades.Evento;
import br.com.dvpf.interfaces.CenarioDAO;

public class OracleCenarioDAO implements CenarioDAO{
	

	public Cenario buscarEventosCenario(int idCenario) {
		Connection conn = null;
		
		Cenario cenario = new Cenario();
		
		try {
			
			conn = ConnectionManager.getInstance().getConnection();
			
			String sql = "SELECT C.NM_CENARIO, " + 
						"C.ID_CENARIO, " + 
						"E.NM_EVENTO, " + 
						"E.DESC_EVENTO " +
						"FROM T_SVF_CENARIO C INNER JOIN T_SVF_EVENTO E " + 
						"ON (C.ID_CENARIO = E.ID_CENARIO) " + 
						"WHERE (C.ID_CENARIO = ?)";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, idCenario);
			
			ResultSet rs = stmt.executeQuery();
			
			boolean nmCenario = false;
			
			ArrayList<Evento> eventos = new ArrayList<>();
			while(rs.next()) {
				if(nmCenario == false) {
					cenario.setId(rs.getInt("ID_CENARIO"));
					cenario.setNome(rs.getString("NM_CENARIO"));
					nmCenario = true;
				}
				Evento evento = new Evento();
				evento.setNome(rs.getString("NM_EVENTO"));
				evento.setDescricao(rs.getString("DESC_EVENTO"));
				eventos.add(evento);
				
			}
			cenario.setEventos(eventos);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return cenario;
	
	}

}
