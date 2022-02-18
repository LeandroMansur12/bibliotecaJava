package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.Autor;

public class MiniLivro  extends Livro{
	
	public MiniLivro(Autor autor) {
		super(autor);
	}

	@Override
	public boolean aplicaDesconto(double porcentagem) {
		return false;
	}
}
