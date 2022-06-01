/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetoCatalogo.controller;

import br.com.projetoCatalogo.DAO.FilmeDAO;
import br.com.projetoCatalogo.DAO.SerieDAO;
import br.com.projetoCatalogo.factory.ConnectionFactory;
import br.com.projetoCatalogo.model.Filme;
import br.com.projetoCatalogo.model.Serie;
import br.com.projetoCatalogo.view.TelaDeCadastroDeSeries;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinic
 */
public class CadastroSeriesController {
    private TelaDeCadastroDeSeries view;

    public CadastroSeriesController(TelaDeCadastroDeSeries view) {
        this.view = view;
    }
    
    public void salvarSeries() {
		
		String nome = view.getjTextFieldNomeSerie().getText();
		String plataforma = view.getjTextFieldPlataformaSerie().getText();
		String categoria = view.getjTextFieldCategoriaSerie().getText();
		String temporadas = view.getjTextFieldTemporadaSerie().getText();
		
		
		Serie serie = new Serie(nome, plataforma, categoria, temporadas);
		
try {
			
			Connection conn = ConnectionFactory.createConnection();
			 SerieDAO seriedao = new SerieDAO();
			seriedao.save(serie);
			JOptionPane.showMessageDialog(null, "Serie Salva com sucesso!!");
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
       
            
            
}
