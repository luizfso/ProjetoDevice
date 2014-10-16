package br.com.fiap.si.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.si.bean.Cliente;
import br.com.fiap.si.factory.ConnectionFactory;

public class ClienteDAO {

	Connection conn = null;
	
	public ClienteDAO(){
		
		try{
			conn = ConnectionFactory.getConnection();
		}
		catch(SQLException ex){ }
	}
	
	public void insert(Cliente c){

		String sql = "INSERT INTO tb_clientes (nome, email, telefone) VALUES (?,?,?)";
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEmail());
			stmt.setString(3, c.getTelefone());
					
			stmt.executeUpdate();

		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
	}

	
	public void update(Cliente c){

		String sql = "UPDATE tb_clientes SET nome = ?, email = ?, telefone = ? WHERE id = ?";
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEmail());
			stmt.setString(3, c.getTelefone());
			stmt.setInt(4, c.getId());
					
			stmt.executeUpdate();

		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
	}
	
	public void delete(Integer id){

		String sql = "DELETE FROM tb_clientes WHERE id = ?";
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, id);
					
			stmt.executeUpdate();

		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
	}
	
	public List<Cliente> getAll(){

		String sql = "SELECT id, nome, email, telefone FROM tb_clientes ORDER BY nome";
		
		List<Cliente> clientes = null;
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();

			clientes = new ArrayList<Cliente>();
			
			while(rs.next()){
				Cliente c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setTelefone(rs.getString("telefone"));
				
				clientes.add(c);
			}
			
		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
		return clientes;
		
	}
	
	public Cliente getByPK(Integer id){

		String sql = "SELECT id, nome, email, telefone FROM tb_clientes WHERE id = ?";
		
		Cliente c = null;
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();

			
			if(rs.next()){
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setTelefone(rs.getString("telefone"));
			}
			
		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
		return c;
		
	}
	
	public List<Cliente> getByNome(String nome){

		String sql = "SELECT id, nome, email, telefone FROM tb_clientes WHERE nome LIKE ? ORDER BY nome";
		
		List<Cliente> clientes = null;
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, '%' + nome + '%');
			
			ResultSet rs = stmt.executeQuery();

			clientes = new ArrayList<Cliente>();
			
			while(rs.next()){
				Cliente c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setTelefone(rs.getString("telefone"));
				
				clientes.add(c);
			}
			
		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
		return clientes;
		
	}
	
	public Cliente getByNomes(String nome){

		String sql = "SELECT id, nome, email, telefone, FROM tb_clientes WHERE nome = ?";
		
		Cliente c = null;
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, nome);
			
			ResultSet rs = stmt.executeQuery();

			
			if(rs.next()){
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setTelefone(rs.getString("telefone"));
			}
			
		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
		return c;
		
	}	


}
