package br.com.projetoCatalogo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;


import br.com.projetoCatalogo.factory.ConnectionFactory;
import br.com.projetoCatalogo.model.Filme;
import br.com.projetoCatalogo.model.Serie;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FilmeDAO {
	
	public void save(Filme filme){
		
		String sql = "INSERT INTO filme(nome,plataforma,categoria,diretor,duracao) VALUES (?,?,?,?,?)";

		Connection conn = null;

		PreparedStatement stm = null;

		try {
			conn = ConnectionFactory.createConnection();

			stm = conn.prepareStatement(sql);

			stm.setString(1, filme.getNome());
			stm.setString(2, filme.getPlataforma());
			stm.setString(3, filme.getCategoria());
			stm.setString(4, filme.getDiretor());
			stm.setString(5, filme.getDuracao());

			stm.execute();

			System.out.println("Filme Cadastrado com Sucesso");

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if(stm!=null){
					stm.close();
				}
				if(conn!=null){
					conn.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
        
        public ArrayList<Filme> read() throws SQLException{
    	
    	Connection conn = ConnectionFactory.createConnection();
        PreparedStatement stm = null;
        
        ResultSet rs = null;

        
        ArrayList<Filme>filmes = new ArrayList<>();
        
        try{
            stm = conn.prepareStatement("SELECT * FROM filme");
            rs = stm.executeQuery();
        
        while(rs.next()){
            Filme filme = new Filme();
            
            filme.setId(rs.getInt("Id"));
            filme.setNome(rs.getString("nome"));
            filme.setPlataforma(rs.getString("plataforma"));
            filme.setCategoria(rs.getString("categoria"));
            filme.setDiretor(rs.getString("diretor"));
            filme.setDuracao(rs.getString("duracao"));
            filmes.add(filme);
            }
        } catch(SQLException e){
            System.out.println(e);
        } finally{
            conn.close();
            stm.close();
            rs.close();
        }
        return filmes;

        }
        
        public void delete(Filme filme) throws SQLException{
        Connection conn = ConnectionFactory.createConnection();
        PreparedStatement stm = null;
        
        try {
            stm=conn.prepareStatement("DELETE FROM filme where Id = ?");
            stm.setInt(1, filme.getId());
            
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    	
    }
    
    public void update(Filme filme) throws SQLException{
        
        Connection conn = ConnectionFactory.createConnection();
        PreparedStatement stm = null;
        
        stm=conn.prepareStatement("UPDATE filme set nome = ?,plataforma = ?,categoria = ?,diretor = ?,duracao = ? WHERE Id = ?");
        stm.setString(1, filme.getNome());
        stm.setString(2,filme.getPlataforma());
        stm.setString(3, filme.getCategoria());
        stm.setString(4, filme.getDiretor());
        stm.setString(5, filme.getDuracao());
        stm.setInt(6,filme.getId());
        stm.executeUpdate();
        
        
    }


}
