package br.com.fiap.revisao.bean;

//classe abstrata -> não pode ser instanciado
// PODE conter métodos abstratos
public abstract class Pessoa {

	private String nome;
	
	public abstract void falar(); //método abstrato, sem corpo

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
