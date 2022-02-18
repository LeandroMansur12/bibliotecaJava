package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.Autor;

public abstract class Livro implements Produto {
	
	private String nome;
	private String descricao;
	protected double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor) {
		if(autor == null) {
			throw new RuntimeException(
					"o livro ainda nao pode ser nulo!");
		}
		this.isbn ="000-000-000-000";
		this.autor = autor;
	}
	
	
	
	public Livro( String nome, String descricao, double valor, String isbn ) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.isbn = isbn;
	}
	
	
	
	public Livro() {
		System.out.println("um novo livro Criado");
		this.isbn="000-0000-000-00-00";
	}
	
	public void mostrarDetalhes() {
		String mensagem = "mostrar detalhes do livro";
		System.out.println("*"+mensagem+"*");
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(isbn);
		autor.mostrarDetalhes();
		System.out.println("------");
	}
	
	public abstract boolean aplicaDesconto(double porcentagem);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	
	

}
