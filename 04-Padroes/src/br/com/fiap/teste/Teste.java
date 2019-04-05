package br.com.fiap.teste;

import org.apache.log4j.Logger;
import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Teste {

	//criar o objeto para realizar o log
	private static Logger log = Logger.getLogger(Teste.class);
	
	public static void main(String[] args) {
		log.trace("Inicializando a aplica��o");
		
		//Recuperar o idioma da aplica��o
		String idioma = ConfiguracaoSingleton.getInstance().getProperty("idioma");
		
		log.info("Recuperando a configura��o de idioma: " + idioma);
		
		System.out.println(idioma);
	}
	
}



