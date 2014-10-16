package br.com.fiap.si.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.si.factory.ConnectionFactory;

	public class UsuarioDAO {

		Connection conn = null;
		
		public UsuarioDAO(){
			
			try{
				conn = ConnectionFactory.getConnection();
			}
			catch(SQLException ex){ }
		}
		
		public boolean login(String login, String senha){

			String sql = "SELECT * FROM tb_usuarios WHERE login = ? and senha = ?";
			
			try{
				PreparedStatement stmt = conn.prepareStatement(sql);
				
				stmt.setString(1, login);
				stmt.setString(2, senha);
						
				ResultSet rs = stmt.executeQuery();
				
				if(rs.next())
					return true;

			}
			catch(SQLException ex){ 
				ex.printStackTrace();
			}
			finally{
				
			}
			
			return false;
		}

	}
