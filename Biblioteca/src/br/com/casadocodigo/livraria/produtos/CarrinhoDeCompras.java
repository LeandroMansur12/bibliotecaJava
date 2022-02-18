package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras {
	
	
	private double total;
	private Object carrinho;
	private Produto[]produtos = new Produto[10];
	private int contador = 0;
	


	public void adiciona(Produto produto) {
		System.out.println("adicionando mais produto: " + produto);
		this.produtos[1]=produto;
		this.contador++;
		this.total = produto.getValor();
	}
	
	
	
	
	public Produto[] getProdutos() {
		System.out.println("o valor adicionado:");
		return produtos;
	}




	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}




	public void adiciona(LivroFisico livro) {
		System.out.println("adcionando:" + livro);
		livro.aplicaDesconto(0.5);
		total+= livro.getValor();
		
	}
	
	public void adicionaRevista( Revista revista) {
		System.out.println("Adicionando Revista" + revista);
		revista.aplicaDesconto(0.3);
		total+=revista.getValor();
	}
	
	
	
	public void adiciona(Ebook ebook) {
		System.out.println("adcionando:" + ebook);
		ebook.aplicaDesconto(0.15);
		total+= ebook.getValor();
	}
	
	
	

	public double getTotal() {
		return total;
	}
	
	
	
}
