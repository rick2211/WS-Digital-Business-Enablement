package br.com.fiap.bo;

import br.com.fiap.loja.exception.ProdutoNotFoundException;
import br.com.fiap.loja.to.ProdutoTO;

public class EstoqueBO {

	public ProdutoTO consultarProduto(int codigo) throws ProdutoNotFoundException {
		ProdutoTO produto;
		
		switch (codigo) {
		case 401:
			produto = new ProdutoTO(401,10,100,"Camiseta Branca");
			break;
		case 402:
			produto = new ProdutoTO(402,10,100,"Camiseta Azul");
			break;
		case 403:
			produto = new ProdutoTO(403,10,100,"Camiseta Rosa");
			break;
		
		default:
			throw new ProdutoNotFoundException();
			
		}
		return produto;
	}
}
