package br.com.fiap.loja.bo;

import org.apache.log4j.Logger;

import br.com.fiap.loja.exception.ProdutoNaoEncontradoException;
import br.com.fiap.loja.to.ProdutoTO;

//Camada de negócio
public class EstoqueBO {

	private static Logger log = Logger.getLogger(EstoqueBO.class);
	
	public ProdutoTO consultarProduto(int codigo) throws ProdutoNaoEncontradoException {
		ProdutoTO produto;
		
		log.debug("Código pesquisado: " + codigo);
		
		switch (codigo) {
		case 401:
			produto = new ProdutoTO(401, 10, 100, "Camiseta Branca");
			break;
		case 402:
			produto = new ProdutoTO(402, 20, 50, "Camiseta Azul");
			break;
		case 403:
			produto = new ProdutoTO(403, 30, 20, "Camiseta Rosa");
			break;
		default:
			log.error("Produto não encontrado " + codigo);
			throw new ProdutoNaoEncontradoException();
		}
		return produto;
	}
	
}