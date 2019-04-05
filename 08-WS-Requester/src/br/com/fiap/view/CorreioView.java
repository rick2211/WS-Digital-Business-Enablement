package br.com.fiap.view;

import java.util.Scanner;

import org.tempuri.CalcPrecoPrazoWSStub;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazo;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoResponse;

public class CorreioView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Calcular o prazo de entrega:
		//SEDEX 40010
		//Lendo os valores
		System.out.println("CEP Origem:");
		String origem = sc.next();
		System.out.println("CEP Destino:");
		String destino = sc.next();
		
		try {
			//Objeto para chamar o web service
			CalcPrecoPrazoWSStub stub = new CalcPrecoPrazoWSStub();
			
			//Valores que serão enviados para o web service
			CalcPrazo valores = new CalcPrazo();
			valores.setNCdServico("40010");
			valores.setSCepDestino(destino);
			valores.setSCepOrigem(origem);
			
			//Chamando o web service
			CalcPrazoResponse resp = stub.calcPrazo(valores);
			
			System.out.println("Prazo: " + 
				resp.getCalcPrazoResult().getServicos()
				.getCServico()[0].getPrazoEntrega());
			
			System.out.println("Data Máxima: " + 
				resp.getCalcPrazoResult().getServicos()
				.getCServico()[0].getDataMaxEntrega());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Ler dois CEPs
		
		sc.close();
	}
	
}




