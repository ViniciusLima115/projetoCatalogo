package br.com.projetoCatalogo.model;

public class Usuario {
	private int Id;
	private String usuario;
	private String email;
	private String senha;
	
	
	
	
	public Usuario(int id, String usuario, String email, String senha) {
		super();
		Id = id;
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
	}
	
	
	
	
	public Usuario(String usuario, String email, String senha) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
	}




	public Usuario(String usuario2, char[] senha2) {
		// TODO Auto-generated constructor stub
	}

    public Usuario() {}




	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	
	
}
