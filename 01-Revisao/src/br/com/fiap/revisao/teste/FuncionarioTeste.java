package br.com.fiap.revisao.teste;

import br.com.fiap.revisao.bean.Funcionario;
import br.com.fiap.revisao.bean.Gerente;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f = new Gerente();
		f.setSalario(900);
		
		Gerente g = (Gerente) f; //cast alterar o tipo de dado
		
		System.out.println(f.calcularBonificacao());
		
		String salario = (f.getSalario()>1000)?"Maior":"Menor";
		
		System.out.println(salario);
				
	}
	
}


