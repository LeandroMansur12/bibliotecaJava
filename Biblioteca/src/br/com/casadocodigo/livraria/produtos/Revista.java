package br.com.casadocodigo.livraria.produtos;

public class Revista implements Produto, Promocional {

	private String nome;
	private String descricao;
	private double valor;
	private String editora;
	
	
	
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
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	public boolean aplicaDesconto( double porcentagem) {
		
		if(porcentagem > 0.1) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
