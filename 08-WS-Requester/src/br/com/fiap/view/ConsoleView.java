package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.bo.DisciplinaBOStub;
import br.com.fiap.bo.DisciplinaBOStub.CalcularMedia;
import br.com.fiap.bo.DisciplinaBOStub.CalcularMediaResponse;

public class ConsoleView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ler os valores de nac, ps e am
		System.out.println("NAC:");
		float nac = sc.nextFloat();
		System.out.println("PS:");
		float ps = sc.nextFloat();
		System.out.println("AM:");
		float am = sc.nextFloat();
		
		try {
			//Instanciar o stub para acessar o web service
			DisciplinaBOStub stub = new DisciplinaBOStub();
			
			//Valores que serão enviados para o web service
			CalcularMedia valores = new CalcularMedia();
			valores.setAm(am);
			valores.setNac(nac);
			valores.setPs(ps);
			
			//Chamando o web service
			CalcularMediaResponse resp =
								stub.calcularMedia(valores);
			
			//Recuperar o valor retornado pelo web service
			double media = resp.get_return();
			System.out.println("Média é: " + media);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
	
}



