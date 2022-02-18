package br.com.casadocodigo.livraria.teste;
import br.com.casadocodigo.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivro {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Leandro mansur");
		autor.setCpf("22.543.2324.99");
		autor.setEmail("elellala@gmail.com");
		
		
		
		Livro livro =  new LivroFisico(autor);
		livro.setNome("aprendendo java do jeito certo");
		livro.setDescricao("aprenda todo dia um pouco");
		livro.setValor(60);
		livro.setIsbn("231-131-131-132");
		
		
		
		
		
		livro.mostrarDetalhes();
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("joao pepeca");
		outroAutor.setCpf("123.242.1231.432");
		outroAutor.setEmail("joaopapacaa@gamil.com");
		
		
		
		
		Livro outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("aprendendo php");
		outroLivro.setDescricao("desenvolmedo sistemas web");
		outroLivro.setValor(75);
		outroLivro.setIsbn("3123-2423-242-242");
		
		
		
		outroLivro.mostrarDetalhes();	
		
		Autor novoAutor = new Autor();
		novoAutor.setNome("Lele Mansur");
		novoAutor.setCpf("5465.65664-56");
		novoAutor.setEmail("Lelemansur@hotmail.com");
		
		Ebook ebook = new Ebook(novoAutor);
		ebook.setNome("pyton nos dias atuais");
		ebook.setDescricao("aprenda como se faz de verdade");
		ebook.setValor(70);
		ebook.setIsbn("234266-654-353-35");
		
		ebook.aplicaDescontoEbook(4);
		
		
		ebook.mostrarDetalhes();
		
		
	}

	private static Livro LivroFisico(Autor autor) {
		// TODO Auto-generated method stub
		return null;
	}



}
