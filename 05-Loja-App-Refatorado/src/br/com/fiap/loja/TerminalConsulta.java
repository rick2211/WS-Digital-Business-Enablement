package br.com.fiap.loja;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.loja.exception.ProdutoNotFoundException;
import br.com.fiap.loja.to.ProdutoTO;

public class TerminalConsulta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar dataAtual = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		EstoqueBO estoqueBO = new EstoqueBO();

		do {

			System.out.println("\nFIAPStore " + sdf.format(dataAtual.getTime()));
			System.out.print("Digite o código: ");
			int codigo = sc.nextInt();
			try {
				ProdutoTO produto = estoqueBO.consultarProduto(codigo);
				System.out.println(produto.getDescricao());
				System.out.println("Preço: " + produto.getPreco());
				System.out.println("Qtd: " + produto.getQtd());
			} catch (ProdutoNotFoundException e) {
				System.err.println("Produto nao encontrado");
				e.printStackTrace();
			}
			System.out.print("Sair? S/N ");			
		} while (sc.next().equals("N"));
		System.out.println("Obrigado!");
		sc.close();
	}

}
