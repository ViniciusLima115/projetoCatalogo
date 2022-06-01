package br.com.projetoCatalogo.model;

public class Filme  {

	 private Integer Id;
	 private String nome;
	 private String plataforma;
	 private String categoria;
	 private String diretor;
	 private String duracao;
	 
	
	public Filme(){}
	
	

	public Filme(String nome, String plataforma, String categoria, String diretor, String duracao) {
		super();
		this.nome = nome;
		this.plataforma = plataforma;
		this.categoria = categoria;
		this.diretor = diretor;
		this.duracao = duracao;
	}



	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
   
    public Integer getId() {
        return Id;
    }

   
    public void setId(Integer Id) {
        this.Id = Id;
    }

   
    public String getNome() {
        return nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

  
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
