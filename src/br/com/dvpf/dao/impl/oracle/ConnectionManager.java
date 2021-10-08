package br.com.dvpf.dao.impl.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionManager {
	private static ConnectionManager instance;
	
	private ConnectionManager() throws ClassNotFoundException {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        
    }
	
	
	public static ConnectionManager getInstance() throws SQLException{
        try{
            if (instance == null) {
                instance = new ConnectionManager();
            }
        
        }
        catch(ClassNotFoundException e){
            
            throw new SQLException("O Driver JDBC nao foi encontrado!");
        }
        
        return instance;
    }
	
	
	public Connection getConnection() throws SQLException {
                
        
        String usuario = "RM85136";
        String senha = "200202";
        String jdbcUrl = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        
        
        
        try{
            return DriverManager.getConnection(jdbcUrl, usuario, senha);
        }
        catch (SQLException e) {
            System.out.println("Não foi no envio dos dados");
            e.printStackTrace();
            throw new SQLException("Erro ao abrir a conexão com banco de dados", e);
        }     
    }

}
