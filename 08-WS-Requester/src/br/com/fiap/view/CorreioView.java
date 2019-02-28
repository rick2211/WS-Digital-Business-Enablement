package br.com.fiap.view;

import java.util.Scanner;

import org.tempuri.CalcPrecoPrazoWSStub;
import org.tempuri.CalcPrecoPrazoWSStub.CResultado;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazo;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoResponse;

public class CorreioView {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Codigo: ");
		String codigo = sc.nextLine();
		System.out.println("Origem: ");
		String origem =sc.nextLine();
		System.out.println("Destino: ");
		String destino =sc.nextLine();

		
		try {
			CalcPrecoPrazoWSStub stub = new CalcPrecoPrazoWSStub();
			CalcPrazo calc = new CalcPrazo();
			calc.setNCdServico(codigo);
			calc.setSCepOrigem(origem);
			calc.setSCepDestino(destino);
			CalcPrazoResponse resp = stub.calcPrazo(calc);
			
			
			System.out.println("Prazo: " + resp.getCalcPrazoResult().getServicos().getCServico()[0].getPrazoEntrega());
			System.out.println("Data maxima: " + resp.getCalcPrazoResult().getServicos().getCServico()[0].getDataMaxEntrega());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
