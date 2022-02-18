package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.Autor;

public class LivroFisico extends Livro implements Promocional  {
	
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.5;
		
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean aplicaDesconto(double porcentagem) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

	
	

	


}
