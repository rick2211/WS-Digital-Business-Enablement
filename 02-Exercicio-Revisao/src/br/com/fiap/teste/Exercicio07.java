package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.TipoConta;

public class Exercicio07 {

	public static void main(String[] args) {
		List<ContaCorrente> lista = new ArrayList<>();
		
		lista.add(new ContaCorrente(1, 2, 
				new GregorianCalendar(2010, Calendar.APRIL, 20),
				100, TipoConta.COMUM));
		
		lista.add(new ContaCorrente(1, 3, 
				new GregorianCalendar(2015,Calendar.DECEMBER, 25),
				50000, TipoConta.ESPECIAL));
		
		lista.add(new ContaCorrente(1,4,
				Calendar.getInstance(), 0, TipoConta.PREMIUM));

		for (ContaCorrente cc : lista) {
			System.out.println(cc);
		}
		
	}
	
}
