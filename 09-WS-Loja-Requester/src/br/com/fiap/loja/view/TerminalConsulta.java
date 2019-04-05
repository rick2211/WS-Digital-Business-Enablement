package br.com.fiap.loja.view;

import java.rmi.RemoteException;
import java.util.Scanner;

import org.apache.axis2.AxisFault;

import br.com.fiap.loja.bo.EstoqueBOStub;
import br.com.fiap.loja.bo.EstoqueBOStub.ConsultarProduto;
import br.com.fiap.loja.bo.EstoqueBOStub.ConsultarProdutoResponse;
import br.com.fiap.loja.bo.EstoqueBOStub.ProdutoTO;

public class TerminalConsulta {

	public static void main(String[] args) {
		
		try {
			//Instanciar a classe que chama o web service (stub)
			EstoqueBOStub stub = new EstoqueBOStub();
			//Ler o código
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o código");
			int codigo = sc.nextInt();
			sc.close();
			//Instanciar a classe que armazena o código que será enviado
			ConsultarProduto param = new ConsultarProduto();
			param.setCodigo(codigo);
			//Chamar o webservice e recupera o objeto que possui a resposta
			ConsultarProdutoResponse resp = stub.consultarProduto(param);
			//Recupera e exibe os dados retornados pelo web service
			ProdutoTO produto = resp.get_return();
			System.out.println(produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Qtd: " + produto.getQuantidade());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} 
	}
	
}
