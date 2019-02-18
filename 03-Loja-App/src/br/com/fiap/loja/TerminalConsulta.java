package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TerminalConsulta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar dataAtual = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		do {

			System.out.println("\nFIAPStore " + sdf.format(dataAtual.getTime()));
			System.out.print("Digite o código: ");
			int codigo = sc.nextInt();

			switch (codigo) {
			case 401:
				System.out.println("Camiseta Branca");
				break;
			case 402:
				System.out.println("Camiseta Azul");
				break;
			case 403:
				System.out.println("Camiseta Rosa");
				break;
			default:
				System.out.println("Produto não encontrado");
			}

			System.out.print("Sair? S/N ");			
		} while (sc.next().equals("N"));
		System.out.println("Obrigado!");
		sc.close();
	}

}
