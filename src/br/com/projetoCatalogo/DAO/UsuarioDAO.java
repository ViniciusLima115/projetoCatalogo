package br.com.projetoCatalogo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.projetoCatalogo.factory.ConnectionFactory;
import br.com.projetoCatalogo.model.Serie;
import br.com.projetoCatalogo.model.Usuario;
import br.com.projetoCatalogo.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class UsuarioDAO {

	

	private Connection conn;


	public UsuarioDAO(Connection conn2) {
		// TODO Auto-generated constructor stub
	}


	public UsuarioDAO() {
		// TODO Auto-generated constructor stub
	}


	public void Insert(Usuario usuario) throws SQLException {

		String sql = "INSERT INTO usuario(usuario,email,senha) values(?,?,?)";

		Connection conn = null;

		PreparedStatement stm = null;

		try {
			conn = ConnectionFactory.createConnection();

			stm = conn.prepareStatement(sql);

			stm.setString(1, usuario.getUsuario());
			stm.setString(2, usuario.getEmail());
			stm.setString(3, usuario.getSenha());
			

			stm.execute();

			System.out.println("Usuario Cadastrado com Sucesso");

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

	


	public boolean checkLogin(String usuario,String senha) throws SQLException{
    	
    	Connection conn = ConnectionFactory.createConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean check = false;
        
        try{
            stm = conn.prepareStatement("SELECT * FROM usuario WHERE usuario = ? and senha = ?");
            stm.setString(1, usuario);
            stm.setString(2, senha);
            rs = stm.executeQuery();
        
        if(rs.next()){
            
            check = true;
            
            }
        } catch(SQLException e){
            System.out.println(e);
        } finally{
            conn.close();
            stm.close();
            rs.close();
        }
        return check;
        }

        public List<Usuario> read() throws SQLException{
    	
    	Connection conn = ConnectionFactory.createConnection();
        PreparedStatement stm = null;
        
        ResultSet rs = null;

        
        ArrayList<Usuario>usuarios = new ArrayList<>();
        
        try{
            stm = conn.prepareStatement("SELECT * FROM usuario");
            rs = stm.executeQuery();
        
        while(rs.next()){
            Usuario usuario = new Usuario();
            
            usuario.setId(rs.getInt("Id"));
            usuario.setUsuario(rs.getString("usuario"));
            usuario.setEmail(rs.getString("email"));
            usuario.setSenha(rs.getString("senha"));
            
            usuarios.add(usuario);
            }
        } catch(SQLException e){
            System.out.println(e);
        } finally{
            conn.close();
            stm.close();
            rs.close();
        }
        return usuarios;
}
        public void delete(Usuario usuario) throws SQLException{
        Connection conn = ConnectionFactory.createConnection();
        PreparedStatement stm = null;
        
        try {
            stm=conn.prepareStatement("DELETE FROM usuario where Id = ?");
            stm.setInt(1, usuario.getId());
            
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    	
    }
        
         public void update(Usuario usuario) throws SQLException{
        
        Connection conn = ConnectionFactory.createConnection();
        PreparedStatement stm = null;
        
        stm=conn.prepareStatement("UPDATE usuario set usuario = ?,email = ?,senha = ? WHERE Id = ?");
        stm.setString(1, usuario.getUsuario());
        stm.setString(2,usuario.getEmail());
        stm.setString(3, usuario.getSenha());
        stm.setInt(4, usuario.getId());
        
        stm.executeUpdate();
        
        
    }

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

