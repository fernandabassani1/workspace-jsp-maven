package br.com.sisvenda.model;

public class Cliente {
			
	//atributo 
	private Integer id;
	private String nome;
	private String sobrenome;
	private String email;
	private String documento;
	private String telefone;
	private String endereco;
	private String cep;
	private String senha;
	
	//Construtor vazio - padrao
	public Cliente() {}


	public Cliente(Integer id, String nome, String sobrenome, String email, String documento, String telefone,
			String endereco, String cep, String senha) {
		
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.documento = documento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cep = cep;
		this.senha = senha;
	}




	public String getCep() {
		return cep;
	}




	public void setCep(String cep) {
		this.cep = cep;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getSobrenome() {
		return sobrenome;
	}




	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getDocumento() {
		return documento;
	}




	public void setDocumento(String documento) {
		this.documento = documento;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}




	public String getEndereco() {
		return endereco;
	}




	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}




	public String getSenha() {
		return senha;
	}




	public void setSenha(String senha) {
		this.senha = senha;
	}




	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", documento="
				+ documento + ", telefone=" + telefone + ", endereco=" + endereco + ", cep=" + cep + ", senha=" + senha
				+ "]";
	}
			

	

}
