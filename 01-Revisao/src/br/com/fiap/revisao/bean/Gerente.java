package br.com.fiap.revisao.bean;

public class Gerente extends Funcionario {

	//sobrescrita do m�todo - Polimorfismo
	@Override
	public double calcularBonificacao() {
		return salario*2;
	}

	//invocado quando o objeto � passado no systou
	@Override
	public String toString() {
		return "Sal�rio: " + salario;
	}
	
}