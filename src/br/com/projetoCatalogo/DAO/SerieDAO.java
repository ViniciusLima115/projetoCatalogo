package br.com.projetoCatalogo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetoCatalogo.factory.ConnectionFactory;
import br.com.projetoCatalogo.model.Serie;
import br.com.projetoCatalogo.model.Usuario;
import javax.swing.JOptionPane;

public class SerieDAO {
	
    public void save(Serie serie){
		
		String sql = "INSERT INTO serie(nome,plataforma,categoria,temporadas) VALUES (?,?,?,?)";

		Connection conn = null;

		PreparedStatement stm = null;

		try {
			conn = ConnectionFactory.createConnection();

			stm = conn.prepareStatement(sql);

			stm.setString(1, serie.getNome());
			stm.setString(2, serie.getPlataforma());
			stm.setString(3, serie.getCategoria());
			stm.setString(4, serie.getTemporadas());
			

			stm.execute();

            System.out.println("Serie Cadastrada com Sucesso");

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
    
    public List<Serie> read() throws SQLException{
    	
    	Connection conn = ConnectionFactory.createConnection();
        PreparedStatement stm = null;
        
        ResultSet rs = null;

        
        ArrayList<Serie>series = new ArrayList<>();
        
        try{
            stm = conn.prepareStatement("SELECT * FROM serie");
            rs = stm.executeQuery();
        
        while(rs.next()){
            Serie serie = new Serie();
            
            serie.setId(rs.getInt("Id"));
            serie.setNome(rs.getString("nome"));
            serie.setPlataforma(rs.getString("plataforma"));
            serie.setCategoria(rs.getString("categoria"));
            serie.setTemporadas(rs.getString("temporadas"));
            series.add(serie);
            }
        } catch(SQLException e){
            System.out.println(e);
        } finally{
            conn.close();
            stm.close();
            rs.close();
        }
        return series;
    }

   
    public void delete(Serie serie) throws SQLException{
        Connection conn = ConnectionFactory.createConnection();
        PreparedStatement stm = null;
        
        try {
            stm=conn.prepareStatement("DELETE FROM serie where Id = ?");
            stm.setInt(1, serie.getId());
            
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    	
    }
    
    public void update(Serie serie) throws SQLException{
        
        Connection conn = ConnectionFactory.createConnection();
        PreparedStatement stm = null;
        
        stm=conn.prepareStatement("UPDATE serie set nome = ?,plataforma = ?,categoria = ?,temporadas = ? WHERE Id = ?");
        stm.setString(1, serie.getNome());
        stm.setString(2,serie.getPlataforma());
        stm.setString(3, serie.getCategoria());
        stm.setString(4, serie.getTemporadas());
        stm.setInt(5,serie.getId());
        stm.executeUpdate();
        
        
    }

}