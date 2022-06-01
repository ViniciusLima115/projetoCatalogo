package br.com.projetoCatalogo.model;

import java.util.Scanner;

import br.com.projetoCatalogo.DAO.FilmeDAO;
import br.com.projetoCatalogo.DAO.SerieDAO;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		FilmeDAO filmedao = new FilmeDAO();
		SerieDAO seriedao = new SerieDAO();
		Serie serie = new Serie();
		Filme filme = new Filme();

		//CadastroFilmes(filme, filmedao);
		//CadastroSeries(serie, seriedao);
                seriedao.read();
	}


	public static void CadastroFilmes(Filme filme,FilmeDAO filmedao){
		String nome;
		String plataforma;
		String categoria;
		String diretor;
		String duracao;
		Scanner scan = new Scanner(System.in);
		System.out.println("CADASTRO DE FILMES");

		System.out.println("Digite o nome do Filme:");
		nome = scan.nextLine();
		filme.setNome(nome);
		System.out.println("Digite a plataforma:");
		plataforma = scan.nextLine();
		filme.setPlataforma(plataforma);
		System.out.println("Digite a Categoria:");
		categoria = scan.nextLine();
		filme.setCategoria(categoria);
		System.out.println("Digite o Nome do Diretor");
		diretor = scan.nextLine();
		filme.setDiretor(diretor);
		System.out.println("Digite a Duração do filme");
		duracao = scan.nextLine();
		filme.setDuracao(duracao);

		filmedao.save(filme);

		
	}

	public static void CadastroSeries(Serie serie,SerieDAO seriedao){
		String nome;
		String plataforma;
		String categoria;
		String temporadas;

		Scanner scan = new Scanner(System.in);
		System.out.println("CADASTRO DE SERIES");

		System.out.println("Digite o nome da Serie:");
		nome = scan.nextLine();
		serie.setNome(nome);
		System.out.println("Digite a plataforma:");
		plataforma = scan.nextLine();
		serie.setPlataforma(plataforma);
		System.out.println("Digite a Categoria:");
		categoria = scan.nextLine();
		serie.setCategoria(categoria);
		System.out.println("Digite a Quantidade de Temporadas:");
		temporadas = scan.nextLine();
		serie.setTemporadas(temporadas);
		

		seriedao.save(serie);

		
	}

}
