package br.com.projetoCatalogo.controller;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.projetoCatalogo.DAO.FilmeDAO;
import br.com.projetoCatalogo.factory.ConnectionFactory;
import br.com.projetoCatalogo.model.Filme;
import br.com.projetoCatalogo.view.TelaDeCadastroDeFilmes;

public class CadastroFilmeController {
	
	private TelaDeCadastroDeFilmes view;

    public CadastroFilmeController(TelaDeCadastroDeFilmes view) {
        this.view = view;
    }

	
	
	public void salvarFilmes() {
		
		String nome = view.getjTextFieldNome().getText();
		String plataforma = view.getjTextFieldPlataforma().getText();
		String categoria = view.getjTextFieldCategoria().getText();
		String diretor = view.getjTextFieldDiretor().getText();
		String duracao = view.getjTextFieldDuracao().getText();
		
		Filme filme = new Filme(nome, plataforma, categoria, diretor, duracao);
		
try {
			
			Connection conn = ConnectionFactory.createConnection();
			FilmeDAO filmedao = new FilmeDAO();
			filmedao.save(filme);
			JOptionPane.showMessageDialog(null, "Filme Salvo com sucesso!!");
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
