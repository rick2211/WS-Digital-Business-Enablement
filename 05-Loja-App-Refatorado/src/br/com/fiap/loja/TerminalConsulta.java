package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.apache.log4j.Logger;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.loja.exception.ProdutoNaoEncontradoException;
import br.com.fiap.loja.to.ProdutoTO;

public class TerminalConsulta {

	private static Logger log = Logger.getLogger(TerminalConsulta.class);
	
	//Camada de apresentação
	public static void main(String[] args) {
		
		log.warn("Inicializando a aplicação");
		
		Scanner sc = new Scanner(System.in);
		EstoqueBO bo = new EstoqueBO();
		Calendar data = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("FIAPStore " + sdf.format(data.getTime()));
		System.out.print("Digite o código: ");
		int codigo = sc.nextInt();
		
		try {
			ProdutoTO produto = bo.consultarProduto(codigo);
			System.out.println(produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Qdt: " + produto.getQuantidade());
		} catch (ProdutoNaoEncontradoException e) {
			System.err.println("Produto não encontrado");
		}
		
		sc.close();
		
		log.warn("Finalizando a aplicação");
	}
	
}





