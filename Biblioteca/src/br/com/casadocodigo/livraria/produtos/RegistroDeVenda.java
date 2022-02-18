package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.Autor;

public class RegistroDeVenda {

	public static void main(String[] args) {
		
		
		Autor autor = new Autor();
		autor.setNome("Mauriciao aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("test Driving na programaao");
		fisico.setValor(70);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("programa na veia");
		ebook.setValor(59);
		
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);

		
		System.out.println("total:" + carrinho.getTotal());
		
		Produto[] produtos = carrinho.getProdutos();
		
		for (int i = 0; i <= produtos.length; i++) {
			try {
		Produto produto = produtos[i];
		if (produto != null) {
		System.out.println(produto.getValor());
		}
		}
		
		catch (ArrayIndexOutOfBoundsException e) {  
			System.out.println("deu exception no indice: "+ i);
		}
	}
		System.out.println("fui executado");
	}
	
	
}
	
	

	
	
		

