package br.com.projetoCatalogo.model;

public class Serie {

	private Integer Id;
	private String nome;
	private String plataforma;
	private String categoria;
	private String temporadas;
	


	public Serie(String nome, String plataforma, String categoria, String temporadas) {
		super();
		this.nome = nome;
		this.plataforma = plataforma;
		this.categoria = categoria;
		this.temporadas = temporadas;
	}

    public Serie(Integer Id, String nome, String plataforma, String categoria, String temporadas) {
        this.Id = Id;
        this.nome = nome;
        this.plataforma = plataforma;
        this.categoria = categoria;
        this.temporadas = temporadas;
    }
        
        



	public Serie() {
		// TODO Auto-generated constructor stub
	}



	public String getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(String temporadas) {
		this.temporadas = temporadas;
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
