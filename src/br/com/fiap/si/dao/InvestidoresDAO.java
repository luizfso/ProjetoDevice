package br.com.fiap.si.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.si.bean.Investidores;
import br.com.fiap.si.factory.ConnectionFactory;

public class InvestidoresDAO {

Connection conn = null;
	
	public InvestidoresDAO(){
		
		try{
			conn = ConnectionFactory.getConnection();
		}
		catch(SQLException ex){ }
	}
	
	public void insert(Investidores i){

		String sql = "INSERT INTO tb_investidores (nome, email, telefone, endereco) VALUES (?,?,?,?)";
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, i.getNome());
			stmt.setString(2, i.getEmail());
			stmt.setString(3, i.getTelefone());
			stmt.setString(4, i.getEndereco());
					
			stmt.executeUpdate();

		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
	}

	
	public void update(Investidores i){

		String sql = "UPDATE tb_investidores SET nome = ?, email = ?, telefone = ?, endereco = ?, WHERE id = ?";
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, i.getNome());
			stmt.setString(2, i.getEmail());
			stmt.setString(3, i.getTelefone());
			stmt.setString(4, i.getEndereco());
			stmt.setInt(5, i.getId());
					
			stmt.executeUpdate();

		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
	}
	
	public void delete(Integer id){

		String sql = "DELETE FROM tb_investidores WHERE id = ?";
		
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
	
	public List<Investidores> getAll(){

		String sql = "SELECT id, nome, email, telefone, endereco FROM tb_investidores ORDER BY nome";
		
		List<Investidores> investidoress = null;
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();

			investidoress = new ArrayList<Investidores>();
			
			while(rs.next()){
				Investidores i = new Investidores();
				i.setId(rs.getInt("id"));
				i.setNome(rs.getString("nome"));
				i.setEmail(rs.getString("email"));
				i.setTelefone(rs.getString("telefone"));
				i.setEndereco(rs.getString("endereco"));
				
				investidoress.add(i);
			}
			
		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
		return investidoress;
		
	}
	
	public Investidores getByPK(Integer id){

		String sql = "SELECT id, nome, email, telefone, endereco FROM tb_investidores WHERE id = ?";
		
		Investidores i = null;
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();

			
			if(rs.next()){
				i = new Investidores();
				i.setId(rs.getInt("id"));
				i.setNome(rs.getString("nome"));
				i.setEmail(rs.getString("email"));
				i.setTelefone(rs.getString("telefone"));
				i.setEndereco(rs.getString("endereco"));
			}
			
		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
		return i;
		
	}
	
	public List<Investidores> getByNome(String nome){

		String sql = "SELECT id, nome, email, telefone, endereco FROM tb_investidores WHERE nome LIKE ? ORDER BY nome";
		
		List<Investidores> investidoress = null;
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, '%' + nome + '%');
			
			ResultSet rs = stmt.executeQuery();

			investidoress = new ArrayList<Investidores>();
			
			while(rs.next()){
				Investidores i = new Investidores();
				i.setId(rs.getInt("id"));
				i.setNome(rs.getString("nome"));
				i.setEmail(rs.getString("email"));
				i.setTelefone(rs.getString("telefone"));
				i.setTelefone(rs.getString("endereco"));
				
				investidoress.add(i);
			}
			
		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
		return investidoress;
		
	}
	
	public Investidores getByNomes(String nome){

		String sql = "SELECT id, nome, email, telefone, endereco FROM tb_investidores WHERE nome = ?";
		
		Investidores i = null;
		
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, nome);
			
			ResultSet rs = stmt.executeQuery();

			
			if(rs.next()){
				i = new Investidores();
				i.setId(rs.getInt("id"));
				i.setNome(rs.getString("nome"));
				i.setEmail(rs.getString("email"));
				i.setTelefone(rs.getString("telefone"));
				i.setEndereco(rs.getString("endereco"));
			}
			
		}
		catch(SQLException ex){ 
			ex.printStackTrace();
		}
		finally{
			
		}
		
		return i;
		
	}	


}

