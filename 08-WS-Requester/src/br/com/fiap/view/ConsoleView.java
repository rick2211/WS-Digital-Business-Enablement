package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.bo.CambioBOStub;
import br.com.fiap.bo.CambioBOStub.ConverterDolarReal;
import br.com.fiap.bo.CambioBOStub.ConverterDolarRealResponse;

public class ConsoleView {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dollar:");
		double dollar = sc.nextDouble();
	
		
		try {
			CambioBOStub stub = new CambioBOStub();
			ConverterDolarReal dolarReal = new ConverterDolarReal();
			dolarReal.setDolar(dollar);
			ConverterDolarRealResponse  resp = stub.converterDolarReal(dolarReal);
			
			double cambio  = resp.get_return();
			System.out.println(cambio);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		sc.close();
	}

}
