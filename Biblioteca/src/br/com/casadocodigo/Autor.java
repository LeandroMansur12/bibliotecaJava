package br.com.casadocodigo;

public class Autor {
	
	String nome;
	String cpf;
	String email;
	
	
	public void mostrarDetalhes(){
		
		System.out.println("nome:" + nome);
		System.out.println("Cpf:" + cpf);
		System.out.println("Email:" + email);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
