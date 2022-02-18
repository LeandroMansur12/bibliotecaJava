package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.Autor;

public class Ebook extends Livro implements Promocional{
	
	private String watermark;
	
	
	public Ebook(Autor autor) {
		super(autor);
		
	}
	
	
	
	public boolean aplicaDescontoEbook(double porcentagem) {
		
		if(porcentagem > 1.5) {
			return false;
		}else {
			
			this.valor  -= this.valor* porcentagem;
			return true;
		}
	}
	

	public String getWatermark() {
		return watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
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
