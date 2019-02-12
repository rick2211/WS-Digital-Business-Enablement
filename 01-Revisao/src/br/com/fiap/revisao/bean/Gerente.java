package br.com.fiap.revisao.bean;

public class Gerente extends Funcionario {

	//sobrescrita do método - Polimorfismo
	@Override
	public double calcularBonificacao() {
		return salario*2;
	}

	//invocado quando o objeto é passado no systou
	@Override
	public String toString() {
		return "Salário: " + salario;
	}
	
}