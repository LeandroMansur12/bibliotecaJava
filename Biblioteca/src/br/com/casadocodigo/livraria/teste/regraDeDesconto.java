package br.com.casadocodigo.livraria.teste;
import br.com.casadocodigo.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class regraDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("leandro mansur");
		
		Livro livro = new LivroFisico( autor) ; 
		livro.setValor(70);
		
		System.out.println("valor atual:" + livro.getValor());
		
		if(livro.aplicaDesconto(0.5)) {
			System.out.println("nao ocorrera o desconto e 30%, trouxao");
		}
		else {
			
			System.out.println("voce tem direito ao desconto, Parabéns valor: "+ livro.getValor());
		}
		
	}

}
