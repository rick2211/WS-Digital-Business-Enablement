package br.com.fiap.revisao.bean;

//classe abstrata -> n�o pode ser instanciado
// PODE conter m�todos abstratos
public abstract class Pessoa {

	private String nome;
	
	public abstract void falar(); //m�todo abstrato, sem corpo

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
