package br.com.fiap.revisao.bean;

public class Funcionario extends Pessoa {

	protected double salario;
	
	public double calcularBonificacao() {
		return salario/10;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public void falar() {}
	
}