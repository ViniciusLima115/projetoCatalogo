package br.com.projetoCatalogo.controller;

import java.sql.Connection; 

import javax.swing.JOptionPane;

import br.com.projetoCatalogo.DAO.UsuarioDAO;
import br.com.projetoCatalogo.factory.ConnectionFactory;
import br.com.projetoCatalogo.model.Usuario;
import br.com.projetoCatalogo.view.TelaDeCadastroUsuario;

public class CadastroController {
	
	private TelaDeCadastroUsuario view;

    public CadastroController(TelaDeCadastroUsuario view) {
        this.view = view;
    }

	
	
	public void salvaUsuario() {
		
		
		
		String usuario = view.getjTextField1Usuario().getText();
		String email = view.getjTextFieldEmail().getText();
		@SuppressWarnings("deprecation")
		String senha = view.getjPasswordFieldSenha().getText();
		
		Usuario usuario1 = new Usuario(usuario,email,senha);
		
		try {
		
		Connection conn = ConnectionFactory.createConnection();
		UsuarioDAO usuariodao = new UsuarioDAO(conn);
		usuariodao.Insert(usuario1);
		
		JOptionPane.showMessageDialog(null, "Usuario Salvo com sucesso!!");
		
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}


	
	
	
	
}
