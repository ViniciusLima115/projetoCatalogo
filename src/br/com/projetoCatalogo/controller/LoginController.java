/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetoCatalogo.controller;

import br.com.projetoCatalogo.DAO.UsuarioDAO;
import br.com.projetoCatalogo.view.TelaDeLogin;
import br.com.projetoCatalogo.view.TelaDeMenu;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinic
 */
public class LoginController {
    private TelaDeLogin view;

    public LoginController(TelaDeLogin view) {
        this.view = view;
    }
    
    public void Autenticar(){
        UsuarioDAO usuariodao = new UsuarioDAO();
        try {
            if(usuariodao.checkLogin(view.getjTextFieldUsuario().getText(), view.getjPasswordFieldSenha().getText())){
                new TelaDeMenu().setVisible(true);
                view.dispose();
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
