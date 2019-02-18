package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class Exercicio06 {

	public static void main(String[] args) {
		//Instanciar as classes e atribuir valores
		ContaCorrente cc = new ContaCorrente(1, 2,
				new GregorianCalendar(1999, Calendar.AUGUST, 2),
				1000, TipoConta.PREMIUM);
		
		ContaPoupanca cp = new ContaPoupanca(1, 3, 
				Calendar.getInstance(), 
				5000, 1);
		
		System.out.println(cc);
	}
	
}






