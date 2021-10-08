package br.com.dvpf.dao.impl.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.dvpf.entidades.Personagem;
import br.com.dvpf.entidades.Relacionamento;
import br.com.dvpf.interfaces.PersonagemDAO;

public class OraclePersonagemDAO implements PersonagemDAO{
	
	
	public ArrayList<Personagem> buscarPersonagensCenario(int idCenario) {
		Connection conn = null;
		
		ArrayList<Personagem> personagens = new ArrayList<>();
		
		try {
			
			conn = ConnectionManager.getInstance().getConnection();
			
			String sql = "SELECT " + 
					"P.ID_PERSONAGEM, " +
					"P.DESC_PERSONAGEM, " +
					"P.NM_PERSONAGEM, " + 
					"P.IMG_PERSONAGEM " + 
					"FROM T_SVF_CENARIO C INNER JOIN T_SVF_PERSONAGEM P " + 
					"ON (C.ID_CENARIO = P.ID_CENARIO) " + 
					"WHERE (C.ID_CENARIO = ?)";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, idCenario);
			
			
			ResultSet rs = stmt.executeQuery();
			
			
			
			while(rs.next()) {
				Personagem personagem = new Personagem();
				personagem.setId(rs.getInt("ID_PERSONAGEM"));
				personagem.setNome(rs.getString("NM_PERSONAGEM"));
				personagem.setDescricao(rs.getString("DESC_PERSONAGEM"));
				personagem.setImagem(rs.getString("IMG_PERSONAGEM"));
				personagens.add(personagem);
			}
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
		return personagens;
	}


	public Personagem buscarPersonagemPorId(int idPersonagem) {
		
		Connection conn = null;
		
		Personagem personagem = new Personagem();
		Relacionamento relacionamento = new Relacionamento();
		try {
			
			conn = ConnectionManager.getInstance().getConnection();
			
			
			
			String sql = "SELECT  P.ID_PERSONAGEM, " + 
					"P.NM_PERSONAGEM, " + 
					"P.IMG_PERSONAGEM, " + 
					"P.DESC_PERSONAGEM, " + 
					"R.GEORGE, " + 
					"R.MARTY, " + 
					"R.LORRAINE, " + 
					"R.DREMMET, " + 
					"R.BIFF " + 
					"FROM T_SVF_PERSONAGEM P INNER JOIN T_SVF_RELACIONAMENTO R\r\n" + 
					"ON (R.ID_RELACIONAMENTO = P.ID_RELACIONAMENTO)\r\n" + 
					"WHERE (P.ID_PERSONAGEM = ?)";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, idPersonagem);
			
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				personagem.setId(rs.getInt("ID_PERSONAGEM"));
				personagem.setNome(rs.getString("NM_PERSONAGEM"));
				personagem.setDescricao(rs.getString("DESC_PERSONAGEM"));
				personagem.setImagem(rs.getString("IMG_PERSONAGEM"));
				
				relacionamento.setGeorge(rs.getString("GEORGE"));
				relacionamento.setMarty(rs.getString("MARTY"));
				relacionamento.setLorraine(rs.getString("LORRAINE"));
				relacionamento.setDrEmmet(rs.getString("DREMMET"));
				relacionamento.setBiff(rs.getString("BIFF"));
				
			}
			personagem.setRelacionamento(relacionamento);
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
		return personagem;
	}

}
